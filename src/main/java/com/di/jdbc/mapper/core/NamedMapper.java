package com.di.jdbc.mapper.core;

import java.util.List;

public interface NamedMapper extends PagerMapper {
	/**
	 * 执行命名执行
	 *
	 * @param namedQueryName 本地查询名称
	 * @param namedClass 命名查询类
	 * @param args 参数值
	 * @return 执行状态
	 */
	<T> int executeByNamedQuery(String namedQueryName, Class<T> namedClass, Object... args);

	/**
	 * 执行命名查询
	 *
	 * @param namedQueryName 本地查询名称
	 * @param namedClass 命名查询类
	 * @param args 参数值
	 * @return 数据
	 */
	<T> T getByNamedQuery(String namedQueryName, Class<T> namedClass, Object... args);

	/**
	 * 执行命名查询
	 *
	 * @param namedQueryName 本地查询名称
	 * @param namedClass 结果类
	 * @param args 参数值
	 * @return 分页数据
	 */
	<T> List<T> listByNamedQuery(String namedQueryName, Class<T> namedClass, Object... args);

	/**
	 * 执行命名分页查询
	 *
	 * @param namedQueryName 本地查询名称
	 * @param pageNum 当前页
	 * @param pageSize 每页大小
	 * @param namedClass 结果类
	 * @param args 参数值
	 * @return 分页数据
	 */
	<T> Pager<T> pageByNamedQuery(String namedQueryName, int pageNum, int pageSize, Class<T> namedClass, Object... args);
}
