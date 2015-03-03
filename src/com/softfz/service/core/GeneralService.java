package com.softfz.service.core;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.softfz.dao.core.GeneralDao;

public abstract class GeneralService<T,PK extends Serializable> {

	public abstract GeneralDao<T,PK> getGeneralDao();

	//插入一个实体
	public void insert(String sqlKey,T entity){
		getGeneralDao().insert(sqlKey, entity);
	}
	
	//更改一个实体
	public int update(String sqlKey,T entity){
		return getGeneralDao().update(sqlKey, entity);
	}
	
	//按照主键删除记录
	public int delete(String sqlKey,PK primaerKry){
		return getGeneralDao().delete(sqlKey, primaerKry);
	}
	//删除符合条件的记录
	public int delete(String sqlKey,Map param){
		return getGeneralDao().delete(sqlKey, param);
	}
	
	//查询整表的总记录数
	public int count(String sqlKey){
		return getGeneralDao().count(sqlKey);
	}
	//查询符合条件的记录数
	public int count(String sqlKey,Map param){
		return getGeneralDao().count(sqlKey,param);
	}
	//按照主键取记录
	public T get(String sqlKey,PK primaerKry){
		return getGeneralDao().get(sqlKey, primaerKry);
	}
	
	public T get(String sqlKey,Map param){
		return getGeneralDao().get(sqlKey, param);
	}
	
	
	//查询全部记录
	public List<T> select(String sqlKey){
		return getGeneralDao().select(sqlKey);
	}
	//查询符合条件的记录数
	public List<T> select(String sqlKey,Map param){
		return getGeneralDao().select(sqlKey,param);
	}
	
	//批量插入
	public int insertBatch(String sqlKey,List<T> list){
		return getGeneralDao().insertBatch(sqlKey,list);
	}
	
	//批量删除
	public int deleteBatch(String sqlKey,List<T> list){
		return getGeneralDao().deleteBatch(sqlKey,list);
	}
		
	//批量修改
	public int updateBatch(String sqlKey,List<T> list){
		return getGeneralDao().updateBatch(sqlKey,list);
	}
	

}
