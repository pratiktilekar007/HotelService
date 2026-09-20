package com.lcwd.hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException{

  public ResourceNotFoundException(String msg)
    {
        super(msg);
    }
}
