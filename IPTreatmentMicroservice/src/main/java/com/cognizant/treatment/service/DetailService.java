package com.cognizant.treatment.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.treatment.client.IptoClient;
import com.cognizant.treatment.model.PatientDetail;
import com.cognizant.treatment.model.TreatmentPlan;

import com.cognizant.treatment.proxy.Packageee;
import com.cognizant.treatment.proxy.PatientDetailProxy;
import com.cognizant.treatment.proxy.TreatmentPlanProxy;
import com.cognizant.treatment.repository.DetailsRepository;
import com.cognizant.treatment.repository.TreatmentRepository;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service

public class DetailService {
	public DetailService(DetailsRepository repository, TreatmentRepository trrepo, IptoClient client) {
		super();
		this.repository = repository;
		this.trrepo = trrepo;
		this.client = client;
	}

	@Autowired
	DetailsRepository repository;
	@Autowired
	TreatmentRepository trrepo;
	@Autowired
	IptoClient client;

	/*
	 * @Autowired TreatmentRepository treatmentRepository;
	 */

	public TreatmentPlanProxy saveOrder(String token, PatientDetail patientdetail) {
		 log.info("saveOrder--->go through");
			log.info("saveOrder  starts");
		Packageee p1 = client.findByNameandid(token, patientdetail.getAilment(),
				patientdetail.getTreatmentpackagename());
		  log.debug("Package {}", p1);
		LocalDate date = LocalDate.parse(patientdetail.getTreatmentcommencementdate());

		LocalDate returnvalue = date.plusDays(p1.getDuration() * 7);
		// System.out.println(returnvalue.toString());

		TreatmentPlan treatmentplan = new TreatmentPlan();

		treatmentplan.setCost(p1.getCost());
		treatmentplan.setPackagename(patientdetail.getTreatmentpackagename());
		if(p1.getPackageName().equalsIgnoreCase("Package1"))
			treatmentplan.setSpecialist(p1.getAilment().getDoctors().get(0).getName());
		else
			treatmentplan.setSpecialist(p1.getAilment().getDoctors().get(1).getName());
		treatmentplan.setTestdetails(p1.getTestDetails());
		treatmentplan.setTreatmentcommencementdate(patientdetail.getTreatmentcommencementdate());

		treatmentplan.setTreatmentEndDate(returnvalue.toString());
		patientdetail.setTreatmentplan(treatmentplan);
		treatmentplan.setPatientdetail(patientdetail);
		TreatmentPlan tdm = trrepo.save(treatmentplan);
		TreatmentPlanProxy tr = new TreatmentPlanProxy();
		tr.setId(tdm.getId());
		tr.setPackagename(tdm.getPackagename());
		tr.setCost(tdm.getCost());
		tr.setSpecialist(tdm.getSpecialist());
		tr.setTestdetails(tdm.getTestdetails());
		tr.setTreatmentcommencementdate(tdm.getTreatmentcommencementdate());
		tr.setTreatmentEndDate(tdm.getTreatmentEndDate());
		log.info("saveOrder ends");
		return tr;
	}
	
	public List<PatientDetailProxy> getAllPatientDetails(String token) {
		
		  List<PatientDetail> patientdetails=new ArrayList<>();
	        repository.findAll()
	                .forEach(patientdetails::add);
	        
	        List<PatientDetailProxy> pp=new ArrayList<>();
	        for(PatientDetail p:patientdetails) {
	        	PatientDetailProxy pr=new PatientDetailProxy();
	        	pr.setId(p.getId());
	        	pr.setAge(p.getAge());
	        	pr.setAilment(p.getAilment());
	        	pr.setName(p.getName());
	        	pr.setTreatmentpackagename(p.getTreatmentpackagename());
	        	pr.setTreatmentcommencementdate(p.getTreatmentcommencementdate());
	        	pp.add(pr);
	        }
		return pp;
		
	}

	

}
