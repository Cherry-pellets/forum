package com.myproject;

import static org.junit.Assert.assertTrue;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import com.myproject.entity.Users;
import com.myproject.service.IUsersService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.SpringVersion;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MyProjectAppliactionTest
{
    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    @Autowired
    IUsersService usersService;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Gson gson=new Gson();
        Wrapper<Users> tWrapper = new QueryWrapper<Users>().last("limit 1");
        Users one = usersService.getOne(tWrapper);
        logger.info(gson.toJson(one));
    }
    @Test
    public void checkSpringBootVersion()
    {
        String version = SpringVersion.getVersion();
        String version1 = SpringBootVersion.getVersion();
        System.out.println(version);
        System.out.println(version1);
        logger.info(version+"log");
        logger.info(version1+"log");
    }
}
