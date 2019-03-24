package movie;

import java.util.ArrayList;
import java.util.List;

public class MovieData {
	public static List<Movie> movies = new ArrayList<Movie>();

	public MovieData() {

		Movie movie1 = new Movie("More than Blue", "tragedy", 2018);
		Movie movie2 = new Movie("Five Feet Apart", "comedy", 2017);
		Movie movie3 = new Movie("Us", "Thrill", 2019);
		Movie movie4 = new Movie("Killer", "Thrill", 2015);
		Movie movie5 = new Movie("Forgot everything", "tragedy", 2014);
		Movie movie6 = new Movie("My friend,my dog", "comedy", 2013);
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		movies.add(movie4);
		movies.add(movie5);
		movies.add(movie6);
	}
	
	public static List<Movie> getMovieByGenre(String genre) {
		List<Movie> result = new ArrayList<>();
		for(Movie movie: movies) {
			if(movie.getGenre().equals(genre)) {
				result.add(movie);
			}
		}
		return result;
	}

}
