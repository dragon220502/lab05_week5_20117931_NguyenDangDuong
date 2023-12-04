package com.example.week3_nguyendangduong.backend.repositories;

import com.example.week3_nguyendangduong.backend.entity.CandidateSkill;
import com.example.week3_nguyendangduong.backend.ids.CandidateSkill_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkill_ID> {
}