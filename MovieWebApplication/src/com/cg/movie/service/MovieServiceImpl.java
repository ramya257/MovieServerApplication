package com.cg.movie.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.bean.Category;
import com.cg.movie.bean.Movies;
import com.cg.movie.dao.MovieDao;

@Transactional
@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	MovieDao movieDao;

	@Override
	public List<Movies> getAllMovies() {
		// TODO Auto-generated method stub
		return movieDao.getAllMovies();
	}

	@Override
	public void addMovie(Movies movie) {
		// TODO Auto-generated method stub
		
		movieDao.addMovie(movie);
		
	}

	@Override
	public List<Movies> searchMovie(String movieCategory) {
		// TODO Auto-generated method stub
		return movieDao.searchMovie(movieCategory);
	}

	@Override
	public List<Category> getCategoryList() {
		// TODO Auto-generated method stub
		return movieDao.getCategoryList();
	}

	@Override
	public List<Movies> deleteMovie(int moviesId,String movieCategory) {
		// TODO Auto-generated method stub
		return movieDao.deleteMovie(moviesId, movieCategory);
	}

	@Override
	public void updateMovie(Movies movie) {
		// TODO Auto-generated method stub
		movieDao.updateMovie(movie);
	}

}
