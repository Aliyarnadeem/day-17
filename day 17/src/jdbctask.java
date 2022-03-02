import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbctask {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// step 2  class loader 
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root", "Nadeem@123");//step 3 create connection
		
		Statement st = con.createStatement();// step 4
		//String query = "create table student(ID int primary key,SName varchar(20), SMarks int)";//step 6
		//String query1 = "insert into student values(1,'Nadeem',24)";
		//String query2 = "insert into student values(2,'hassan',25),(3,'jawad',30)";
		//String query3 = "UPDATE student SET SName='aftab', SMarks=40 WHERE ID=2";
		//String query4 = "DELETE FROM student WHERE ID=2";
		ResultSet rs= st.executeQuery("SELECT ID, SName, SMarks FROM student");
		while(rs.next())
		{
			System.out.println("\t"+rs.getString(1)+ "\t"+rs.getString(2)+  "\t"+rs.getString(3)+ "\n");
			//System.out.println(rs.getString(1));
			//System.out.println(rs.getString(2));
			
		
		}
		//st.executeUpdate(query);
		//st.executeUpdate(query1);
		//st.executeUpdate(query2);
		//st.executeUpdate(query3);
		//st.executeUpdate(query4);
		
		
		
		System.out.println("Student Table created successfully");
		
		System.out.println("Row inserted successfully");
		
	st.close();
	con.close();
	}

}
