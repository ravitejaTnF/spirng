package com.restapi.using.application.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	
	@Autowired
	private MovieServiceConfiguration movieServiceConfigration;
	
	@RequestMapping("/movieslist")
	public MovieServiceConfiguration getMovies() {
		return movieServiceConfigration;
	}
	
}
