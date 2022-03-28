package io.bgnc.SpringBootHotelBookingApplication.service;

import io.bgnc.SpringBootHotelBookingApplication.exceptions.CustomerNotFoundException;
import io.bgnc.SpringBootHotelBookingApplication.model.Customer;
import io.bgnc.SpringBootHotelBookingApplication.repository.CustomerRepository;
import lombok.AllArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomer(){

        return customerRepository.findAll();
    }

    public Customer findCustomerById(Long id){

        return customerRepository.findCustomerById(id)
                .orElseThrow(()-> new CustomerNotFoundException("That customer is not valid "+ id));

    }

    public void deleteCustomerById(Long id){
        customerRepository.deleteCustomerById(id);
    }

    public Customer updateCustomer(Customer customer){
        return customerRepository.save(customer);
    }


}
