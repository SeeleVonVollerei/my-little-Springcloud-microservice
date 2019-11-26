package com.seele.springcloud.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void testAdd() {
        redisTemplate.opsForValue().set("k3","Vollerei");
    }

    @Test
    public void testDelete(){
        redisTemplate.delete("hello");
    }

    @Test
    public void testUpdate(){
        redisTemplate.opsForValue().set("k4","Von");
    }

    @Test
    public void testGet(){
        System.out.println(redisTemplate.opsForValue().get("k2"));
    }

    @Test
    public void testGetList(){
        List<String> keys = new ArrayList<>();
        keys.add("k1");
        keys.add("k2");
        keys.add("k3");
        System.out.println(redisTemplate.opsForValue().multiGet(keys));
    }

    @Test
    public void testGetAll(){
        String prefix = "*";
        Set<String> keys = redisTemplate.keys(prefix);
        System.out.println(redisTemplate.opsForValue().multiGet(keys));
    }
}
