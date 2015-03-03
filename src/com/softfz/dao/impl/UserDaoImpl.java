package com.softfz.dao.impl;

import org.springframework.stereotype.Component;

import com.softfz.dao.UserDao;
import com.softfz.dao.core.GeneralMybatisDao;
import com.softfz.model.UserBean;

@Component
public class UserDaoImpl extends GeneralMybatisDao<UserBean, Integer>
	implements UserDao{

	@Override
	public Class getEntityClass() {
		return UserBean.class;
	}

	
}
