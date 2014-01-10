package com.vmware.moviebase;
import java.util.*;

public class MovieService {
	
	
	private int count = 0;
	private List<Movie> movies = new ArrayList<Movie>();
 
	public MovieService(String title) {
		
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
		count++;
	}

	public int getCount() {
		return count;
	}

	public void removeByName(String name) throws MovieException {
		if(count == 0)
		throw new MovieException("There are no movies in the service");
	
		for (Movie m: movies){
			if(m.getName().equals(name)){
				movies.remove(m);
				count--;
				break; //why not return here?
			}
		}
		
	}

}
