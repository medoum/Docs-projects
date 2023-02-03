package com.userinfo.demo.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class UserFullInfo {

    @Id
    private Long userId;
    private String username;
    private String fullname;
    private String address;
    private Date dateOfBirth;
    private int tweetsCount;
    private int followsCount;
    private int likesCount;

}

