package com.pawana.model;

public class Department {
	
	private int DeptNo;
	private String DeptName;
	public void setDeptNo(int deptNo) {
		DeptNo = deptNo;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	public String toString() {
		return "Department [DeptNo=" + DeptNo + ", DeptName=" + DeptName + "]";
	}

}
