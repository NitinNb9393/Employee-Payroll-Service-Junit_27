package com.bridgelabz.employeepayroll.Employee_Payroll_Service_Junit;

public class EmployeePayRollMain {
	public static void main(String[] args) {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		System.out.println("Welcolme to employee payRoll");
		employeePayrollService.readEmployeeDataFromConsole();
		employeePayrollService.writeEmployeeDataInConsole();
	}

}