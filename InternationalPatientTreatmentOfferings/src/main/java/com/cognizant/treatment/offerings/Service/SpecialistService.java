package com.cognizant.treatment.offerings.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.treatment.offerings.Entity.SpecialistDetails;
import com.cognizant.treatment.offerings.Repository.SpecialistdetailsRepository;
import com.cognizant.treatment.offerings.model.SpecialistDetailsModel;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class SpecialistService {
	@Autowired
	SpecialistdetailsRepository repository;

	public List<SpecialistDetailsModel> getAllSpecialist() {
		  log.info("getAllSpecialist()---go through");
			log.info("getAllSpecialist()---starts");
		List<SpecialistDetails> specialists = new ArrayList<>();
		repository.findAll().forEach(specialists::add);
		List<SpecialistDetailsModel> doc=new ArrayList<>();
		for(SpecialistDetails sdm:specialists) {
			SpecialistDetailsModel  se=new SpecialistDetailsModel();
			se.setId(sdm.getId());
			se.setName(sdm.getName());
			se.setContactNo(sdm.getContactNo());
			se.setExperiences(sdm.getExperiences());
			se.setAreaofExperties(sdm.getAreaofExperties());
			doc.add(se);
		}
		return doc;
	}
	

	/*public SpecialistDetails addSpecialist(SpecialistDetails specialists) {

		SpecialistDetails specialist = repository.save(specialists);
		return specialist;
	}*/
	
	/*public void saveOrUpdate(SpecialistDetails specialists) {
		repository.save(specialists);
	}*/
}
