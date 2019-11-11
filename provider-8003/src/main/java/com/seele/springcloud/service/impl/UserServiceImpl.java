package com.seele.springcloud.service.impl;

import com.seele.springcloud.dao.UserDao;
import com.seele.springcloud.entities.User;
import com.seele.springcloud.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao dao;

    @Override
    public boolean add(User user) {
        return dao.addUser(user);
    }

    @Override
    public boolean delete(Long id) {
        return dao.deleteById(id);
    }

    @Override
    public boolean update(User user) {
        return dao.update(user);
    }

    @Override
    public User get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<User> list() {
        return dao.findAll();
    }
}
