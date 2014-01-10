package com.vmware.moviebase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class MovieServiceTest {
	
	private MovieService movieService;
	
	@BeforeMethod
	public void setUp() {
		movieService = new MovieService("VMware Movie"); 	
	}
	
	@Test
	public void addMovieGetAmount()
	{
		//subject under test
		movieService.addMovie(new Movie("VMware movie#1"));
		movieService.addMovie(new Movie("VMware movie#2"));
		assertEquals(movieService.getCount(),2);
	}
	
	@Test
	public void addOneMovieGetAmount(){
		movieService.addMovie(new Movie("VMware movie#1"));
		assertEquals(movieService.getCount(),1);
	}
	
	@Test
	public void getAmountNoMovies() {
		assertEquals(movieService.getCount(),0);
	}
	
	@Test
	public void removeMovie(){
		movieService.addMovie(new Movie("VMware movie#1"));
		movieService.addMovie(new Movie("VMware movie#2"));
		try {
			movieService.removeByName("VMware movie#1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(movieService.getCount(),1);
	}
	
	@Test
	public void removeEmptyMovie()
	{
		
	    try {
		   movieService.removeByName("VMware movie#1");
	       fail("Was expecting an exception in removeEmptyMovie() ");
		}
		catch (MovieException e){
			assertEquals(e.getMessage(),"There are no movies in the service");
		}
	
	}
	
	public void removeMovieNotExist()
	{
		movieService.addMovie(new Movie("VMware movie#1"));
		movieService.addMovie(new Movie("VMware movie#2"));
		try {
			movieService.removeByName("titanic");
			fail("Was expecting an exception in removeMovieNotExist() ");
		} catch (MovieException e) {
			assertEquals(e.getMessage(),"The movie does not exist in the service");
		}
		
	}

}
