package com.cegekaschool.domain.customer;

import com.cegekaschool.domain.Mapper;
import com.cegekaschool.domain.loyaltycard.LoyaltyCardDataTransferObject;
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

    @Mock
    private Mapper map;


    @Test
    public void addCustomer_ShouldCallCustomerRepository() throws Exception {
        customerService.addCustomer(new CustomerDataTransferObject(new LoyaltyCardDataTransferObject("bar",20),"xan"));
        Customer customer= map.mapToCustomer(new CustomerDataTransferObject(new LoyaltyCardDataTransferObject("bar",20),"xan"));
        verify(customerRepository).save(customer);
    }

    @Test
    public void getAllCustomers() throws Exception {

    }

    @Test
    public void addGroceryToCustomer() throws Exception {

    }

}