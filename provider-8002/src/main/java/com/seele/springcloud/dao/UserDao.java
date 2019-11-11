package com.seele.springcloud.dao;

import com.seele.springcloud.entities.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserDao {
     boolean addUser(User user);

    boolean deleteById(Long id);

     boolean update(User user);

     User findById(Long id);

     List<User> findAll();

}
