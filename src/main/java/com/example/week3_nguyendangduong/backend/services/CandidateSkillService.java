package com.example.week3_nguyendangduong.backend.services;

import com.example.week3_nguyendangduong.backend.repositories.CandidateRepository;
import com.example.week3_nguyendangduong.backend.repositories.CandidateSkillRepository;
import com.example.week3_nguyendangduong.backend.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CandidateSkillService {
    CandidateSkillRepository repository;
    CandidateRepository candidateRepository;
    SkillRepository skillRepository;

    @Autowired
    public CandidateSkillService(CandidateSkillRepository repository, CandidateRepository candidateRepository, SkillRepository skillRepository) {
        this.repository = repository;
        this.candidateRepository = candidateRepository;
        this.skillRepository = skillRepository;
    }

}
