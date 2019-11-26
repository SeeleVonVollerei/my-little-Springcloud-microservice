package com.seele.springcloud.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class SysPermission {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @Column(columnDefinition = "enum('menu','button')")
    private String resourceType;
    private String url;
    private String permission;
    private Long parentId;
    private String parentIds;
    private Boolean available = Boolean.FALSE;
    @ManyToMany
    @JoinTable(name="SysRolePermission",joinColumns={@JoinColumn(name="permissionId")},inverseJoinColumns={@JoinColumn(name="roleId")})
    private List<SysRole> roles;
}
