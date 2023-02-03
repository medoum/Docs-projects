package com.userinfo.demo.Services;

import com.dtos.demo.Events.FollowEvent;
import com.dtos.demo.Events.LikeEvent;
import com.dtos.demo.Events.TweetEvent;
import com.dtos.demo.Events.UserEvent;
import com.userinfo.demo.Entities.UserFullInfo;
import com.userinfo.demo.Repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    public UserFullInfo getUserInfoById(long userId){
        return userInfoRepository.findById(userId).get();
    }

    public void updateUserData(UserEvent userEvent){
        UserFullInfo userUpdate = this.UserFullInfoEventToUserEntity(userEvent);
        userInfoRepository.save(userUpdate);
    }

    public void updateFollowForUser(FollowEvent followEvent){

        UserFullInfo userUpdate = userInfoRepository.findById(followEvent.getFollowerId()).get();
        userUpdate.setFollowsCount(userUpdate.getFollowsCount() + 1);
        userInfoRepository.save(userUpdate);

    }

    public void updateTweetForUser(TweetEvent tweetEvent){

        UserFullInfo userUpdate = userInfoRepository.findById(tweetEvent.getUserId()).get();
        userUpdate.setTweetsCount(userUpdate.getTweetsCount() + 1);
        userInfoRepository.save(userUpdate);

    }

    public void updateLikeForUser(LikeEvent likeEvent){

        UserFullInfo userUpdate = userInfoRepository.findById(likeEvent.getUserId()).get();
        userUpdate.setLikesCount(userUpdate.getLikesCount() + 1);
        userInfoRepository.save(userUpdate);

    }

    public UserFullInfo UserFullInfoEventToUserEntity (UserEvent userEvent){

        UserFullInfo userTmp = new UserFullInfo();

        userTmp.setUserId( userEvent.getUserId());
        userTmp.setUsername( userEvent.getUsername());
        userTmp.setFullname( userEvent.getFullname());
        userTmp.setAddress( userEvent.getAddress());
        userTmp.setDateOfBirth( userEvent.getDateOfBirth());

        return userTmp;
    }
}
