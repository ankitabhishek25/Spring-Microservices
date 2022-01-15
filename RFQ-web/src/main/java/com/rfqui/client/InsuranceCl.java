package com.rfqui.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.rfqui.model.InitiateClaim;
import com.rfqui.model.InsurerDetail;

@FeignClient(url="http://localhost:8087/insurance",name="Insurance")
public interface InsuranceCl {

	@GetMapping("/GetAllInsurerDetail")
	public List<InsurerDetail> getAllInsurer(@RequestHeader(name="Authorization") String token);
	
	@PostMapping("/InitiateClaim")
	public double getClaim(@RequestHeader(name="Authorization") String token,@RequestBody InitiateClaim iName);
}
