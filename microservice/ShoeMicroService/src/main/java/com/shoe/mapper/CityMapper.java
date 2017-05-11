package com.shoe.mapper;


import com.shoe.model.City;
import com.util.BaseMapper;

/**
 * Created by wenchen.liu on 5/9/2017.
 */
public interface CityMapper extends BaseMapper<City> {
    /*getCityNameByCode*/
    public String getCityNameByCode(String code);
}
