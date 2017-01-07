import java.util.ArrayList;
/**
* @author Tersa Motbaynor Almaw 
* @version 1.0 
* @since 1/5/2017
* 
*
*/

/** 
* CityHall inherits from building and has an array list of ocupants 
*/
public class CityHall extends Building 
{
/**
* cityhall is a method that holds 2 string @param called name and address 
*/
	public CityHall(String name, String add)
	{
		Name= name;
		address= add;
	}
	public ArrayList<String>occupants = new ArrayList<String> ();	
	/**
* The method class calls the name of the works "occupants" and their address where they work at
*
*/
	public void addOccupation(String name)
	{
		occupants.add(name);
	}
	
	public void showTheOccupants()
	{
		System.out.printf("The total number of Occupants in the cityhall is: \n");
		for (String num:occupants)
		{
			System.out.printf("%s \n", num);
		}
	}
}