package com.dao;

import java.util.Map;

import com.Classes;

public interface ClassesDaoInterface {
	public Classes getClasses(String classesId);

	public void deleteClasses(String classesId);

	public void insertClassesByPOJO(Classes classes);
	
	public void insertClassesByMap(Map<String, Object> parameters);
}
