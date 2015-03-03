package com.softfz.dao.core;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.dao.support.DaoSupport;

import com.softfz.constant.Constant;

public abstract class GeneralMybatisDao<T,PK extends Serializable>
	extends BaseMybatisDao implements GeneralDao<T,PK> {
	
	

	@Override
	protected void checkDaoConfig() throws IllegalArgumentException {
		
	}

	//获取实体对象。交由相关子类实现
	public abstract Class getEntityClass();
	
	//获取类的完整路径
	public String getSqlMapNameSpace(){
		return getEntityClass().getName();
	}
	
	//构建与map.xml一致的路径
	public String getStateMentName(String sqlKey){
		return  getSqlMapNameSpace() + Constant.POINT +sqlKey;
	}
	

	public void insert(String sqlKey,T entity) {
		getSqlSessionTemplate().insert(getStateMentName(sqlKey), entity);
	}

	public int update(String sqlKey,T entity) {
		int count = 0;
		count = getSqlSessionTemplate().delete(getStateMentName(sqlKey), entity);
		return count;
	}

	public int delete(String sqlKey,PK primaerKry) {
		int count = 0;
		count = getSqlSessionTemplate().delete(getStateMentName(sqlKey), primaerKry);
		return count;
	}

	public int delete(String sqlKey,Map param) {
		int count = 0;
		count = getSqlSessionTemplate().delete(getStateMentName(sqlKey), param);
		return count;
	}

	public int count(String sqlKey) {
		int count = 0;
		count = getSqlSessionTemplate().selectOne(getStateMentName(sqlKey));
		return count;
	}

	public int count(String sqlKey,Map param) {
		int count = 0;
		count = getSqlSessionTemplate().selectOne(getStateMentName(sqlKey), param);
		return count;
	}
	

	public T get(String sqlKey,PK primaerKry) {
		
		return getSqlSessionTemplate().selectOne(getStateMentName(sqlKey), primaerKry);
	}
	
	

	public T get(String sqlKey, Map param) {
		return getSqlSessionTemplate().selectOne(getStateMentName(sqlKey), param);
	}

	public List<T> select(String sqlKey) {
		return getSqlSessionTemplate().selectList(getStateMentName(sqlKey));
	}

	public List<T> select(String sqlKey,Map param) {
		return getSqlSessionTemplate().selectList(getStateMentName(sqlKey),param);
	}

	public int insertBatch(String sqlKey,List<T> list) {
		
		return getSqlSessionTemplate().insert(getStateMentName(sqlKey),list);
	}

	public int deleteBatch(String sqlKey,List<T> list) {
		
		return getSqlSessionTemplate().delete(getStateMentName(sqlKey),list);
	}

	public int updateBatch(String sqlKey,List<T> list) {
		return getSqlSessionTemplate().update(getStateMentName(sqlKey),list);
	}
	
	
}
