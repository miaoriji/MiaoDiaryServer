package com.softfz.dao.core;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;

public abstract class BaseMybatisDao extends DaoSupport{

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSessionTemplate getSqlSessionTemplate(){
		return this.sqlSessionTemplate;
	}
}
