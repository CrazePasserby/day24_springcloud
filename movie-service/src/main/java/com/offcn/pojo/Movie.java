package com.offcn.pojo;

import java.io.Serializable;

public class Movie implements Serializable {
    private Integer id;
    private String MovieName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }
}
