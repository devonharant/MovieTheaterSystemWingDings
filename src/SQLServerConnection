import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.mysql.cj.xdevapi.Statement;
import java.sql.*;
public class sql {

	static Connection connection = null;
	static String databaseName = "movietest";
	static String url = "jdbc:mysql://localhost:3306/movietest";
	static java.sql.Statement stmt;
	static String username = "root";
	static String password = "password";
	static String thing = "select * from  user";
	static String truncate = "truncate table user";
	static String deleterow = "delete from user where UserID=?";//?denotes user input or a preparedstatement 
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(url, username, password);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("would you like to truncate or print table press 1 to truncate 2 to print");
		int choice = keyboard.nextInt();
		if(choice == 1)
		{
		truncate();
			
		}
		else if(choice ==2) {
		print();
		}
		else if(choice == 3) {
			addUser();
		}
		else if(choice == 4) {
			findandremove();
		}
}
	public static void truncate() throws SQLException {
		stmt = connection.createStatement();
		int status = stmt.executeUpdate(truncate);
		System.out.println("truncated");
	}
	public static void addUser() throws SQLException {
		String query = "insert into user(first_name,last_name,email,age)" + " values (?,?,?,?)";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("please enter your first name");
		String name = keyboard.nextLine();
		System.out.println("please enter in your last name");
		String lastname = keyboard.nextLine();
		System.out.println("please enter your email");
		String email = keyboard.nextLine();
		System.out.println("please enter your age");
		int age = keyboard.nextInt();
		if(age <= 0) {
			System.out.println("youre not even alive yet");
		}
		else {
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1,name);
		ps.setString(2, lastname);
		ps.setString(3, email);
		ps.setInt(4, age);
		int status = ps.executeUpdate();
		
		if(status != 0) {
			System.out.println("database was connected correctly");
		}
	}
	}
	public static void print() throws SQLException {
		stmt = connection.createStatement();//stmt is a statement and this is creating a connection that will let me create a statement
		ResultSet rs = stmt.executeQuery(thing);//executes a result set that hold the statement 
		ResultSetMetaData rsmd = rs.getMetaData();//gets the data that the statement has
		System.out.println("");//spaces them out
		int numberofcol = rsmd.getColumnCount();
		for (int i = 1; i <= numberofcol; i++) {//grabs the colume names 
	        if (i > 1) System.out.print(",  ");
	        String columnName = rsmd.getColumnName(i);
	        System.out.print(columnName);
	      }
	      System.out.println("");
	  
	      while (rs.next()) {//goes through each colume and gets the string associated to it 
	        for (int i = 1; i <= numberofcol; i++) {
	          if (i > 1) System.out.print(",  ");
	          String columnValue = rs.getString(i);
	          System.out.print(columnValue);
	        }
	        System.out.println("");  
	      }
	}
public static void findandremove() throws SQLException {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("put their id in");
	int id = keyboard.nextInt();
	PreparedStatement stmt = connection.prepareStatement(deleterow);//stmt is a statement and this is creating a connection that will let me create a statement
	stmt.setInt(1, id);
	stmt.executeUpdate(deleterow);
	System.out.println(" has been deleted");
	}
}
