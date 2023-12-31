package com.example.week3_nguyendangduong.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "company")
@Data @AllArgsConstructor @NoArgsConstructor
public class Company {
    @Id
    private long id;
    private String name;
    private String about;
    private String phone;
    private String webURL;
    private String email;

    @OneToOne
    private Address address;

    @OneToMany(mappedBy = "company")
    private List<Job> jobs;
}
