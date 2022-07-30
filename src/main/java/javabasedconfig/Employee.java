package javabasedconfig;

import java.util.Arrays;
import java.util.List;

//pojo file
public class Employee {

	private int empid;
	private String name;
	List<Character> workingDays;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Character> getWorkingDays() {
		return workingDays;
	}
	public void setWorkingDays(List<Character> workingDays) {
		this.workingDays = workingDays;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", workingDays=" + workingDays + "]";
	}

	
	
	
	
	
}
