package com.spring.mms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mms.entity.Movie;
import com.spring.mms.exception.MovieNotFoundByIdException;
import com.spring.mms.service.MovieService;

@Controller
public class MovieController {
    
	private final MovieService movieService;

	public MovieController(MovieService movieService) {
		super();
		this.movieService = movieService;
	}
	
	
	@PostMapping("/add-movies")
	public String addMovies(Movie movie) {
		movieService.addMovies(movie);
		return "redirect:index.jsp";
	}
	
	@GetMapping("/display-movies")
	public String findAllMovies(Model model) {
		List<Movie> movie= movieService.findAllmovies();
		model.addAttribute("movies", movie);
		return "display-movie.jsp";
	}
	
	@GetMapping("/delete-movies")
	public String deleteMovie(@RequestParam("movie_id") int movieId) throws MovieNotFoundByIdException {
		movieService.deleteMovie(movieId);
		return "redirect:display-movies";
	}
	
	@GetMapping("/update-movies")
	public String editMovie(@RequestParam("movie_id") int movieId,Model model) throws MovieNotFoundByIdException {
	Movie movie=movieService.findMovie(movieId);
	model.addAttribute("movies", movie);
	return "update-movie.jsp";
	}
	
	@PostMapping("/update-movies")
	public String updateMovie(@ModelAttribute Movie movie) throws MovieNotFoundByIdException {
		movieService.finalUpdate(movie);
		return "redirect:display-movies";
	}
	
}
