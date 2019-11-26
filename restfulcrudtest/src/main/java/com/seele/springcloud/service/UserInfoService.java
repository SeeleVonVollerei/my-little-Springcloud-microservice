package com.seele.springcloud.service;

import com.seele.springcloud.model.UserInfo;

public interface UserInfoService {
    UserInfo findByUsername(String username);
}
