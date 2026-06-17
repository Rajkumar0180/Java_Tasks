package com.constructor;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Employee obj=new Employee(78,"Raj","Junior Software Developer",50000,5);
		
		System.out.println("//Before Promotion:");
		
		System.out.println("Employee ID : "+obj.getEmpId());
		System.out.println("Employee name : "+obj.getName());
		System.out.println("Current designation : "+obj.getDesignation());
		System.out.println("– Employee salary : "+obj.getsalary());
		System.out.println("Rating out of 5 : "+obj.getPerformanceRating());
		obj.promoteEmployee(5);
		
		System.out.println("\n//After Promotion:");
		
		obj.setDesignation("Senior software Developer");
		obj.setSalary(80000);
		System.out.println(obj.getDesignation());
		System.out.println(obj.getsalary());
		obj.getPerformanceRating();
	}
}
