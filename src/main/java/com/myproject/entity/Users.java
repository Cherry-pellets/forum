package com.myproject.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Ash
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户的id（学生为学号，教师为工号）
     */
    @TableId("user_Id")
    private String userId;

    /**
     * 密码
     */
    private String password;

    /**
     * 登录辨识码
     */
    private String token;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 账号创建时间
     */
    @TableField("createDate")
    private LocalDateTime createDate;

    /**
     * 上次登录时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 账号类型（学生，教师）
     */
    private String idType;


}
