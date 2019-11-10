package com.seele.springcloud.consumer.controller;

import com.seele.springcloud.consumer.remote.UserServiceRemote;
import com.seele.springcloud.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class UserControllerConsumer {

    private static final String REST_URL_PREFIX = "http://userServiceProvider";

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserServiceRemote userServiceRemote;

    @RequestMapping(value = "/consumer/User/add")
    public boolean add(User user) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/User/add", user, Boolean.class);
    }

    @RequestMapping(value = "/consumer/User/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        restTemplate.delete(REST_URL_PREFIX + "/User/delete/" + id);
    }

    @RequestMapping(value = "/consumer/User/update")
    public void update(User user) {
        restTemplate.put(REST_URL_PREFIX + "/User/update", user);
    }

    @RequestMapping(value = "/consumer/User/get/{id}")
    public User get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/User/get/" + id, User.class);
    }

    @RequestMapping(value = "/consumer/User/list")
    public List<User> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/User/list", List.class);
    }

    @RequestMapping(value = "/consumer/user/add")
    public boolean addUser(User user) {
        return userServiceRemote.addUser(user);
    }

    @RequestMapping(value = "/consumer/user/delete/{id}")
    public boolean deleteUser(@PathVariable("id") Long id) {
        return userServiceRemote.deleteUser(id);
    }

    @RequestMapping(value = "/consumer/user/update", method = RequestMethod.PUT)
    public boolean updateUser(User user) {
        return userServiceRemote.updateUser(user);
    }

    @RequestMapping(value = "consumer/user/get/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userServiceRemote.getUser(id);
    }


    @RequestMapping(value = "/consumer/user/list")
    public List<User> listUser() {
        List<User> list = userServiceRemote.findAllUser();
        return list;
    }
}
