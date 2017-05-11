package com.shoe.db;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * Created by wenchen.liu on 5/10/2017.
 */
@Configuration
public class XmlPathScannerPlugin {

    public Resource[] getResource(){

        Resource[] resource = null;
        try {
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            // scane mapper.xml
            resource = resolver.getResources("classpath:mapper/*.xml");
        } catch (Exception e) {
            throw new RuntimeException("sqlSessionFactory init fail",e);
        }
        return resource;
    }
}
