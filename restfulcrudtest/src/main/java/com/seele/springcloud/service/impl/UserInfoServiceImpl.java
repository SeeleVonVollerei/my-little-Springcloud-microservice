package com.seele.springcloud.service.impl;

import com.seele.springcloud.dao.UserInfoDao;
import com.seele.springcloud.model.UserInfo;
import com.seele.springcloud.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}
