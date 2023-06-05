package cyber.demos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbcDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("driver loaded");	
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	System.out.println("connection estabilished");
	Statement stmt=con.createStatement();
	//creating table in xe driver
	//String tableQuery="CREATE TABLE DEPT11(DEPT_ID NUMBER, DEPT_NAME VARCHAR2(40))";
	int dept_id=1;
	String dept_name="engeering dept";
	
	String sqlQuery="insert into DEPT11 values("+dept_id+""+","+"'"+dept_name+"')";
	stmt.executeUpdate(sqlQuery);
	
//stmt.execute(tableQuery);
//con.setAutoCommit(true);
//System.out.println("table created");
	
	ResultSet rs=stmt.executeQuery("select * from MyEmp");
	while(rs.next())
	{
		int id=rs.getInt(1);
		String name=rs.getString(2);
		int age=rs.getInt(3);
		System.out.println(id+ " "+name+ " "+age);
		
	}
	}

}
