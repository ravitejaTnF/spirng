package com.performing.crud.h2db;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class H2Connector {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//Inserting a row
	private String INSERT_QUERY = "insert into movies(id,name,heroname) values(?,?,?);";
	public void insert(Movie movie) {
		jdbcTemplate.update(INSERT_QUERY,movie.getId(),movie.getName(),movie.getHeroname());
		System.out.println("Insertion done!!");
	}
	
	//Deleting a row
	private String DELETE_QUERY = "delete from movies where id = ?;";
	public void delete(long id) {
		jdbcTemplate.update(DELETE_QUERY,id);
		System.out.println("Deletion done!!");
	}
	
	//getting specific rows data
	private String SELECT_SPECIFIC_QUERY = "select * from movies where id = ?;";
	public Movie getMovieById(long id) {
		return jdbcTemplate.queryForObject
		(
				SELECT_SPECIFIC_QUERY, 
				new BeanPropertyRowMapper<>(Movie.class),
				id
		);
	}
	
	//getting all rows data
	private String SELECT_ALL_QUERY = "select * from movies;";
	public List<Movie> getAllData() {
		return jdbcTemplate.query
				(
						SELECT_ALL_QUERY, 
						new BeanPropertyRowMapper<>(Movie.class)
				);
	}
	
	//updating a row
	private String UPDATE_QUERY = "update movies set name = ? where id = ?;";
	public void updateRow(String name,long id) {
		jdbcTemplate.update(UPDATE_QUERY,name,id);
	}
			
}
