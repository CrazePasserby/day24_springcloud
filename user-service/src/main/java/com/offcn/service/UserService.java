package com.offcn.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.offcn.dao.UserDao;
import com.offcn.pojo.Movie;
import com.offcn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RestTemplate restTemplate;

    public User getUser(Integer id){
        return userDao.getUser(id);
    }


@HystrixCommand(fallbackMethod = "fallbackMethod")
    public Map<String,Object> buyMovie(Integer id){
        Map map = new HashMap();
        User user =getUser(id);
        map.put("user", user);
        Movie movie = restTemplate.getForObject("http://ProviderMovie/getNewMovie", Movie.class);
        map.put("movie", movie);
        String port = restTemplate.getForObject("http://ProviderMovie/getPort", String.class);
        map.put("port", port);
        return map;
    }

    public Map<String,Object> fallbackMethod(Integer id){
        Map<String,Object> map = new HashMap();
        map.put("code", "error");
        return map;
    }
}
