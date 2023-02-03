package com.follow.demo.Controller;

import com.follow.demo.Entities.Follow;
import com.follow.demo.Services.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class FollowController {

    @Autowired
    private FollowService followService;

    @GetMapping("/{followId}")
    public Follow getFollowById(@PathVariable long followId){
        return followService.getFollowById(followId);
    }


    @PostMapping("/newFollow")
    public Follow AddFollow(@RequestBody Follow newFollow){
        return followService.addNewFollow(newFollow);
    }
}
