package com.cognizant.treatment.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.treatment.proxy.Packageee;



@FeignClient(url="http://localhost:8081/treatmentoffer",name="client1")
public interface IptoClient  {
	
	@GetMapping("/{name}/{packageName}")
	public Packageee findByNameandid(@RequestHeader(name="Authorization") String token,@PathVariable String name,@PathVariable String packageName );

}
