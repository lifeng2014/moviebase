package com.vmware.moviebase;

import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class MovieServiceTest {
	
	@Test
	public void addMovieGetAmount()
	{
		MovieService movieService = new MovieService("VMware Movie"); //subject under test
		movieService.addMovie(new Movie("VMware movie#1"));
		movieService.addMovie(new Movie("VMware movie#2"));
		assertEquals(movieService.getCount(),2);
	}
	
	@Test
	public void addOneMovieGetAmount(){}
	
	@Test
	public void getAmountNoMovies() {}

}
