package com.restapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.using.application.properties.Movie;

@RestController
public class MoviesController {
	
	@RequestMapping("/movies")
	public List<Movie> getMoviesList(){
		return Arrays.asList
				(
						new Movie("Dasara","Nani","keerthy"),
						new Movie("Pathan","Sharukh","Deepika"),
						new Movie("Adipurush","Prabhas","Kriti")
				);
	}
}
