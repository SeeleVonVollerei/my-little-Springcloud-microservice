package com.seele.springcloud.dao;

import com.seele.springcloud.model.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
     UserInfo findByUsername(String username);
}
