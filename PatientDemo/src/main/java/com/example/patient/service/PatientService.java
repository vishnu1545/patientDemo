package com.example.patient.service;

import java.time.LocalDate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.example.patient.model.Patient;

@Service
public class PatientService {
	
	public Patient dataFeeder(Patient p) {
		p.setBloodG("B+");
		p.setCreditCard(123456789123L);
		p.setDob(LocalDate.of(1996, 11, 14));
		p.setEmail("vishnu@gmail.com");
		p.setName("Vishnu");
		p.setPhoneNo(9884213512L);
		p.setSugarLv(180.0);
		
		return p;
	}

	public String dataGetter(Patient p) {
		System.out.println(p);
		return "Successfully Recieved";
	}

}
