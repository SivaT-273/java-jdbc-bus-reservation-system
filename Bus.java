package Bus_Reservation;

public class Bus 
{
	private int busNo;
	private boolean AC;
	private int capacity;
	
	Bus(int num, boolean ac, int cap)
	{
		this.busNo = num;
		this.AC = ac;
		this.capacity = cap;
	}
	
	public int getBusNo()
	{
		return busNo;
	}
	
	public boolean isAC()
	{
		return AC;
	}
	
	public void setAC(boolean val)
	{
		AC = val;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public void setCapacity(int cap)
	{
		capacity = cap;
	}
}
