package com.myproject;

import com.myproject.utils.CodeGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

/**
 * Hello world!
 *
 */
@MapperScan("com.myproject.mapper")
@SpringBootApplication
public class MyProjectAppliaction
{

    public static void main( String[] args )
    {
//        Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
//        System.out.println( "Hello World!" );
//        String version = SpringVersion.getVersion();
//        String version1 = SpringBootVersion.getVersion();
//        System.out.println(version);
//        System.out.println(version1);
//        logger.info(version+"log");
//        logger.info(version1+"log");
//        CodeGenerator.startGenerator();

        SpringApplication.run(MyProjectAppliaction.class, args);

    }
}
