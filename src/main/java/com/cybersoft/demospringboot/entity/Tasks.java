package com.cybersoft.demospringboot.entity;

import com.cybersoft.demospringboot.entity.key.IdTask;
import jakarta.persistence.*;

@Entity(name = "tasks")
@IdClass(IdTask.class)
public class Tasks {
    @Id
    private int userId;

    @Id
    private int projectId;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private Users  users;

    @ManyToOne
    @JoinColumn(name = "project_id", insertable = false, updatable = false)
    private Project project;

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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
