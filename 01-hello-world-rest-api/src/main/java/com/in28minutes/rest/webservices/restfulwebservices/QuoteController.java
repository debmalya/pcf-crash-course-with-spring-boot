package com.in28minutes.rest.webservices.restfulwebservices;

import org.deb.quote.Quote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

	@GetMapping(path = "/health")
	public String helloWorld() {
		return "OK";
	}

	@GetMapping("/quote")
	public String getQuote(){
		return new Quote().getQuote();
	}
	
}
