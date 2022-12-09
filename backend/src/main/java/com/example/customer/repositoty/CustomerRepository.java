package com.example.customer.repositoty;

import com.example.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

//JPARepository   db기능 입력 출력 수정 삭제
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
