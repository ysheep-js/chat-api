package com.y.chat.service.impl;

import com.y.chat.entity.ChatUser;
import com.y.chat.mapper.ChatUserMapper;
import com.y.chat.service.ChatUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xxx
 * @since 2021-04-18
 */
@Service
public class ChatUserServiceImpl extends ServiceImpl<ChatUserMapper, ChatUser> implements ChatUserService {

}
