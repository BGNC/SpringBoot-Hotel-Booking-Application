package io.bgnc.SpringBootHotelBookingApplication.repository;

import io.bgnc.SpringBootHotelBookingApplication.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {

    public void deleteHotelById(Long id);

    public Optional<Hotel> findHotelById(Long id);
}
