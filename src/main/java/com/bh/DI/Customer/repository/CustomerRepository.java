package com.bh.DI.Customer.repository;

import com.bh.DI.Customer.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Repository
public class CustomerRepository {
    private final ConcurrentMap<Long, Customer> customerMap = new ConcurrentHashMap<>();

    public List<Customer> findAll(){
        return new ArrayList<>(customerMap.values());
    }

    public Customer findOne(Long customerId){
        return customerMap.get(customerId);
    }

    public Customer save(Customer customer){
        return customerMap.put(customer.getId(), customer);
    }

    public void delete(Long customerId){
        customerMap.remove(customerId);
    }
}
