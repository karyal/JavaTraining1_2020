package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class MyDatabase {
	
	public void connectDb() {
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";//localhost
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";
		
		try {
			//Step-2
			//Load Driver
			System.out.println("Connecting.......");
			Class.forName(driver);
			//Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java1?", "admin", "admin@123");
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);
			System.out.println("Connected......");
			conn.close();
			System.out.println("Close Connection");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public boolean insert() {
		boolean result=false;
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";
		
		//SQL Statement
		String str_sql = "INSERT INTO contacts VALUES(107, 'kRISHNA','NEP','krishna@gmail.com','9843212345')";
		
		try {
			//Step-2
			//Load Driver
			System.out.println("Connecting.......");
			Class.forName(driver);
			//Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java1?", "admin", "admin@123");
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);
			System.out.println("Connected......");
			
			//Insert Record
			System.out.println("Inserting.....");
			Statement stat = conn.createStatement();
			stat.executeUpdate(str_sql); //executeUpdate-> Insert, Update, Delete Record
			stat.close();
			System.out.println("Inserted.....");
			conn.close();
			System.out.println("Close Connection");
			result=true;
		}
		catch(Exception ex) {
			result=false;
			System.out.println("Error : "+ex.getMessage());			
		}
		return result;
	}
	
	public boolean insert(int sn, String name, String address, String email, String phone) {
		boolean result = false;
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";
		
		//SQL Statement
		//String str_sql = "INSERT INTO contacts VALUES(107, 'kRISHNA','NEP','krishna@gmail.com','9843212345')";
		String str_sql = "INSERT INTO contacts VALUES("+sn+", '"+name+"','"+address+"','"+email+"','"+phone+"')";
		
		try {
			//Step-2
			//Load Driver
			System.out.println("Connecting.......");
			Class.forName(driver);
			//Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java1?", "admin", "admin@123");
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);
			System.out.println("Connected......");
			
			//Insert Record
			System.out.println("Inserting.....");
			Statement stat = conn.createStatement();
			stat.executeUpdate(str_sql); //executeUpdate-> Insert, Update, Delete Record
			stat.close();
			System.out.println("Inserted.....");
			conn.close();
			System.out.println("Close Connection");
			result = true;
		}
		catch(Exception ex) {
			result =false;
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}
	
	public void select() {
		//Step-1
		//Pre-requirements
		String driver="com.mysql.cj.jdbc.Driver";
		String host="127.0.0.1";
		int port = 3306;
		String db_name="java1";
		String db_user="admin";
		String user_pass="admin@123";
		
		//SQL Statement - Select
		String str_sql = "SELECT * FROM contacts ORDER BY sn ASC LIMIT 1000";
		
		try {
			//Step-2
			//Load Driver
			//System.out.println("Connecting.......");
			Class.forName(driver);
			//Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java1?", "admin", "admin@123");
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/"+ db_name +"?", db_user, user_pass);
			//System.out.println("Connected......");
			
			//Select Record
			//System.out.println("Selecting.....");
			Statement stat = conn.createStatement();						
			
			ResultSet rs = stat.executeQuery(str_sql); //executeQuery-> Select 
			
			System.out.println("SN\tNAME\tADDRESS\tEMAIL\t\t\tPHONE");
			while(rs.next()) {
				System.out.println(rs.getInt("sn")+"\t"+rs.getString("name")+"\t"+rs.getString("address")+"\t"+rs.getString("email")+"\t\t"+rs.getString("phone"));
			}
			
			stat.close();
			//System.out.println("Selected.....");
			conn.close();
			//System.out.println("Close Connection");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}