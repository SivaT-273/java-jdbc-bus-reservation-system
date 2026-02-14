package Bus_Reservation;

import java.sql.SQLException;
import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args) throws SQLException
    {
        Scanner sc = new Scanner(System.in);

        BusDAO busDao = new BusDAO();
        busDao.displayBusInfo();

        while(true)
        {
            System.out.println("\n===== BUS RESERVATION MENU =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            int userOpt = sc.nextInt();

            switch(userOpt)
            {
                case 1:

                    Booking booking = new Booking(sc);

                    if(booking.isAvailable())
                    {
                        BookingDAO bookingDao = new BookingDAO();
                        bookingDao.addBooking(booking);

                        System.out.println("Booking Confirmed!");
                    }
                    else
                    {
                        System.out.println("Booking Full. Try another bus/date.");
                    }
                    break;

                case 2:
                    System.out.println("Thank you for using Bus Reservation System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}























































/* public class MainClass 
{
	public static void main(String[] args)
	{
		BusDAO busDao = new BusDAO();
		
		try
		{
			busDao.displayBusInfo();
			
			int userOpt=1;
			Scanner sc = new Scanner(System.in);
			
			while(userOpt == 1)
			{
				System.out.println("Enter 1 for Booking 2 to Exit ");
				userOpt = sc.nextInt();
				
				if(userOpt == 1)
				{
					Booking booking = new Booking();
					
					if(booking.isAvailable())
					{
						BookingDAO bookingDao = new BookingDAO();
						bookingDao.addBooking(booking);
						System.out.println("Booking is Confirmed !");
					}
					else
						System.out.println("Bookings Full, Try another Bus or Date !");
				}
			}
			
			System.out.println("Thank you for using the service!");
			
			sc.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

} */

