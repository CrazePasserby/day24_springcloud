package com.offcn.service;

import com.offcn.error.MovieServiceFeignCircuitBreaker;
import com.offcn.pojo.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//调用电影服务
@FeignClient(value = "ProviderMovie" ,fallback = MovieServiceFeignCircuitBreaker.class)
public interface MovieServiceFeign {


    @GetMapping("getNewMovie")  //与调用http接口映射路径保持着一致
    public Movie getNewMovie();//方法的参数和返回类型 与http接口保持一致

    @GetMapping("getPort")
    public String getPort();
}
