package com.example.week3_nguyendangduong.backend.entity;

import com.example.week3_nguyendangduong.backend.enums.SkillType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity(name = "skill")
@Data @NoArgsConstructor @AllArgsConstructor
public class Skill {
    @Id
    private long id;
    private String skillName;
    private String skillDescription;

    @Enumerated
    private SkillType skillType;

    @OneToMany(mappedBy = "skill")
    private List<JobSkill> jobSkills;
}
