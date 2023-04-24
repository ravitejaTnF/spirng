package com.restapi.using.application.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "movies-list")
@Component
public class MovieServiceConfiguration {
	
	private String movieName;
	private String heroName;
	private String heroineName;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getHeroineName() {
		return heroineName;
	}
	public void setHeroineName(String heroineName) {
		this.heroineName = heroineName;
	}
	
	
}
