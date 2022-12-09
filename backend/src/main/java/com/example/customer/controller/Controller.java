package com.example.customer.controller;

import com.example.customer.entity.Customer;
import com.example.customer.entity.ResponseStatus;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class Controller {

    //    RestController : json+ ajax 데이터 전송만 가능함
    //    정상적으로 데이터가 전송/수정/삭제 되었는지 확인 메세지 > ResponseEntity<>
    //    데이터 주고 받는 : req,res

    //    ResponseEntity Example : 데이터 전송 확인
    //    데이터타입에 ResponseEntity<타입> : 타입은 출력 메세지
    //    리턴타입 return new ResponseEntity<>("메시지",HttpStatus.OK);
    //    hello 주소를 실행하면 정상처리 되었음을 확인
    //    Customer cus 타입
    //    new Customer(); 생성자
//    @GetMapping("/hello")
//    public ResponseEntity<Boolean> hello(){
//        //<>안에는 빈값일수도 있음
//        //return new ResponseEntity<>("Data Completed...", HttpStatus.OK); 원하는 데이터 타입으로 보낼수 있음
//        //return new ResponseEntity<Integer>(200, HttpStatus.OK);
//        return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK); //Boolean 값은 이런식으로
//    }

//    @GetMapping("/hello") //예외처리
//    public ResponseEntity<String> hello(){
//        int age = -1;
//        if( age < 0 ){ //Bad
//            return new ResponseEntity<>("Invalid",HttpStatus.BAD_REQUEST);
//        }
//       return new ResponseEntity<>("OK",HttpStatus.OK);
//    }


    //삭제 : pk(숫자),메세지 같이 출력 : Map<> 써줘야 같이 쓸 수 있음
//    @GetMapping("/hello")
//    public ResponseEntity<Map<Integer,String>>hello(){
//        Map<Integer,String> map = new HashMap<>();
//        map.put(200,"Transfer OK");
//        return new ResponseEntity<>(map, HttpStatus.OK);
//    }



    //code ,msg -> 객체 => model(상태정보 저장)
    //ResponseStatus  (entity 에 만든 클래스 파일)
//    @GetMapping("/hello")
//    public ResponseEntity<ResponseStatus>hello(){
//        ResponseStatus rs = new ResponseStatus();
//        rs.setStatusCode(200);
//        rs.setStatusMsg("성공");
//        return new ResponseEntity<>(rs,HttpStatus.OK);
//    }

    //    ResponseEntity Example



    @Autowired
    CustomerService customerService;

    //고객 전체 리스트
    @GetMapping("/customers")
    public List<Customer> getCustomer(){
        return customerService.getCustomers();
    }

    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @DeleteMapping("/customer/{customerID}")
    public ResponseEntity<ResponseStatus> deleteCustomer(@PathVariable Long customerID){
        ResponseStatus rs = new ResponseStatus();
        rs.setStatusCode(200);
        rs.setStatusMsg("Customer Delete Completed");

        customerService.deleteCustomer(customerID);
        return new ResponseEntity<>(rs,HttpStatus.OK);
    }
}
