package com.lcwd.hotel.controller;

import com.lcwd.hotel.entites.Hotel;
import com.lcwd.hotel.services.HotelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    private final HotelService hotelService;

    HotelController(HotelService hotelService){
        this.hotelService=hotelService;
    }

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.createHotel(hotel));
    }


    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> createHotel(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.getSingleHotel(hotelId));
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel(){
        return ResponseEntity.ok(hotelService.getAllHotel());
    }


}
