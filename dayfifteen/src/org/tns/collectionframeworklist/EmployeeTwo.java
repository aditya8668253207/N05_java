package org.tns.collectionframeworklist;

import java.util.Comparator;

// this program is for when we don't want to change the code of employee class ( bean class ) so we use here
// comprator interface (functional interface)
public class EmployeeTwo  {

	private int empId;
	private String empName;
	private float salary;
	private String designation;
	
	
	// default constructor
	public EmployeeTwo() {
		super();
	}
	
	// parameterized constructor
	public EmployeeTwo(int empId, String empName, float salary, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
	}
	
	// getter setter methods
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
    // to string method
	@Override
	public String toString() {
		return "EmployeeTwo [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
}


// sort by name (increasing)
class SortByName implements Comparator<EmployeeTwo>{        // Comparator<EmployeeTwo>    <This is called generics>
	                                                        // comparator interface takes object by default as generics if we want to pass specific class object then we have to mention like this example

	@Override
	public int compare(EmployeeTwo o1, EmployeeTwo o2) {
		
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
}

// sort by designation (decreasing)
class SortBydesignation implements Comparator<EmployeeTwo>{

	@Override
	public int compare(EmployeeTwo o1, EmployeeTwo o2) {
		
		return o2.getDesignation().compareTo(o1.getDesignation());
	}
}
	
	

