package com.rfqui.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.rfqui.model.Packageee;

@FeignClient(url="http://localhost:8081/treatmentoffer",name="treatment")
public interface IptoClient  {

	@GetMapping("/IPTreatmentPackages")
	public List<Packageee> getAllPackages(@RequestHeader(name="Authorization") String token ) ;

}
