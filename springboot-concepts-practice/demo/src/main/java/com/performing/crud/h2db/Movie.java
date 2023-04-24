package com.performing.crud.h2db;

public class Movie {
	private long id;
	private String name;
	private String heroname;
	
	public Movie() {};
	
	public Movie(long id, String name, String heroname) {
		super();
		this.id = id;
		this.name = name;
		this.heroname = heroname;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeroname() {
		return heroname;
	}
	public void setHeroname(String heroname) {
		this.heroname = heroname;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", heroname=" + heroname + "]";
	}
	
}
