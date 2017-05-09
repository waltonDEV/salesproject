package com.shoe.web;

import com.shoe.service.ShoeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoeBusinessController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private ShoeService shoeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@RequestParam Integer a, @RequestParam Integer b) {

        logger.info("input paras: a= " + a + ";b="+ b);

        return shoeService.addService(a, b);
    }

}