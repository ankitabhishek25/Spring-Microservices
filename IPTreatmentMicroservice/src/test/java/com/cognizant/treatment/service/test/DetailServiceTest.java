package com.cognizant.treatment.service.test;

import static org.mockito.ArgumentMatchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.treatment.client.IptoClient;
import com.cognizant.treatment.model.PatientDetail;
import com.cognizant.treatment.model.TreatmentPlan;
import com.cognizant.treatment.proxy.AilmentModel;
import com.cognizant.treatment.proxy.Packageee;
import com.cognizant.treatment.proxy.PatientDetailProxy;
import com.cognizant.treatment.proxy.SpecialistDetailsModel;
import com.cognizant.treatment.proxy.TreatmentPlanProxy;
import com.cognizant.treatment.repository.DetailsRepository;
import com.cognizant.treatment.repository.TreatmentRepository;
import com.cognizant.treatment.service.DetailService;

@ExtendWith(MockitoExtension.class)
class DetailServiceTest {
	@Mock
	DetailsRepository repository;
	@Mock
	TreatmentRepository trrepo;
	@Mock
	IptoClient client;

	@Test
	public void saveOrdertest() {
		DetailService detail = new DetailService(repository, trrepo, client);
		Packageee p1 = new Packageee();
		p1.setId(1);
		p1.setCost(2000);
		p1.setDuration(5);
		p1.setPackageName("packageName");
		p1.setTestDetails("testDetails");
		AilmentModel am = new AilmentModel();
		am.setId(1);
		am.setName("name");
		List<SpecialistDetailsModel> doctors = new ArrayList<>();
		doctors.add(new SpecialistDetailsModel());
		am.setDoctors(doctors);
		p1.setAilment(am);
		TreatmentPlan treatmentplan = new TreatmentPlan();
		treatmentplan.setCost(1000);
		treatmentplan.setId(1);
		treatmentplan.setPackagename("packagename");
		treatmentplan.setPatientdetail(new PatientDetail());
		treatmentplan.setSpecialist("specialist");
		treatmentplan.setTestdetails("testdetails");
		treatmentplan.setTreatmentcommencementdate("2020-03-05");
		treatmentplan.setTreatmentEndDate("2020-03-05");
		when(client.findByNameandid(any(), any(), any())).thenReturn(p1);
		when(trrepo.save(any())).thenReturn(treatmentplan);
		TreatmentPlan tp = new TreatmentPlan(1, "packagename", "testdetails", 2300, "specialist", "2020-01-02",
				"2020-03-05", new PatientDetail());
		PatientDetail pd = new PatientDetail(1, "name", 20, "ailment", "2020-01-02", "2020-03-05", tp);
		TreatmentPlanProxy tr = detail.saveOrder("token", pd);
		assertEquals(tr.getId(), 1);

	}

	@Test
	public void getAllPatientDetailstest() {
		DetailService detail2 = new DetailService(repository, trrepo, client);
		PatientDetailProxy pat = new PatientDetailProxy();
		List<PatientDetail> proxy = new ArrayList<>();
		PatientDetail e = new PatientDetail();
		e.setId(1);
		e.setName("name");
		e.setAge(20);
		e.setAilment("ailment");
		e.setTreatmentcommencementdate("treatmentcommencementdate");
		e.setTreatmentpackagename("treatmentpackagename");
		TreatmentPlan tp = new TreatmentPlan(1, "packagename", "testdetails", 2300, "specialist", "2020-01-02",
				"2020-03-05", new PatientDetail());
		e.setTreatmentplan(tp);
		
		proxy.add(e);
		pat.setAge(20);
		pat.setAilment("ailment");
		pat.setId(1);
		pat.setName("name");
		pat.setTreatmentcommencementdate("2020-01-02");
		pat.setTreatmentpackagename("treatmentpackagename");
		when(repository.findAll()).thenReturn(proxy);
		List<PatientDetailProxy> pp= 
		detail2.getAllPatientDetails("token");
		
		assertEquals(1, pp.get(0).getId());

	}

}
