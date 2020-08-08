package com.myproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * @author Diamond
 * @since 2020-08-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "postId", type = IdType.AUTO)
    private Integer postId;

    @TableField("postTitle")
    private String postTitle;

    @TableField("postContent")
    private String postContent;

    @TableField("postScore")
    private Integer postScore;

    @TableField("postUserId")
    private Integer postUserId;

    @TableField("postPhoto")
    private String postPhoto;

    private Integer highlight;

    @TableField("postTime")
    private LocalDateTime postTime;

    @TableField("postType")
    private Integer postType;

    private Integer top;

    @TableField("postCategoryId")
    private Integer postCategoryId;


}
