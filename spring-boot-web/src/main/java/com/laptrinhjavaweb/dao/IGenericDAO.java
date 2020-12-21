package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.mapper.RowMapper;

import java.util.List;

public interface IGenericDAO<T> {
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
	void update (String sql, Object... parameters);
	Long insert (String sql, Object... parameters);
	Long delete (String sql, Object... parameters);
	int count(String sql, Object... parameters);
}
