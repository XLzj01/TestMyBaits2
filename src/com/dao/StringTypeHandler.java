package com.dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

@MappedTypes({String.class})
@MappedJdbcTypes(JdbcType.VARCHAR)
public class StringTypeHandler implements TypeHandler<String> {

	@Override
	public String getResult(ResultSet resultSet, String name) throws SQLException {
		System.out.println("----------------->String getResult(ResultSet resultSet, String name) ");
		System.out.println("name is " + name);
		String temp = resultSet.getString(name);
		if (temp.equals("5")) {
			temp ="bobo";
		}
		System.out.println(temp);
		return temp;
	}

	@Override
	public String getResult(ResultSet resultSet, int index) throws SQLException {
		System.out.println("----------------->String getResult(ResultSet resultSet, int index) ");
		String temp = resultSet.getString(index);
		System.out.println(temp);
		return temp;
	}

	@Override
	public String getResult(CallableStatement callableStatement, int index) throws SQLException {
		System.out.println("----------------->String getResult(CallableStatement callableStatement, int index) ");
		return callableStatement.getString(index);
	}

	@Override
	public void setParameter(PreparedStatement preparedStatement, int index, String value, JdbcType jdbcType)
			throws SQLException {
		System.out.println(
				"----------------->setParameter(PreparedStatement preparedStatement, int index, String value, JdbcType jdbcType)");
		preparedStatement.setString(index, value);
	}

}
