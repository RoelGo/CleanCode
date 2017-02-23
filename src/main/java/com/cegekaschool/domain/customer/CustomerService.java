package com.cegekaschool.domain.customer;

import com.cegekaschool.domain.Mapper;
import com.cegekaschool.domain.groceries.Grocery;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by roelg on 23/02/2017.
 */
@Named
public class CustomerService {
    @Inject
    CustomerRepository customerRepository;

    @Inject
    Mapper mapper;

    public void addCustomer(CustomerDataTransferObject customer) {
        customerRepository.save(mapper.mapToCustomer(customer));
    }

    public Iterable<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public void addGroceryToCustomer(Grocery grocery, String customerName) {
        Customer customerToAddTo = customerRepository.findOne(customerName);
        customerToAddTo.addGrocery(grocery);
    }
}
