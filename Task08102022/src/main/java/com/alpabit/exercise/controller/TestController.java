package com.alpabit.exercise.controller;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpabit.exercise.Service.DecimalToString;
import com.alpabit.exercise.dto.AppsReq;
import com.alpabit.exercise.dto.AppsRes;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	DecimalToString decimalToString;

	@PostMapping("/decimal")
	public ResponseEntity testConvert(@RequestBody AppsReq req) {
		
		AppsRes response = decimalToString.convertToString(req);
		
		return ResponseEntity.ok(response);
	}
	
}
