package Bus_Reservation;
import java.sql.*;

public class DB_Connection 
{
	private static String url      = "jdbc:mysql://localhost:3306/BusReservation";
	private static String userName = "root";
	private static String passWord = "MySQL@2003";
	
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(url, userName, passWord);
	}

}
