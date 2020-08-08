package com.myproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Diamond
 * @since 2020-08-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "categoryId", type = IdType.AUTO)
    private Integer categoryId;

    @TableField("categoryName")
    private String categoryName;

    @TableField("categoryUserId")
    private Integer categoryUserId;


}
