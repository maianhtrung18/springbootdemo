package com.cybersoft.demospringboot.entity.key;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.io.Serializable;

public class IdTask implements Serializable {
    @Column(name = "user_id")
    private int userId;

    @Column(name = "project_id")
    private int projectId;

    public IdTask(int userId, int projectId){
        this.userId = userId;
        this.projectId = projectId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
}
