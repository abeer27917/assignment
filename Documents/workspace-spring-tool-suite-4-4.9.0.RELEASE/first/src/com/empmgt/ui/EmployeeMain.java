package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmployeeMain {
	
	public static void main(String args[]) {
		EmployeeMain project= new EmployeeMain();
		project.start();
	}
	
	public void start() {
		Employee employees[]=new Employee[4];
		Department department1=new Department("A1","abc");
		Department department2=new Department("A2","def");
		Department department3=new Department("A3","ghi");
		Department department4=new Department("A4","jkl");
		
		Developer developer1=new Developer(1,"Abeer",department1,"JAVA");
		Developer developer2=new Developer(2,"Aahil",department2,"PYTHON");
		
		Tester tester1=new Tester(3,"Ali", department3, "qwe");
		Tester tester2=new Tester(4, "omer",department4,"hhy");
		
		employees[0]=developer1;
		employees[1]=developer2;
		employees[2]=tester1;
		employees[3]=tester2;
		
		for (int i=0; i< employees.length;i++) {
			Employee iteratedEmployee=employees[i];
			if (iteratedEmployee instanceof Developer) {
				Developer developer= (Developer) iteratedEmployee;
				displayEmployee(developer);
				
			}
			
			if (iteratedEmployee instanceof Tester) {
				Tester tester= (Tester) iteratedEmployee;
				displayEmployee(tester);
				
			}
			
			
		}
	}
	
	void displayBaseEmployee(Employee employee) {
		int id = employee.getId();
		String name = employee.getName();
		Department department = employee.getDepartment();
		String deptId = department.getDeptId();
		String deptName = department.getDeptName();
		System.out.println("employee " + id + " " + name );
		System.out.println("depatment is " + deptId + " " + deptName);

}
	
	void displayEmployee(Developer employee) {
		displayBaseEmployee(employee);
		String language = employee.getLanguage();
		System.out.println("language =" + " " + language);
	}

	
	void displayEmployee(Tester employee) {
		displayBaseEmployee(employee);
		String tools = employee.getTools();
		System.out.println("tools ="+ " " + tools);
		
	}
	
}