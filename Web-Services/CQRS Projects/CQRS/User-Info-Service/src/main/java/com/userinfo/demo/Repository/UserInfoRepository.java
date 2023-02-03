package com.userinfo.demo.Repository;

import com.userinfo.demo.Entities.UserFullInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserFullInfo, Long> {

}
