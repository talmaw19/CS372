/**
* Person is a base class and this class repesents any class in the city 
* @author Tersa Motbaynor Almaw 
* @version 1.0 
* @since 1/5/2017
* 
*/
public abstract class Person
{
	String Name;
	int Age;
	int phoneNumber;
/**
* string getName is a method with no @param 
* @return name 
*
*/
	public String getName(){
		return Name;
	}
/**
* int getAge is a method with no @param 
* @return age
*
*/
	public int getAge() {
		return Age;
	}
/**
* int getPhoneNumber is a method with no @param 
* @return phoneNumber
*/
	public int getPhoneNumber()
	{
		return phoneNumber;
	}
}
