package com.example.week3_nguyendangduong.backend.services;

import com.example.week3_nguyendangduong.backend.repositories.JobRepository;
import com.example.week3_nguyendangduong.backend.repositories.JobSkillRepository;
import com.example.week3_nguyendangduong.backend.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JobSkillService {
    private final JobSkillRepository repository;
    private final JobRepository jobRepository;
    private final SkillRepository skillRepository;

    @Autowired
    public JobSkillService(JobSkillRepository repository, JobRepository jobRepository, SkillRepository skillRepository) {
        this.repository = repository;
        this.jobRepository = jobRepository;
        this.skillRepository = skillRepository;
    }

}
