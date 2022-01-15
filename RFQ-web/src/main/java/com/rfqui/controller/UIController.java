package com.rfqui.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rfqui.client.AuthClient;
import com.rfqui.client.InsuranceCl;
import com.rfqui.client.IptClient;
import com.rfqui.client.IptoClient;
import com.rfqui.model.AuthResponse;
import com.rfqui.model.InitiateClaim;
import com.rfqui.model.InsurerDetail;
import com.rfqui.model.Packageee;
import com.rfqui.model.PatientDetail;
import com.rfqui.model.PatientDetailProxy;
import com.rfqui.model.TreatmentPlanProxy;
import com.rfqui.model.UserLoginCredential;
import com.rfqui.model.UserToken;

@Controller
public class UIController {

	@Autowired
	private AuthClient authclient;

	@Autowired
	private IptoClient ipto;

	@Autowired
	private InsuranceCl ic;

	@Autowired
	private IptClient iy;

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public ModelAndView getLogin() {
		return new ModelAndView("login");
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView postLogin(UserLoginCredential user, HttpServletRequest request) {
		UserToken res = null;
		try {
			res = authclient.login(user);
		} catch (Exception e) {
			return new ModelAndView("login");
		}
		request.getSession().setAttribute("token", res.getAuthToken());
		AuthResponse authResponse = authclient.verifyToken("Bearer " + res.getAuthToken());
		ModelAndView modelandview = new ModelAndView("dashboard");
		modelandview.addObject("username", authResponse.getName());
		return viewAllPackages(request);

	}

	@RequestMapping(path = "/viewallpackages", method = RequestMethod.GET)
	public ModelAndView viewAllPackages(HttpServletRequest request) {
		String token = (String) request.getSession().getAttribute("token");
		AuthResponse authResponse = authclient.verifyToken("Bearer " + token);
		if (authResponse.isValid()) {

			List<Packageee> pckgresponse = ipto.getAllPackages("Bearer " + token);
			System.out.println(pckgresponse);
			ModelAndView modelandview = new ModelAndView("viewallpackages");
			modelandview.addObject("list", pckgresponse);
			modelandview.addObject("name", authResponse.getName());
			return modelandview;
		} else {
			return new ModelAndView("login");
		}

	}

	@RequestMapping(path = "/viewallinsurer", method = RequestMethod.GET)
	public ModelAndView viewAllInsurer(HttpServletRequest request) {
		String token = (String) request.getSession().getAttribute("token");
		AuthResponse authResponse = authclient.verifyToken("Bearer " + token);
		if (authResponse.isValid()) {
		List<InsurerDetail> insuResponse = ic.getAllInsurer("Bearer " + token);
		ModelAndView modelandview = new ModelAndView("viewallinsurer");
		modelandview.addObject("list", insuResponse);

		return modelandview;
		}else {
			return new ModelAndView("registerpatient");
		}

	}

	@RequestMapping(path = "/viewallpatient", method = RequestMethod.GET)
	public ModelAndView viewAllPatient(HttpServletRequest request) {
		String token = (String) request.getSession().getAttribute("token");
		AuthResponse authResponse = authclient.verifyToken("Bearer " + token);
		if (authResponse.isValid()) {
			List<PatientDetailProxy> patresponse = iy.getAllPatient("Bearer " + token);
			ModelAndView modelandview = new ModelAndView("viewallpatient");
			modelandview.addObject("list", patresponse);
			return modelandview;
		} else {
			return new ModelAndView("registerpatient");
		}

	}

	@RequestMapping(path = "/registerpatient", method = RequestMethod.GET)
	public String registerPatient(@ModelAttribute("patient") PatientDetail patient) {
		// PatientDetail thepatient=new PatientDetail();
		// ModelAndView modelandview = new ModelAndView("registerpatient");
		// modelandview.;
		return "registerpatient";

	}
	@RequestMapping(path = "/claim", method = RequestMethod.GET)
	public ModelAndView claimInsurance(@RequestParam("id") int id  ,HttpServletRequest request,@ModelAttribute("insurer") InitiateClaim insurer) {
		String token = (String) request.getSession().getAttribute("token");
		AuthResponse authResponse = authclient.verifyToken("Bearer " + token);
		if (authResponse.isValid()) {
			List<PatientDetailProxy> patresponse = iy.getAllPatient("Bearer " + token);
			PatientDetailProxy proxy=null;
			for (PatientDetailProxy p : patresponse) {
				if(p.getId()==id) {
					proxy=p;
					break;
				}
				
			}
			ModelAndView modelandview = new ModelAndView("claim");
			modelandview.addObject("object", proxy);
			return modelandview;
		} else {
			
			return new ModelAndView("registerpatient");
		}

		
		

	}

	
	@RequestMapping(path = "/savePatient", method = RequestMethod.POST)
	public ModelAndView savePatient(HttpServletRequest request, @ModelAttribute("patient") PatientDetail patient,
			ModelMap map) {
		String token = (String) request.getSession().getAttribute("token");
		AuthResponse authResponse = authclient.verifyToken("Bearer " + token);
		if (authResponse.isValid()) {
			TreatmentPlanProxy trpr = iy.createUser1("Bearer " + token, patient);
			ModelAndView modelAndView = new ModelAndView("treatmentplan");
			// modelAndView.addObject(trpr);
			map.addAttribute("treatment", trpr);
			return modelAndView;
		} else {
			return new ModelAndView("registerpatient");
		}

	}
	@RequestMapping(path = "/showBalance", method = RequestMethod.POST)
	public ModelAndView showBalance(HttpServletRequest request,@ModelAttribute("insurer") InitiateClaim insurer,
		ModelMap map) {
		String token = (String) request.getSession().getAttribute("token");
		AuthResponse authResponse = authclient.verifyToken("Bearer " + token);
		if (authResponse.isValid()) {
		System.out.println(insurer.getAilment());
		double result=ic.getClaim("Bearer " + token,insurer);
		
		ModelAndView modelAndView=new ModelAndView("balance");
		map.addAttribute("bal",result);
		
		return modelAndView;
		}else {
			return new ModelAndView("viewallinsurer");
		}
	}
	
	@RequestMapping(path = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpSession session) {
		
		
		session.setAttribute("token", null);
		
		session.invalidate();
		
		
		
		
	
		
		ModelAndView modelAndView=new ModelAndView("login");
		
		
		return modelAndView;
	}
	
	

}
