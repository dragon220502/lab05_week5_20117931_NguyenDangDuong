package com.example.week3_nguyendangduong.backend.services;

import com.example.week3_nguyendangduong.backend.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

}
