package com.cognizant.treatment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.treatment.model.PatientDetail;


public interface DetailsRepository extends JpaRepository<PatientDetail, Integer>{

}
