package dao.empDaoImpl;

import java.sql.ResultSet;

public class DisplayRecord {

	public void display(ResultSet rs) throws Exception{
		System.out.println("Emp_Id          Emp_Name           Emp_Age            Emp_Salary" );
	    System.out.println("==================================================================");
	    System.out.println();
		while(rs.next()){
			
			String result = " " + rs.getInt(1) + "       |     " + rs.getString(2) + "       |        " + rs.getInt(3) + "        |        " + rs.getDouble(4);
			System.out.println(result);
			System.out.println("------------------------------------------------------------------");
		}		
	}
}
