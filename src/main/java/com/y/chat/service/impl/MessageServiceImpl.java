package com.y.chat.service.impl;

import com.y.chat.entity.Message;
import com.y.chat.mapper.MessageMapper;
import com.y.chat.service.MessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 信息表 服务实现类
 * </p>
 *
 * @author xxx
 * @since 2021-05-13
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {

}
