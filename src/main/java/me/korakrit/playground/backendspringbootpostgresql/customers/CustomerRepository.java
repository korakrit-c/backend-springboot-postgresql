package me.korakrit.playground.backendspringbootpostgresql.customers;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {

}
