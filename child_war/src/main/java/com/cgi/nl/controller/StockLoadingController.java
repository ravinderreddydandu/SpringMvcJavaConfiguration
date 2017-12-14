package com.cgi.nl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockLoadingController {

	@CrossOrigin(origins = "http://localhost:8000")
	@RequestMapping(method = RequestMethod.GET, path = "/ping", produces = "application/json")
	public ResponseEntity<String> getAllConstraintDetails() {
		return new ResponseEntity<>(" Welcome to CGI stocks ", HttpStatus.OK);
	}

}
