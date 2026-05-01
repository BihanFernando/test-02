package com.example.demo.service;

import com.example.demo.dto.CityDTO;
import com.example.demo.dto.CountryDTO;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.CityRepository;
import com.example.demo.repository.CountryRepository;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepository addressRepository;
    
    @Autowired
    private CustomerRepository customerRepository;
    
    @Autowired
    private CityRepository cityRepository;
    
    @Autowired
    private CountryRepository countryRepository;
    
    // Add service methods here
}