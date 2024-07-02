package com.aaa.service.impl;

import com.aaa.entity.Users;
import com.aaa.mapper.UsersMapper;
import com.aaa.service.IUsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UsersServiceImpl implements IUsersService {
    @Resource
    private UsersMapper usersMapper;
    @Override
    public Users login(Users users) {
        return usersMapper.findByNameAndPassword(users);
    }
}
