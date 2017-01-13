/**
*
* @author Tersa Motbaynor Almaw 
* @version 1.0 
* @since 1/5/2017
* 
*/
import java.util.ArrayList;

/**
* School inherits from building and has an array list of ocupants 
*
*/
public class School extends Building 
{
	public School(String name, String add)
	{
		Name= name;
		address= add;
	}
	public ArrayList<String>occupants = new ArrayList<String> ();
/**
* The method class calls the name of the works "occupants" and their address where they work at
*
* this method addOccupation has an if-else statement: if the occupants contains a name it has workers but if it doesn't it adds workers 
* @param name
*/
	public void addOccupation(String name)
	{
		if (occupants.contains (name)) {}
		else 
				occupants.add(name);			
	}
	public void removeOccupation(String name)
	{
		occupants.remove(name);
	}
	
	public void showTheOccupants()
	{
		System.out.printf("The total number of Occupants in the school is: ");
		for (String num:occupants)
		{
			System.out.printf("%s \n",num);
		}
	}
}