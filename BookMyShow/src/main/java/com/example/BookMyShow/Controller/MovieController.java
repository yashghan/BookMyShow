package com.example.BookMyShow.Controller;

import com.example.BookMyShow.Entity.Cinema;
import com.example.BookMyShow.Entity.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/")
public class MovieController {
    @GetMapping("/search")
    public ResponseEntity<Optional<Movie>> searchShow(
            @RequestParam String cityName,
            @RequestParam Date movieDate,
            @RequestParam String movieTitle
    ) {
        List<Movie> movieList = showTimeService.searchShow(cityName, movieDate, movieTitle);
        List<Cinema> theatreNames = showTimeService.getTheatreNamesForShowTimes(showTimes);

        Map<String, Object> response = new HashMap<>();
        response.put("showTimes", movieList);
        response.put("theatreNames", theatreNames);

        return (ResponseEntity<Optional<Movie>>) response;
    }

    @GetMapping("/show")
    public ResponseEntity<List<Show>> getAllShow(){
        return movieService.fetchAllShows();
    }
    @GetMapping("/show/{id}")
    public ResponseEntity<Optional<Show>> getProductById(@PathVariable Long id){
        Optional<Show> show = movieService.fetchProductById(id).getBody();
        if (show.isPresent()) {
                return ResponseEntity.ok(show);
        }
        else {
            return ResponseEntity.notFound().build();
        }

    }





}
