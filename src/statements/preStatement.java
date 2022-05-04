package statements;
import java.sql.*;
import java.io.*;

public class preStatement {
	public static void main(String[] args) throws SQLException {
		
	
	String URL = "jdbc:mysql://localhost:3306/sys";
	String uname = "root";
	String pwd = "SmithaRai@01";
	String sql = "insert into student(Rollno , StudentName )"
			    +"values( 5 , 'priyanka')";
	
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


Connection con = DriverManager.getConnection(URL,uname,pwd);
Statement st = con.createStatement();
PreparedStatement str = con.prepareStatement("delete from student where Rollno = ?");
  str.setInt(1, 2);
  ResultSet rs = str.executeQuery();
while(rs.next())
{
System.out.println(rs);
}

	  

st.close();
rs.close();
	}
}



