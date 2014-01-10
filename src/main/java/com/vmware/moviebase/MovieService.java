package com.vmware.moviebase;
import java.util.*;

public class MovieService {
	
	
	private int count = 0;

	public MovieService(String title) {
		// TODO Auto-generated constructor stub
	}

	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		count++;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	public void removeByName(String string) throws MovieException {
		if(count == 0)
		throw new MovieException("There are no movies in the service");
		
		--count;
		
	}

}
