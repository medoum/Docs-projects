package com.follow.demo.Services;

import com.follow.demo.Entities.Follow;
import com.follow.demo.Repository.FollowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowService {

    @Autowired
    private FollowRepository followRepository;

    @Autowired
    private FollowEventPublisher followEventPublisher;

    public Follow getFollowById(long followId){
        return followRepository.findById(followId).get();
    }

    public Follow addNewFollow(Follow newFollow){
        followRepository.save(newFollow);
        followEventPublisher.publishFollowEvent(newFollow);
        return newFollow;
        
    }
}
