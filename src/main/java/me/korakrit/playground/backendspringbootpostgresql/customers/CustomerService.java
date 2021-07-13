package me.korakrit.playground.backendspringbootpostgresql.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomerList(){
        List<Customer> customer = new ArrayList<>();
        customerRepository.findAll().forEach(customer::add);
        return customer;
    }
}
