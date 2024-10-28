package org.example.idgenerators.repos;

import org.example.idgenerators.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
