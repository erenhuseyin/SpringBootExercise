package com.huseyineren.exceptionhandler.repositroy;


import com.huseyineren.exceptionhandler.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
