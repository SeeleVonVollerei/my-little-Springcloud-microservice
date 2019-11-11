package com.seele.springcloud.controller;


import com.seele.springcloud.entities.ResponseBody;
import com.seele.springcloud.entities.User;
import com.seele.springcloud.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService service;

    @PostMapping(value = "/User/add",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean add(@RequestBody User user){
        return service.add(user);
    }

    @RequestMapping(value = "/User/delete/{id}",method = RequestMethod.DELETE)
    public boolean delete(@PathVariable("id") Long id){
        return service.delete(id);
    }

    @PutMapping(value = "/User/update")
    public boolean update(@RequestBody User user){
        return service.update(user);
    }

    @RequestMapping(value = "User/get/{id}",method = RequestMethod.GET)
    public User get(@PathVariable("id") Long id){
        return service.get(id);
    }

    @RequestMapping(value = "/User/list",method = RequestMethod.GET)
    public List<User> list(){
        return service.list();
    }
}
