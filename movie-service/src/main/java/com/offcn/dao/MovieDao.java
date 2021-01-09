package com.offcn.dao;

import com.offcn.pojo.Movie;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDao {

    public Movie getNewMovie(){
        Movie movie = new Movie();
        movie.setId(11);
        movie.setMovieName("绿皮火车");
        return  movie;
    }

}
