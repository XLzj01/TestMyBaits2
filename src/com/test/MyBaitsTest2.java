package com.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.Classes;
import com.Grade;
import com.dao.ClassesDaoInterface;
import com.dao.SQLSessionFactoryUtil;

public class MyBaitsTest2 {

	@Test
	public void test() {
		SqlSession session = null;
			session = SQLSessionFactoryUtil.getSession();
			ClassesDaoInterface mapper = session.getMapper(ClassesDaoInterface.class);
//			 Classes classes = mapper.getClasses("5");
//			 System.out.println(classes);
			 
			 Map<String, Object> parameters = new HashMap<>();
			 parameters.put("classId", "5");
			 parameters.put("className", "5");
			 parameters.put("personNumble", "5");
			 parameters.put("grade",Grade.BAD);
			 mapper.insertClassesByMap(parameters);
//			 Classes classes2 = new Classes();
//			 classes2.setClassId("5");
//			 classes2.setClassName("5");
//			 classes2.setPersonNumble(20);
//			 classes2.setGrade(Grade.BAD);
//			 mapper.insertClassesByPOJO(classes2);
//			mapper.deleteClasses("5");
			session.commit();
			session.clearCache();
			session.close();
		}
	}
