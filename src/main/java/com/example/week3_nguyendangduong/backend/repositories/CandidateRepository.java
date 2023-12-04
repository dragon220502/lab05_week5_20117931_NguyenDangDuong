package com.example.week3_nguyendangduong.backend.repositories;

import com.example.week3_nguyendangduong.backend.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "Candidate")
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}