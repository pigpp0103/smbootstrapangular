package com.pigpp.demo.service.impl;  
  


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pigpp.demo.dao.UserMapper;
import com.pigpp.demo.model.User;
import com.pigpp.demo.service.IUserService;  
  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Autowired  
    private UserMapper userMapper;  

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
      return this.userMapper.selectByPrimaryKey(userId);  
	}
  
}  