package client;

import employeeService.EmpService;
import employeeService.employeeServiceImpl.EmpServiceImpl;

public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpServiceImpl esi = new EmpServiceImpl();
		EmpService es = new EmpServiceImpl();
		try {
			esi.createEmployee();
			es.getAllEmployee();
			es.getEmployeeSalary();
			esi.getUpdatedDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
