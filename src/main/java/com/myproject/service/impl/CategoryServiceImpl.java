package com.myproject.service.impl;

import com.myproject.entity.Category;
import com.myproject.mapper.CategoryMapper;
import com.myproject.service.ICategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
