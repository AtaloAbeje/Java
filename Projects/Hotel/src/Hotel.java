import java.util.Scanner;

public class Hotel 
{
	Scanner in = new Scanner(System.in);
	
	String Name;
	String City;
	Integer Rooms;
	Integer Free;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) 
	{
		if(name.length() <= 30)
			Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) 
	{
		if(city.length() <= 20)
			City = city;
	}
	public Integer getRooms() 
	{
		return Rooms;
	}
	public void setRooms(Integer rooms) 
	{
		Rooms = rooms;
	}
	public Integer getFree() 
	{
		return Free;
	}
	public void setFree(Integer free) 
	{
		Free = free;
	}
	
	public Hotel() // constructure empty
	{
		this.Name = "NA";
		this.City = "NA";
		this.Rooms = 0;
		this.Free = 0;
	}
	public Hotel(String name, String city, Integer rooms, Integer free) 
	{

		Name = name;
		City = city;
		Rooms = rooms;
		Free = free;
	}
	
	public void Print()
	{
		System.out.println("Hotel: "+Name+" "+"City: "+City+" "+ "Engaged Rooms: "+(Rooms-Free)+" "+ "Vacant Rooms:"+Free);
	}
}
