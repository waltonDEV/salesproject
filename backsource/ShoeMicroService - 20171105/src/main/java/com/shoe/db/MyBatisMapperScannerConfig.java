package com.shoe.db;

import java.util.Properties;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * MyBatis扫描接口，使用的tk.mybatis.spring.mapper.MapperScannerConfigurer <br/>
 * 如果你不使用通用Mapper，可以改为org.xxx...
 *
 */
@Configuration
// 由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        // MapperScannerConfigurer
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        //
        mapperScannerConfigurer.setBasePackage("com.shoe.mapper");

//        //设置通用mapper的属性
//        // 这里要特别注意，不要把BaseMapper放到 basePackage 中，也就是不能同其他Mapper一样被扫描到。
//        Properties properties = new Properties();
////        properties.setProperty("mappers", BaseMapper.class.getName());
//        properties.setProperty("notEmpty", "false");
//        properties.setProperty("IDENTITY", "MYSQL");
//        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }
}
