package com.softfz.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfz.dao.UserDao;
import com.softfz.dao.core.GeneralDao;
import com.softfz.model.UserBean;
import com.softfz.service.core.GeneralService;

@Service
public class UserService extends GeneralService<UserBean,Integer>{
	
	@Resource
	private UserDao userDao;

	@Override
	public GeneralDao<UserBean, Integer> getGeneralDao() {
		return this.userDao;
	}

}
