package com.example.week3_nguyendangduong;

import com.example.week3_nguyendangduong.backend.entity.Address;
import com.example.week3_nguyendangduong.backend.entity.Candidate;
import com.example.week3_nguyendangduong.backend.entity.Experiences;
import com.example.week3_nguyendangduong.backend.repositories.AddressRepository;
import com.example.week3_nguyendangduong.backend.repositories.CandidateRepository;
import com.example.week3_nguyendangduong.backend.repositories.ExperiencesRepository;
import com.neovisionaries.i18n.CountryCode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

@SpringBootTest
class Lab05Week05NguyenDangDuongApplicationTests {


    @Autowired
    CandidateRepository candidateRepository;
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    ExperiencesRepository experiencesRepository;

    @Test
    void addCandidate(){
        for (int i = 1; i <= 1000; i++) {
            Address address = new Address(
                    "Street %s".formatted(i),"City %s".formatted(i), CountryCode.VN,
                    new Random().nextInt(10)+"", new Random().nextInt(10)+""
            );
            addressRepository.save(address);

            Candidate candidate = new Candidate(
                    LocalDate.now(),
                    "%s@gmail.com".formatted(i),
                    "Nguyen Van %s".formatted(i),
                    new Random().nextInt(10)+"",
                    address,
                    new ArrayList<>(), new ArrayList<>()
            );
            candidateRepository.save(candidate);

            for(int y = 0; y<3; y++){
                Experiences experiences = new Experiences(
                        LocalDate.now(), LocalDate.now(), "companyName",
                        "user", "workDescription",
                        candidate
                );
                experiencesRepository.save(experiences);
            }
        }
    }
    @Test
    void getCountryCodeBy(){
        CountryCode countryCode = CountryCode.getByCode(CountryCode.VN.getAlpha2());
        Assertions.assertNotNull(countryCode);
    }

}
