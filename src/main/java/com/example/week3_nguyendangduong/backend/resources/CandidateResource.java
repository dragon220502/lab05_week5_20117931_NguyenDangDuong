package com.example.week3_nguyendangduong.backend.resources;

import com.example.week3_nguyendangduong.backend.services.CandidateService;

public class CandidateResource {
    private final CandidateService service;

    public CandidateResource(CandidateService service) {
        this.service = service;
    }
}
