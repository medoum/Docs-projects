package com.like.demo.Services;

import com.like.demo.Entities.Like;
import com.like.demo.Repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    @Autowired
    private LikeEventPublisher likeEventPublisher;

    public Like getLikeById(long likeId){
        return likeRepository.findById(likeId).get();
    }

    public Like addNewLike(Like newLike){
        likeRepository.save(newLike);
        likeEventPublisher.publishLikeEvent(newLike);
        return newLike;
    }
}
