package com.y.chat.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.y.chat.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 会话表
 * </p>
 *
 * @author xxx
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Chat extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 会话名称
     */
    private String name;

    /**
     * 会话头像
     */
    private String avatar;

    /**
     * 会话规则
     */
    private String rule;

    /**
     * 会话类型：1-单人会话，2-多人会话
     */
    private Integer chatType;

    /**
     * 会话发起者id
     */
    private Integer chatFromUserId;

    /**
     * 会话接收者id
     */
    private Integer chatToUserId;


}
