package com.example.week3_nguyendangduong.backend.ids;

import com.example.week3_nguyendangduong.backend.entity.Candidate;
import com.example.week3_nguyendangduong.backend.entity.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.Objects;

@Data @NoArgsConstructor @AllArgsConstructor
public class CandidateSkill_ID implements Serializable {
    private Candidate candidate;
    private Skill skill;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidateSkill_ID that = (CandidateSkill_ID) o;
        return Objects.equals(candidate, that.candidate) && Objects.equals(skill, that.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candidate, skill);
    }
}
