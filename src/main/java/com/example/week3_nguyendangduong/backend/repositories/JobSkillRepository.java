package com.example.week3_nguyendangduong.backend.repositories;

import com.example.week3_nguyendangduong.backend.entity.JobSkill;
import com.example.week3_nguyendangduong.backend.ids.JobSkill_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkill_ID> {
}