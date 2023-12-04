package com.example.week3_nguyendangduong.backend.repositories;

import com.example.week3_nguyendangduong.backend.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface SkillRepository extends JpaRepository<Skill, Long> {
}