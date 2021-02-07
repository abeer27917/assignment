package com.empmgt.entities;

public class Department {
	
	private String deptId;
	private String deptName;
	
	public Department(String id, String name) {
		this.deptId=id;
		this.deptName=name;
	}
	
	public String getDeptId() {
		return deptId;
	}
	
	public void setDeptId(String deptId) {
		this.deptId=deptId;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName=deptName;
	}

}
