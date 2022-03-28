package io.bgnc.SpringBootHotelBookingApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Hotel implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hotelName;
    private String hotelAddress;
    private String hotelImageUrl;

    @Column(nullable = false,updatable = false)
    private String hotelCode;

    private String hotelPhone;



}
