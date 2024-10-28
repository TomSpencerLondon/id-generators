package org.example.idgenerators;

import org.example.idgenerators.entities.Customer;
import org.example.idgenerators.entities.Employee;
import org.example.idgenerators.repos.CustomerRepository;
import org.example.idgenerators.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IdgeneratorsApplicationTests {

    @Autowired
    EmployeeRepository er;

    @Autowired
    CustomerRepository cr;

    @Test
    void contextLoads() {
        Employee employee = new Employee();
        employee.setName("John");

        er.save(employee);

    }

    @Test
    void createCustomer() {
        Customer customer = new Customer();
        customer.setName("John");
        customer.setEmail("john@john.com");

        cr.save(customer);

    }

}
