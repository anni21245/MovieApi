package com.example.MoviesApi.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*") // Allow any origin for testing purposes
@RequestMapping("/api/v1/movies")
public class MoviesController {

    // Injecting MovieService (currently commented out until you define it)
     @Autowired
     private MovieService service;
           
    @GetMapping

    public ResponseEntity<List<Movie>> getMovies() {
        // Uncomment and modify this once MovieService is defined
        return new ResponseEntity<List<Movie>>(service.findAllMovies(), HttpStatus.OK);
        
        // Temporary response until service is implemented
     //   return new ResponseEntity<>("All Movies", HttpStatus.OK);
    }
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(service.findMovieByImdbId(imdbId), HttpStatus.OK); 
}
}