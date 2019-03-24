package movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieRecomemderController {
	public static int movieRecomemdCounter = 0;
	@RequestMapping("/recommendation")
	public List<Movie> movieRecomemder(@RequestParam(value = "genre", required=false) String genre) {
		
		List<Movie> recommendResult = new ArrayList<>();
		Random rand = new Random();
		int movieIndex = rand.nextInt(MovieData.movies.size());
		if(genre == null || genre.length() == 0) {
			
			recommendResult.add(new Movie(MovieData.movies.get(movieIndex).getTitle(), MovieData.movies.get(movieIndex).getGenre(),
					MovieData.movies.get(movieIndex).getYear()));
			
		} else {
			recommendResult = MovieData.getMovieByGenre(genre);
		}
		movieRecomemdCounter += recommendResult.size();
		return recommendResult;
	}
}
