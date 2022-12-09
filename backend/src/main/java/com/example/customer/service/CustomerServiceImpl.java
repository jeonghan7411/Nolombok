package com.example.customer.service;

import com.example.customer.entity.Customer;
import com.example.customer.repositoty.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

//CustomerService 에 상속을 받아서 사용
//실제 동작하는 곳

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public ArrayList<Customer> getCustomers() {
        //타입이 부모가 아니면 명시적 형변환 List 쓸 경우는 안해도 됨
        return (ArrayList<Customer>)customerRepository.findAll();
    }


    @Override
    public boolean getCustomerOne(Long customerID) {
        customerRepository.findById(customerID).orElse(null);
        return true;
    }

    @Override
    public Customer saveCustomer(Customer customer) {

        return customerRepository.save(customer);
    }

    @Override
    public boolean deleteCustomer(Long customerID) {
        customerRepository.deleteById(customerID);
        return true;
    }

    @Override
    public boolean updateCustomer(Customer customer, Long CustomerID) {
        //넘어온 자료를 저장하기 위한 Model (entity) 을 초기화 후
        //자료 저장을 하기 위해서는 getter,setter 를 이용해서 임시 메모리에 저장
        //저장할 때는 get()을 이용해서 가져와서  -> set()을 이용해서 저장
        //db에 저장
        //데이터 타입 변수명 = 생성자
        Customer cus = new Customer();
        cus.setId(CustomerID);
        cus.setUsername(customer.getUsername());
        cus.setPasswd(customer.getPasswd());
        cus.setAddress(customer.getAddress());
        cus.setEmail(customer.getEmail());
        cus.setContact(customer.getContact());

        customerRepository.save(cus);

        return false;
    }


}
