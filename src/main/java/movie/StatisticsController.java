package movie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatisticsController {

	@RequestMapping("/statistics")
	public String getStatistics() {
		return "Total number of recommendations returned: " + MovieRecomemderController.movieRecomemdCounter + "\n"
				+ "Total number of movie titles within the system: " + MovieData.movies.size();

	}
}
