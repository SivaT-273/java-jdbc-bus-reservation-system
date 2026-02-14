package Bus_Reservation;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking 
{
	String passengerName;
	int busNo;
	Date date;
	
	Booking(Scanner sc)
	{
	    System.out.println("Enter Passenger Name: ");
	    passengerName = sc.next();

	    System.out.println("Enter Bus Number: ");
	    busNo = sc.nextInt();

	    System.out.println("Enter Travel Date(dd-mm-yyyy): ");
	    String dateInput = sc.next();

	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	    try
	    {
	        date = dateFormat.parse(dateInput);
	    }
	    catch (ParseException e)
	    {
	        e.printStackTrace();
	    }
	}

	
	public boolean isAvailable() throws SQLException
	{
		BusDAO busDao = new BusDAO();
		int capacity = busDao.getCapacity(busNo);
		
		BookingDAO bookingDao = new BookingDAO();
		int booked = bookingDao.getBookedCount(busNo, date);
		return booked < capacity; 
	}

}
