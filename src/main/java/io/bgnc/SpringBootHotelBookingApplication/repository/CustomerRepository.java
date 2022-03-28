package io.bgnc.SpringBootHotelBookingApplication.repository;

import io.bgnc.SpringBootHotelBookingApplication.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {


    void deleteCustomerById(Long id);

    Optional<Customer> findCustomerById(Long id);
}
