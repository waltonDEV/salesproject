package com.shoe.service;

import org.apache.log4j.Logger;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by IEUser on 5/5/2017.
 */
@Service
public interface ShoeService {

    public Integer add(Integer a,Integer b);

    public String getCityNameByCode(String code);

}
