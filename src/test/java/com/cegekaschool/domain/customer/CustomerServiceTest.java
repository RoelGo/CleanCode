package com.cegekaschool.domain.customer;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

/**
 * Created by williaam on 23/02/2017.
 */
public class CustomerServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;

    @Test
    public void addCustomer_ShouldCallCustomerRepository() throws Exception {
        customerService.addCustomer(new CustomerDataTransferObject());
        verify(customerRepository).save(new Customer());
    }

    @Test
    public void getAllCustomers() throws Exception {

    }

    @Test
    public void addGroceryToCustomer() throws Exception {

    }

}