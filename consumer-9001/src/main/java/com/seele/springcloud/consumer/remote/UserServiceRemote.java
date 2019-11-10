package com.seele.springcloud.consumer.remote;

import com.seele.springcloud.consumer.feigncfg.FeignConfiguration;
import com.seele.springcloud.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "userServiceProvider",configuration = FeignConfiguration.class)
public interface UserServiceRemote {
    @RequestMapping(value = "/User/add",method = RequestMethod.POST)
    boolean addUser(User user);

    @RequestMapping(value = "/User/delete/{id}",method = RequestMethod.DELETE)
   boolean deleteUser(@PathVariable("id") Long id);

    @RequestMapping(value = "/User/update",method = RequestMethod.PUT)
    boolean updateUser(User user);

    @GetMapping("User/get/{id}")
    User getUser(@PathVariable("id") Long id);

    @GetMapping("/User/list")
    List<User> findAllUser();

}
