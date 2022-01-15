package com.cognizant.treatment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
@EnableFeignClients
public class IpTreatmentMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpTreatmentMicroserviceApplication.class, args);
	}
	@SuppressWarnings({ "rawtypes", "unchecked"})
	@Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        MyFilter myFilter = new MyFilter();
        filterRegistrationBean.setFilter(myFilter);
        return filterRegistrationBean;
    }

}
