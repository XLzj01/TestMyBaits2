package com.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SQLSessionFactoryUtil {

	private static SqlSessionFactory sessionFactory = null;
	private static final Class CLASS_LOCK = SQLSessionFactoryUtil.class;

	public static SqlSession getSession() {
		if (sessionFactory == null) {
			setSessionFactoryInstance();
		}
		SqlSession session = sessionFactory.openSession();
		return session;
	}

	public static void setSessionFactoryInstance() {
		String resource = "myBaits.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		synchronized (CLASS_LOCK) {
			if (sessionFactory == null) {
				SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
				sessionFactory = sqlSessionFactoryBuilder.build(inputStream);
			}
		}

	}
}
