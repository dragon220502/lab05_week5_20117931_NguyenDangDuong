package com.example.week3_nguyendangduong.backend.services;

import com.example.week3_nguyendangduong.backend.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
    @Autowired
    SkillRepository repository;

}
