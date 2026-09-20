package com.lcwd.hotel.services.impl;

import com.lcwd.hotel.entites.Hotel;
import com.lcwd.hotel.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.repositories.HotelRepository;
import com.lcwd.hotel.services.HotelService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    HotelServiceImpl(HotelRepository hotelRepository){
        this.hotelRepository=hotelRepository;
    }

    @Override
    public Hotel createHotel(Hotel hotel) {
        String uuid = UUID.randomUUID().toString();
        hotel.setHotelId(uuid);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getSingleHotel(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow( () -> new ResourceNotFoundException("hotel " +
                " with give id not found"));
    }
}
