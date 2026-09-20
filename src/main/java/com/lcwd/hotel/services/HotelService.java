package com.lcwd.hotel.services;

import com.lcwd.hotel.entites.Hotel;

import java.util.List;

public interface HotelService {

    //create
    Hotel createHotel(Hotel hotel);

    //get all
    List<Hotel> getAllHotel();

    //get single
    Hotel getSingleHotel(String hotelId);

}
