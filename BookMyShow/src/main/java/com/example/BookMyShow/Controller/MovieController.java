package com.example.BookMyShow.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class MovieController {
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
