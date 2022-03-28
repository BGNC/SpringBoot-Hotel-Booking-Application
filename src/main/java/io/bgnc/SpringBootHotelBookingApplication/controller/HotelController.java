package io.bgnc.SpringBootHotelBookingApplication.controller;

import io.bgnc.SpringBootHotelBookingApplication.service.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
@AllArgsConstructor
public class HotelController {

    private final HotelService hotelService;



}
