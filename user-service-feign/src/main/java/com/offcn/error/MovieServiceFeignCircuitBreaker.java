package com.offcn.error;

import com.offcn.pojo.Movie;
import com.offcn.service.MovieServiceFeign;
import org.springframework.stereotype.Component;

@Component
public class MovieServiceFeignCircuitBreaker implements MovieServiceFeign {
    @Override
    public Movie getNewMovie() {
        Movie movie = new Movie();
        movie.setId(1-1);
        movie.setMovieName("无此电影");
        return movie;
    }

    @Override
    public String getPort() {
        return "error";
    }
}
