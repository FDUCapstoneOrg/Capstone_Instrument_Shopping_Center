package com.fdu.capstone_instrument_shopping_center.services;

import com.fdu.capstone_instrument_shopping_center.dto.UserDetailDto;
import com.fdu.capstone_instrument_shopping_center.dto.UserInfoDto;
import com.fdu.capstone_instrument_shopping_center.entity.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UserInfoService extends UserDetailsService {

    List<UserInfo> getAllUserInfo();

    void addRandomUserInfo();

    public boolean userExistByUsername(String username);

    UserInfo findUserInfoByUsername(String username);

    public UserInfo register(UserInfoDto userInfoDto);

}
