package com.shoe.db;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created by wenchen.liu on 5/10/2017.
 */
@Configuration
public class PageHelperPlugin {

    public PageHelper getPageHelper(){
        //分页插件,插件无非是设置mybatis的拦截器
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
