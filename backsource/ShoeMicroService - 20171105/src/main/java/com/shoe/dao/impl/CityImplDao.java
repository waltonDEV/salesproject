package com.shoe.dao.impl;

import com.shoe.dao.CityDao;
import com.shoe.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by wenchen.liu on 5/10/2017.
 */
@Repository
public class CityImplDao implements CityDao {

    @Autowired
    private CityMapper cityMapper;

    /*getCityNameByCode*/
    public String getCityNameByCode(String code){

        return cityMapper.getCityNameByCode(code);
    }

}
