package dao.empDaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

import dao.EmpDao;
import dbUtil.DBUtil;

public class EmpDaoImpl implements EmpDao{

	DBUtil dbu; 
	Connection con = null;
	Statement st = null;
	DisplayRecord dr;
	public void getEmployeeSalary() {
		// TODO Auto-generated method stub
		dbu = new DBUtil();
		dr = new DisplayRecord();
		Connection con = null;
		Statement st = null;	
		
		try {
			con = dbu.createConnection();
			st = con.createStatement();
			
			String query = "select *from employee where salary>20000";
			ResultSet rs = st.executeQuery(query);
			System.out.println("Display employee records whos salary is greater than 20000!");
			dr.display(rs);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				st.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateEmployeeSalary(int employeeId, double updatedSalary) {
		// TODO Auto-generated method stub
		dbu = new DBUtil();
		Connection con = null;
		Statement st = null;	
		
		try {
			con = dbu.createConnection(); 
			st = con.createStatement();
			
				String query = "update employee set salary=? where empId=?";
				
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setDouble(1, updatedSalary);
			    stmt.setInt(2, employeeId);
			    stmt.executeUpdate();
			    
				System.out.println("Salary Updated successfully!");
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				st.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		try {
			dbu = new DBUtil(); 
			dr = new DisplayRecord();
			con = dbu.createConnection();
			st = con.createStatement();
			
			System.out.println("Display Employee Record!");
			String query = "select *from employee";
			ResultSet rs = st.executeQuery(query);
			dr.display(rs);
			
		}catch(Exception e) { 
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				st.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}	
	}
	
//	@Override
//	public void getAllEmployee() {
//		try {
//			dbu = new DBUtil(); 
//			dr = new DisplayRecord();
//			con = dbu.createConnection();
//			st = con.createStatement();
//			
//			System.out.println("Display Employee Record!");
//			String query = "select *from employee";
//			ResultSet rs = st.executeQuery(query);
//			dr.display(rs);
//			
//		}catch(Exception e) { 
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				con.close();
//				st.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}	
//	}
//
//	@Override
//	public void getEmployeeSalary() {
//		dbu = new DBUtil();
//		dr = new DisplayRecord();
//		Connection con = null;
//		Statement st = null;	
//		
//		try {
//			con = dbu.createConnection();
//			st = con.createStatement();
//			
//			String query = "select *from employee where salary>20000";
//			ResultSet rs = st.executeQuery(query);
//			System.out.println("Display employee records whos salary is greater than 20000!");
//			dr.display(rs);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				con.close();
//				st.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	@Override
//	public void updateEmployeeSalary(int employeeId, double updatedSalary) {
//		dbu = new DBUtil();
//		Connection con = null;
//		Statement st = null;	
//		
//		try {
//			con = dbu.createConnection(); 
//			st = con.createStatement();
//			
//				String query = "update employee set salary=? where empId=?";
//				
//				PreparedStatement stmt = con.prepareStatement(query);
//				stmt.setDouble(1, updatedSalary);
//			    stmt.setInt(2, employeeId);
//			    stmt.executeUpdate();
//			    
//				System.out.println("Salary Updated successfully!");
//		} 
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				con.close();
//				st.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
////	private static void display(ResultSet rs) throws Exception {
////		System.out.println("**********************");
////		while(rs.next()) {
////			String result = "EmpID: " + rs.getInt(1) + "|" +"EmpName: " + rs.getString(2) +  "|"+ "EmpAge: " + rs.getInt(3) +  "|" + "EmpSalary: "+ rs.getDouble(4);
////			System.out.println(result);
////
////		}
////		System.out.println("**********************");
////	}
 
}
