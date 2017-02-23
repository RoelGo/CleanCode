package com.cegekaschool.controllers;

import com.cegekaschool.domain.customer.Customer;
import com.cegekaschool.domain.customer.CustomerDTO;
import com.cegekaschool.domain.customer.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by roelg on 23/02/2017.
 */
@Named
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Inject
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void createCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }


}
