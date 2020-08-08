package com.myproject.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.myproject.entity.Users;
import com.myproject.mapper.UsersMapper;
import com.myproject.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Ash
 * @since 2020-07-20
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
