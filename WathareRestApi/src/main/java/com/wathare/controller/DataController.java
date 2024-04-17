package com.wathare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wathare.service.DataService;

@CrossOrigin
@RestController
@RequestMapping("api")
public class DataController {
	
	@Autowired
	private DataService dService;
	
	@GetMapping("/data")
	public ResponseEntity<?> Getdata() {
		return ResponseEntity.ok(dService.getAll());
	}

}
