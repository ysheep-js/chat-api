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
public class Chat extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String avatar;

    private String rule;


}
