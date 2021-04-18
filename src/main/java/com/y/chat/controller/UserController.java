package com.y.chat.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.y.chat.entity.User;
import com.y.chat.pojo.bo.RegisterBo;
import com.y.chat.service.impl.UserServiceImpl;
import com.y.chat.tool.BaseControllerResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author xxx
 * @since 2021-04-18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;


    @GetMapping("/login")
    public BaseControllerResponse login(@RequestParam("username") String username,
                                        @RequestParam("password") String password) {
        try {
            if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
                return new BaseControllerResponse().renderError("用户名和密码不能为空");
            }

            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("username", username).eq("password", password);
            User user = userService.getBaseMapper().selectOne(queryWrapper);
            if (user != null) {
                return new BaseControllerResponse().renderSuccess("登录成功");
            } else {
                return new BaseControllerResponse().renderError("登录失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseControllerResponse().renderError("登录失败");
        }
    }

    @PostMapping("/register")
    public BaseControllerResponse register(@RequestBody RegisterBo registerBo) {
        try {
            if (StringUtils.isBlank(registerBo.getUsername()) || StringUtils.isBlank(registerBo.getPassword())) {
                return new BaseControllerResponse().renderError("用户名和密码不能为空");
            }

            User u = new User();
            u.setUsername(registerBo.getUsername());
            u.setPassword(registerBo.getPassword());
            int flag = userService.getBaseMapper().insert(u);
            if (flag != 0) {
                return new BaseControllerResponse().renderSuccess("注册成功");
            } else {
                return new BaseControllerResponse().renderError("注册失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseControllerResponse().renderError("注册失败");
        }
    }
}
