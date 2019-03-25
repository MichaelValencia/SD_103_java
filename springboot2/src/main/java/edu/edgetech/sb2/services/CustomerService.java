package edu.edgetech.sb2.services;

import edu.edgetech.sb2.domain.Customer;
import edu.edgetech.sb2.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private edu.edgetech.sb2.repositories.CustomerRepository CustomerRepository;

    public Iterable<Customer>listAllCustomers(){return CustomerRepository.findAll();}

    public Customer getCustomerById(Integer id){
        Optional<Customer> oCustomer = CustomerRepository.findById(id);
        return oCustomer.orElse(null);
    }

    public Customer saveCustomer(Customer customer){
        CustomerRepository.save(customer);
        return customer;
    }
    public void DeleteCustomer(Integer id){
        Optional<Customer>cutomer
    }
}
