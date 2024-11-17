package com.cybersoft.demospringboot.entity;

import jakarta.persistence.*;

@Entity(name = "users_detail")
public class UserDetail {

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address;

    @Column(name = "id_card")
    private String idCard;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private Users users;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
