package com.restapi.using.application.properties;

public class Movie {
	private String movieName;
	private String heroName;
	private String heroineName;
	
	//constructor
	public Movie(String movieName, String heroName, String heroineName) {
		super();
		this.movieName = movieName;
		this.heroName = heroName;
		this.heroineName = heroineName;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getHeroName() {
		return heroName;
	}

	public String getHeroineName() {
		return heroineName;
	}

}
