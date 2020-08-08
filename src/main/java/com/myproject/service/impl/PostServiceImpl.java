package com.myproject.service.impl;

import com.myproject.entity.Post;
import com.myproject.mapper.PostMapper;
import com.myproject.service.IPostService;
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
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements IPostService {

}
