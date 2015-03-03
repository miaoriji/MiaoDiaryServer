package com.softfz.dao.core;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface GeneralDao<T,PK extends Serializable> {

	//插入一个实体
	public abstract void insert(String sqlKey,T entity);
	
	//更改一个实体
	public abstract int update(String sqlKey,T entity);
	
	//按照主键删除记录
	public abstract int delete(String sqlKey,PK primaerKry);
	//删除符合条件的记录
	public abstract int delete(String sqlKey,Map param);
	
	//查询整表的总记录数
	public abstract int count(String sqlKey);
	//查询符合条件的记录数
	public abstract int count(String sqlKey,Map param);
	//按照主键取记录
	public abstract T get(String sqlKey,PK primaerKry);
	//按照条件取记录
	public abstract T get(String sqlKey,Map param);
	//查询全部记录
	public abstract List<T> select(String sqlKey);
	//查询符合条件的记录数
	public abstract List<T> select(String sqlKey,Map param);
	
	//批量插入
	public abstract int insertBatch(String sqlKey,List<T> list);
	
	//批量删除
	public abstract int deleteBatch(String sqlKey,List<T> list);
		
	//批量修改
	public abstract int updateBatch(String sqlKey,List<T> list);
	
}
