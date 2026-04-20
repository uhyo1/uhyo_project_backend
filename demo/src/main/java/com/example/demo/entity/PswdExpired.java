package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pswd_expired", schema = "app")
public class PswdExpired {

    @Id
    @Column(name = "pswd_expired_id")
    private Integer pswdExpiredId;

    @Column(name = "access_info")
    private String accessInfo;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "password")
    private String password;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "updated_time")
    private LocalDateTime updatedTime;
}