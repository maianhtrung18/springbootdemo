package com.cybersoft.demospringboot.entity;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.List;

@Entity(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   int  id;
    @Column(name="fullname")
    private String fullName;
    @Column(name="age")
    private int age;
    @Column(name="username")
    private String  userName;
    @Column(name="password")
    private String  password;
    @Column(name="created_date")
    private Date createdDate;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roles;

    @OneToOne(mappedBy = "users")
    @PrimaryKeyJoinColumn
    private UserDetail userDetail;

    @OneToMany(mappedBy = "users")
    private List<Tasks> tasks;

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}
