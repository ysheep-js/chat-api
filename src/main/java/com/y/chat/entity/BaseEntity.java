package com.y.chat.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Description:
 * @Author: dh
 * @Date: 2021/4/18 17:09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @TableField(fill = FieldFill.INSERT)
    private Integer createId;

    @TableField(fill = FieldFill.UPDATE)
    private Integer updateId;

    @TableLogic
    private Integer delete;

    private Integer state;
}
