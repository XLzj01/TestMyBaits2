package com;

public class Classes {

	private String classId;
	private String className;
	private Integer personNumble;
	private Grade grade;

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getPersonNumble() {
		return personNumble;
	}

	public void setPersonNumble(Integer personNumble) {
		this.personNumble = personNumble;
	}

	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", className=" + className + ", personNumble=" + personNumble
				+ ", grade=" + grade + "]";
	}

}
