package io.bgnc.SpringBootHotelBookingApplication.repository;

import io.bgnc.SpringBootHotelBookingApplication.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {

}
