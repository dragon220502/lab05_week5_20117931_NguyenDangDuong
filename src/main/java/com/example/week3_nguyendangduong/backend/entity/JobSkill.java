package com.example.week3_nguyendangduong.backend.entity;

import com.example.week3_nguyendangduong.backend.enums.SkillLevel;
import com.example.week3_nguyendangduong.backend.ids.JobSkill_ID;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Objects;

@Entity(name = "jobSkill")
@IdClass(JobSkill_ID.class)
@Data @NoArgsConstructor @AllArgsConstructor
public class JobSkill {
    @Id
    @ManyToOne
    private Job job;

    @Id
    @ManyToOne
    private Skill skill;

    @Enumerated
    private SkillLevel skillLevel;

    private String moreInfo;
    public JobSkill(Job job, Skill skill) {
        this.job = job;
        this.skill = skill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobSkill jobSkill = (JobSkill) o;
        return Objects.equals(job, jobSkill.job) && Objects.equals(skill, jobSkill.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job, skill);
    }
}
