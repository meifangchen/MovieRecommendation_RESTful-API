package movie;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieGenerateController {

	@RequestMapping(value = "/generation", method = RequestMethod.POST)
	public Movie movieRecomemder(@RequestBody Movie payload) {
		if(payload != null) {
			MovieData.movies.add(new Movie(payload.getTitle(), payload.getGenre(), payload.getYear()));
			return new Movie(payload.getTitle(), payload.getGenre(), payload.getYear());
		}
		return new Movie(null, null, 0);
	}
}
