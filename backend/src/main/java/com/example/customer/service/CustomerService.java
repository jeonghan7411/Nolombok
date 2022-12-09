package com.example.customer.service;

import com.example.customer.entity.Customer;

import java.util.ArrayList;

public interface CustomerService {
    //본체 x -> {} x  통일성을 위해 사용함 이름만 정하는 곳 (틀을 만드는 곳)

    //전체 가져오기
    public ArrayList<Customer> getCustomers();

    //한명만 가져오기 : 보여줄값 true/false 로 보여주기위해 boolean 형식으로 사용해보기
    //보여줄 값이없다면 void, 아이디 등등 내용을 보여주려면 entity 여기서는 (Customer) 사용하면 됨
    public boolean getCustomerOne(Long customerID);

    //저장하기  결과를 보여줄것이 없다면 void 아니면 entity
    public Customer saveCustomer(Customer customer);


    //삭제하기
    public boolean deleteCustomer(Long CustomerID);

    //수정하기
    public boolean updateCustomer(Customer customer,Long CustomerID);


}
