package me.korakrit.playground.backendspringbootpostgresql.customers;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
        Customer customer = new Customer();
        //customer.setCustomerName(resultSet.getString("customerName"));

        return customer;
    }
}
