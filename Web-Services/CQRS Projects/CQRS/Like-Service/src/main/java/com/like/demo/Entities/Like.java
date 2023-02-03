package com.like.demo.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="LikeTable")
@Data
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeId;
    private Long userId;
    private Long tweetId;
    private Date LikeDate;

}
