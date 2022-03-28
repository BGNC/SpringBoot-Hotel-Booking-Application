package io.bgnc.SpringBootHotelBookingApplication.repository;

import io.bgnc.SpringBootHotelBookingApplication.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {

}
