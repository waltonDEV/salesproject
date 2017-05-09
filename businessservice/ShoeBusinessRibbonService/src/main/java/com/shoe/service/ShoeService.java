package com.shoe.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShoeService {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService(Integer a, Integer b) {
        logger.info("service input paras: a= " + a + ";b="+ b);

        String url = "http://SHOE-SERVICE/add?a="+a.toString()+"&b="+b.toString();
        return restTemplate.getForEntity( url, String.class).getBody();
    }

    public String addServiceFallback(Integer a, Integer b) {
        return "error1";
    }

}
