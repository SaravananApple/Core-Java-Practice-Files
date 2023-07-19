import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class JdbcExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");  
	    
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password"); 
				 

		java.sql.Statement  st = con.createStatement();
	
//	ResultSet rs = st.executeQuery("SELECT * FROM person");
//	
//	while(rs.next())
//	{
//		System.out.println(rs.getInt(1)+" "+ rs.getString(4));
//	}
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the roll number");
	int roll = scan.nextInt();
	System.out.println("Enter the name ");
	scan.nextLine();
	String name = scan.nextLine();
	
	 int rs = st.executeUpdate("insert into student values (" + roll + ",'" + name + "')"); 
	  if (rs > 0) 
		  System.out.println("Inserted ");
	
	
	
	
	
	
	
con.close();
	
	}

}
  