package com.pigpp.demo.service.impl;  
  
import javax.annotation.Resource;  
  
import org.springframework.stereotype.Service;

import com.pigpp.demo.dao.UserMapper;
import com.pigpp.demo.model.User;
import com.pigpp.demo.service.IUserService;  
  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserMapper userDao;  

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
      return this.userDao.selectByPrimaryKey(userId);  
	}
  
}  