package com.offcn.controller;

import com.offcn.pojo.Movie;
import com.offcn.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Value("${server.port}")
    String port;
    @Autowired
    private MovieService movieService;
    @GetMapping("getNewMovie")
    public Movie getNewMovie(){

        return  movieService.getNewMovie();
    }
    @GetMapping("getPort")
    public String getPort(){
        return port;
    }
}
