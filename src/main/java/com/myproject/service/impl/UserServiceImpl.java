package com.myproject.service.impl;

import com.myproject.entity.User;
import com.myproject.mapper.UserMapper;
import com.myproject.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Diamond
 * @since 2020-08-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
