package com.performing.crud.h2db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class H2Runner implements CommandLineRunner{
	
	@Autowired
	private H2Connector h2Connector;

	@Override
	public void run(String... args) throws Exception {
		//h2Connector.insert();
		h2Connector.insert(new Movie(123,"ABC","XYZ"));
		h2Connector.insert(new Movie(124,"BCD","PQR"));
		h2Connector.insert(new Movie(125,"hello","world"));
		h2Connector.insert(new Movie(1000,"Tricon","Infotech"));
		//h2Connector.delete();
		//h2Connector.delete(123);
		//select
		//System.out.println(h2Connector.getMovieById(124));
		//select all
		System.out.println(h2Connector.getAllData());
		//update a row
		//h2Connector.updateRow("yela vunnav", 125);
	}

}
