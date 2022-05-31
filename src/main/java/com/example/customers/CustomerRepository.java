package com.example.customers;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CustomerRepository extends ReactiveCrudRepository<CustomersApplication.Customer, Integer> {
}
