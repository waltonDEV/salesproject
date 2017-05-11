package com.shoe.service.impl;

import com.shoe.dao.CityDao;
import com.shoe.dao.impl.CityImplDao;
import com.shoe.mapper.CityMapper;
import com.shoe.service.ShoeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IEUser on 5/5/2017.
 */

@Service
public class ShoeImplService implements ShoeService {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private CityDao cityDao;

    public Integer add(Integer a,Integer b) {
        Integer r = a + b;
        return r;
    }

    public String getCityNameByCode(String code){

        return cityDao.getCityNameByCode(code);
    }
}
