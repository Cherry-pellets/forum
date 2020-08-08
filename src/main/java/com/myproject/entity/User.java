package com.myproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "userId", type = IdType.AUTO)
    private Integer userId;

    private String password;

    @TableField("userName")
    private String userName;

    private Integer sex;

    private Integer credit;

    private String telephone;

    @TableField("profilePhoto")
    private String profilePhoto;

    @TableField("briefIntro")
    private String briefIntro;

    private String location;

    private Integer type;

    private LocalDate birthday;


}
