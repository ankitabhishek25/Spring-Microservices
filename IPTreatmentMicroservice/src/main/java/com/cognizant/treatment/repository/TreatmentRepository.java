
package com.cognizant.treatment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.treatment.model.TreatmentPlan;


public interface TreatmentRepository extends JpaRepository<TreatmentPlan, Integer> {

}
