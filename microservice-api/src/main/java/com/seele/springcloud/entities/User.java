package com.seele.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class User implements Serializable {
    private Long user_no;//主键（自增）
    private String u_name;//姓名
    private String u_password;//密码
    private String u_gender;//性别
    private Long u_age;//年龄
    private String u_email;//邮箱
    private String db_source;//来自哪个数据库
}
