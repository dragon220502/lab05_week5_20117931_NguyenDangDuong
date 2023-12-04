package com.example.week3_nguyendangduong.backend.repositories;


import com.example.week3_nguyendangduong.backend.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
public interface AddressRepository extends JpaRepository<Address, Long> {
}