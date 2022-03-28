package io.bgnc.SpringBootHotelBookingApplication.service;

import io.bgnc.SpringBootHotelBookingApplication.model.Hotel;
import io.bgnc.SpringBootHotelBookingApplication.repository.HotelRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class HotelService {

    private final HotelRepository hotelRepository;


    public Hotel addHotel(Hotel hotel){

        hotel.setHotelCode(UUID.randomUUID().toString());
        return hotelRepository.save(hotel);

    }





}
