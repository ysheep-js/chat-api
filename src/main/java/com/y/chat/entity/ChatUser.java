package com.y.chat.entity;

import com.y.chat.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author xxx
 * @since 2021-04-18
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ChatUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer chatId;

    private Integer userId;

    /**
     * 1-群主 0-群员
     */
    private Integer isModerator;


}
