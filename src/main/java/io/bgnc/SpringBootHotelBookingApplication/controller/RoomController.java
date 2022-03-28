package io.bgnc.SpringBootHotelBookingApplication.controller;

import io.bgnc.SpringBootHotelBookingApplication.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
@AllArgsConstructor
public class RoomController {

    private final RoomService roomService;
}
