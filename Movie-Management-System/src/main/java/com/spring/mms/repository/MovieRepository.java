package com.spring.mms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mms.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
