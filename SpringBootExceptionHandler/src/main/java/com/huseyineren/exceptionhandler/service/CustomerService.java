package com.huseyineren.exceptionhandler.service;

import com.huseyineren.exceptionhandler.entity.Customer;
import com.huseyineren.exceptionhandler.exception.CustomerNotFoundException;
import com.huseyineren.exceptionhandler.exception.CustomerNotNullException;
import com.huseyineren.exceptionhandler.repositroy.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
        if (customer.getName().isBlank() || customer.getName().isEmpty()) {
            throw new CustomerNotNullException("Customer name must be not null");
        }
        return customerRepository.save(customer);

    }

    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long customerId) {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        Customer customer = optionalCustomer.orElseThrow(() -> new CustomerNotFoundException(customerId + " "));
        return customer;/
    }

    public void deleteCustomerById(Long customerId) {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        Customer customer = optionalCustomer.orElseThrow(() -> new CustomerNotFoundException(customerId.toString()));

        customerRepository.deleteById(customerId);
    }

}
