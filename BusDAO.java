package Bus_Reservation;
import java.sql.*;

public class BusDAO 
{
	public void displayBusInfo() throws SQLException
	{
		String query = "Select * from bus ";
		
		Connection con = DB_Connection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println("Bus Number: " + rs.getInt(1));
			
			if(rs.getInt(2) == 0)
			{
				System.out.println("AC: No");
			}
			else
				System.out.println("AC: Yes");
			
			
			System.out.println("Capacity: " + rs.getInt(3));
		}
		
		System.out.println("--------------------------------------------------------");
	}
	
	public int getCapacity(int id) throws SQLException 
	{
		String query = "Select Capacity from Bus where Id=" + id;
		
		Connection con = DB_Connection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		
		return rs.getInt(1);
		
	}

}
