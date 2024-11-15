package com.spring.mms.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.mms.entity.Movie;
import com.spring.mms.exception.MovieNotFoundByIdException;
import com.spring.mms.repository.MovieRepository;

@Service
public class MovieService {
	
	private final MovieRepository movieRepository;

	public MovieService(MovieRepository movieRepository) {
		super();
		this.movieRepository = movieRepository;
	}

	public void addMovies(Movie movie)  {
		movieRepository.save(movie);
		
	}

	public List<Movie> findAllmovies() {
		
		return movieRepository.findAll();
	}

	public void deleteMovie(int movieId) throws MovieNotFoundByIdException {
	Movie movie=this.findMovie(movieId);
		movieRepository.delete(movie);
		
	}

	public Movie findMovie(int movie) throws MovieNotFoundByIdException {
		return movieRepository.findById(movie)
				.orElseThrow(()->new MovieNotFoundByIdException("Invalid data", "display-movies"));
	}

	public void finalUpdate(Movie movie) throws MovieNotFoundByIdException {
		this.findMovie(movie.getMovieId());
		movieRepository.save(movie);
		
	}

}
