package com.example.week3_nguyendangduong.backend.services;

import com.example.week3_nguyendangduong.backend.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CandidateService {
    @Autowired
    CandidateRepository candidateRepository;

}
