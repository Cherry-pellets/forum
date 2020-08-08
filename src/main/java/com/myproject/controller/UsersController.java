package com.myproject.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import com.myproject.entity.Users;
import com.myproject.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Ash
 * @since 2020-07-20
 */
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    IUsersService usersService;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @RequestMapping("/getuser")
    public String getUser(){
        Gson gson=new Gson();
        Wrapper<Users> tWrapper = new QueryWrapper<Users>().last("limit 1");
        Users one = usersService.getOne(tWrapper);
//        Long sasdfasd = redisTemplate.getExpire("sasdfasd");
        int a=1/0;
//        System.out.println(sasdfasd);
        return gson.toJson(one);
    }
}
