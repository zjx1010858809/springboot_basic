package com.situ.service;

import java.util.List;
import com.situ.utils.SeachInfo;

public interface basicService<T> {
	public int getSize(SeachInfo where);
	
	public List<T> getAll();

	public List<T> getWhere(SeachInfo where);

	public int insert(T t);

	public int delete(int id);

	public int update(T t);

	public T getByid(int id);
	
	public List<T> getWhereAll(String where);

}
