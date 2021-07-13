package me.korakrit.playground.backendspringbootpostgresql.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/customers", produces = "application/json")
    @CrossOrigin(origins = "*")
    public List<Customer> getCustomerList(){
        return customerService.getCustomerList();
    }

}
