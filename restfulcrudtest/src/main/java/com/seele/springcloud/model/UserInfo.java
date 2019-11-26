package com.seele.springcloud.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class UserInfo implements Serializable {
    @Id
    @GeneratedValue
    private  Integer uid;
    @Column(unique = true)
    private String username;
    private String name;
    private String password;
    private String salt;
    private byte state;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "SysUserRole", joinColumns = { @JoinColumn(name = "uid") }, inverseJoinColumns ={@JoinColumn(name = "roleId") })
    private List<SysRole> roleList;

    public String getCredentialsSalt(){
        return this.username+this.salt;
    }
}
