package com.myproject.service.impl;

import com.myproject.entity.Comment;
import com.myproject.mapper.CommentMapper;
import com.myproject.service.ICommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
