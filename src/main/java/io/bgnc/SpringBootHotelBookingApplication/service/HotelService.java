package io.bgnc.SpringBootHotelBookingApplication.service;

import io.bgnc.SpringBootHotelBookingApplication.exceptions.HotelNotFoundException;
import io.bgnc.SpringBootHotelBookingApplication.model.Hotel;
import io.bgnc.SpringBootHotelBookingApplication.repository.HotelRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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


    public List<Hotel> getAllHotel(){
        return hotelRepository.findAll();
    }


    public Hotel updateHotel(@PathVariable Long id){
        return hotelRepository.save(hotelRepository.getById(id));
    }


    public Hotel findHotelById(@PathVariable Long id){
        return hotelRepository.findHotelById(id)
                .orElseThrow(()-> new HotelNotFoundException("Sorry entered "+id+" could not found any hotel please make sure"));

    }


    public void deleteHotel(Long id){
            hotelRepository.deleteHotelById(id);

    }





}
