package com.y.chat.service.impl;

import com.y.chat.entity.Chat;
import com.y.chat.mapper.ChatMapper;
import com.y.chat.service.ChatService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会话表 服务实现类
 * </p>
 *
 * @author xxx
 * @since 2021-05-13
 */
@Service
public class ChatServiceImpl extends ServiceImpl<ChatMapper, Chat> implements ChatService {

}
