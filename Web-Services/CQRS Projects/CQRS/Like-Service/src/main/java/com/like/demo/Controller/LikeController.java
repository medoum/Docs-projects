package com.like.demo.Controller;

import com.like.demo.Entities.Like;
import com.like.demo.Services.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LikeController {

    @Autowired
    private LikeService likeService;

    @GetMapping("/{likeId}")
    public Like getLikeById(@PathVariable long likeId){
        return likeService.getLikeById(likeId);
    }


    @PostMapping("/newLike")
    public Like AddLike(@RequestBody Like newLike){
        return likeService.addNewLike(newLike);
    }
}
