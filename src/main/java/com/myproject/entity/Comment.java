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
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "commentId", type = IdType.AUTO)
    private Integer commentId;

    @TableField("commentUserId")
    private Integer commentUserId;

    @TableField("commentToId")
    private Integer commentToId;

    @TableField("commentToUserId")
    private Integer commentToUserId;

    @TableField("commentContent")
    private String commentContent;

    @TableField("commentPostId")
    private Integer commentPostId;

    @TableField("commentTime")
    private LocalDateTime commentTime;

    private Integer adopt;


}
