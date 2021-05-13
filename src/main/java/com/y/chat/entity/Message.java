package com.y.chat.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.y.chat.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 信息表
 * </p>
 *
 * @author xxx
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Message extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 会话id唯一标识符
     */
    private String messageId;

    /**
     * 会话id
     */
    private Integer chatId;

    /**
     * 发送者用户id
     */
    private Integer fromUserId;

    /**
     * 接收者用户id
     */
    private Integer toUserId;

    /**
     * 内容
     */
    private String content;

    /**
     * 消息类型：1-普通消息
     */
    private Integer massageType;

    /**
     * 发送时间
     */
    private LocalDateTime sendTime;


}
