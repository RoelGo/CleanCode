package com.cegekaschool.controllers;

import com.cegekaschool.domain.customer.Customer;
import com.cegekaschool.domain.customer.CustomerDataTransferObject;
import com.cegekaschool.domain.customer.CustomerService;
import com.cegekaschool.domain.groceries.Grocery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public void createCustomer(@RequestBody CustomerDataTransferObject customer) {
        customerService.addCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Customer> getCustomers() {

        return customerService.getAllCustomers();
    }


    @RequestMapping(path = "/groceries",method = RequestMethod.POST)
    @ResponseBody
    public void addGrocerieToCustomer(
            @RequestParam(name = "item")Grocery grocery,
            @RequestParam(name = "customerName") String customerName){
        customerService.addGroceryToCustomer(grocery,customerName);
    }


}
