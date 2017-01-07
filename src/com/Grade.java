package com;

public enum Grade {
	good(1, "GOOD"), BAD(2, "BAD");

	private Grade(int id, String type) {
		this.id = id;
		this.type = type;
	}

	private int id;
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private static Grade getGrade(int id) {
		if (id % 2 == 0) {
			return Grade.good;
		} else {
			return Grade.BAD;
		}
	}
}
