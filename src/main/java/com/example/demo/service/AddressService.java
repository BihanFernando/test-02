package com.example.demo.service;

import com.example.demo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepository addressRepository;
    
    // Add service methods here
}
