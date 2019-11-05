package com.example.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.patient.model.Patient;
import com.example.patient.service.PatientService;

@RestController
public class PatientController {
	@Autowired
	PatientService los;
	@GetMapping("/get/patient")
	public Patient get() {
		Patient p=new Patient();
		p=los.dataFeeder(p);
		return p;
	}
	@PostMapping("/post/patient")
	public String post(@RequestBody Patient p) {
	return los.dataGetter(p); }
}
