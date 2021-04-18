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
public class ChatContent extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer chatId;

    private String comment;

    private Integer userId;


}
