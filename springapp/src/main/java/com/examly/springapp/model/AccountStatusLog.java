package com.examly.springapp.model;

import jakarta.persistence.*;

@Entity
public class AccountStatusLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
    private String timestamp;

    @ManyToOne
    private UserAccount user;

    public AccountStatusLog() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }

    public UserAccount getUser() { return user; }
    public void setUser(UserAccount user) { this.user = user; }
}
