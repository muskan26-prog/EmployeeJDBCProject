package employeeService.employeeServiceImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import dao.EmpDao;
import dao.empDaoImpl.EmpDaoImpl;
import dbUtil.DBUtil;
import employeeService.EmpService;

public class EmpServiceImpl implements EmpService{

	DBUtil dbu;
	EmpDao ed = (EmpDao) new EmpDaoImpl();;
	Scanner sc;
	
	public void createEmployee() throws Exception {
		 
		dbu = new DBUtil();
		Connection con = dbu.createConnection();
		Statement st = con.createStatement();
		
		sc = new Scanner(System.in);
		
		System.out.print("How many employees you want to add: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {	     
			System.out.print("Enter employee id  :  ");
			System.out.println();
			int id = sc.nextInt();
			
			System.out.print("Enter employee name  :  ");
			System.out.println();
			String name = sc.next();
			
			System.out.print("Enter employee age  :  ");
			System.out.println();
			int age = sc.nextInt();
			
			System.out.print("Enter employee salary  :  ");
			System.out.println();
			int salary = sc.nextInt();
		
			String query = "insert into employee values('" + id + "' , '" + name +"' , '" + age + "' , '" + salary + "')";
			st.executeUpdate(query);
		}
		System.out.println("Data  Inserted successfully");
	}
	
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		ed.getAllEmployee();
		
	}
	
	public void getEmployeeSalary() {
		// TODO Auto-generated method stub
		ed.getEmployeeSalary();		
	}
	
	public void getUpdatedDetails() {
		sc = new Scanner(System.in);
		
		System.out.print("Enter employee id: ");
		int empId = sc.nextInt();
		
		System.out.print("Enter updated salary: ");
		double empSalary = sc.nextDouble();
		updateEmployeeSalary(empId, empSalary);
	}
	
	public void updateEmployeeSalary(int employeeId, double updatedSalary) {
		// TODO Auto-generated method stub
		ed.updateEmployeeSalary(employeeId, updatedSalary);
	}


}

