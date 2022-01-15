package com.cognizant.treatment.offerings.Repository;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.treatment.offerings.Entity.Ailment;

public interface AilmentRepository extends CrudRepository<Ailment, Integer> {

}
