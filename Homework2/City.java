/**
* The Java Application Development Homework Assignment 2 implements an application that 
* simply displays the city and everything within including the people, workers, and the jobs it holds. 
* 
*
* @author Tersa Motbaynor Almaw 
* @version 1.0 
* @since 1/5/2017
* 
*/ 

import java.util.Scanner;
import java.util.ArrayList;
/**
*   this models a city which holds people, and buildings.
*
*
*/
public class City{
public static void main (String[] args)
{
Person[] people = { new Teacher("Kenna", 26, 9856423, "Computer Science", 12), 
					new Teacher("Angel", 32, 5642369, "English", 9), 
					new Teacher("Sam", 29, 2565487, "Math", 11), 
					new Police("Jason", 54, 5698885, Police.Rank.Cheif), 
					new Police("Kim", 30, 4565656, Police.Rank.Sargent),
					new Kid("George", 16, 2226545, "Snickers"),
					new Kid("Emily",15, 1645545, "Kit Kat")};
					
Building[] building = { new CityHall ("EJ" , "12th Ave NE Bellevue" ), 
						new School (" Northeast High School", "Oakland Park 1st Ave, Chyrsler 300" )};
						
						
System.out.println("the people in the city \n");
	for (int i =0; i <people.length; i++)
	{
		System.out.printf("%s,%d,%d\n", people[i].getName(), people[i].getAge(), people[i].getPhoneNumber()); 
	}	
	

        System.out.println();
        
        String teacher1 =people[0].getName();
        String teacher2 =people[1].getName();
        String teacher3 =people[2].getName();
        String POfficer1 =people[3].getName();
        String POfficer2 =people[4].getName();
		String kid1 = people[5].getName();
		String kid2 = people[6].getName();
       
		School skool = (School) building[1];
        skool.addOccupation(teacher1);
        skool.addOccupation(teacher2);
        skool.addOccupation(teacher3);
		skool.addOccupation(kid1);
		skool.addOccupation(kid2);
        skool.showTheOccupants();
		
		CityHall cityH= (CityHall) building[0];
        cityH.addOccupation(POfficer1);
        cityH.addOccupation(POfficer2);
        cityH.showTheOccupants();
        
		
         
        Teacher t1 =(Teacher)people[0];
		t1.pay();
		System.out.printf("\n the teacher %s monthly pay is: %d ", t1.getName(), t1.pay());
        Teacher t2 =(Teacher)people[1];
		t2.pay();
		System.out.printf("\n the teacher %s monthly pay is: %d ", t2.getName(), t2.pay());
		Teacher t3 =(Teacher)people[2];
		t3.pay();
		System.out.printf("\n the teacher %s monthly pay is: %d \n ", t3.getName(), t3.pay());
		
		
        System.out.println();
System.out.println("the Buildings of the city ");
	for (int i = 0; i < building.length; i++)
	{
		System.out.printf("%s,%s\n", building[i].getName(), building[i].getAddress());

	}
       
        
      
}
}