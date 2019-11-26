package com.seele.springcloud.service;

import com.seele.springcloud.entities.User;

import java.util.List;

public interface UserService {
     boolean add(User user);

     boolean delete(Long id);

     boolean update(User user);

     User get(Long id);

     List<User> list();
}
