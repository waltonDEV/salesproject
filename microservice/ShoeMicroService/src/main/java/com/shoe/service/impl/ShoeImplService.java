package com.shoe.service.impl;

import com.shoe.mapper.CityMapper;
import com.shoe.service.ShoeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IEUser on 5/5/2017.
 */

@Service
@Transactional
public class ShoeImplService implements ShoeService {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private CityMapper cityMapper;

    public Integer add(Integer a,Integer b) {
        Integer r = a + b;
        return r;
    }

    public String getCityNameByCode(String code){

        return cityMapper.getCityNameByCode(code);
    }
}
