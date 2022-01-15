package com.cognizant.authorization.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.authorization.model.UserInternationalPatientTreatment;

@Repository
public class UsersInternationalPatientTreatment {
	
	private List<UserInternationalPatientTreatment> list;

	public UsersInternationalPatientTreatment() {
		super();
		this.list = new ArrayList<UserInternationalPatientTreatment>();
		list.add(new UserInternationalPatientTreatment("Admin","Admin","Admin"));
		list.add(new UserInternationalPatientTreatment("1","password","Bibek"));
		list.add(new UserInternationalPatientTreatment("2","pass","Somu"));
		list.add(new UserInternationalPatientTreatment("3","foo","Yasin"));
	}
	
	public UserInternationalPatientTreatment findById(String id)
	{
		for(UserInternationalPatientTreatment u:list)
		{
			if(u.getUserid().equals(id))
			{
				return u;
			}
		}
	 return null;
	}
	
	

}
