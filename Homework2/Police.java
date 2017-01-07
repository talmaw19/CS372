/**
* @param specidies the polices name, age, and phone number 
* @author Tersa Motbaynor Almaw 
* @version 1.0 
* @since 1/5/2017
* 
*/
import java.util.Scanner;
import java.util.ArrayList;

/**
* intitalize the police object with a given name, age, and phone Number
* police inherits from a person and is an employee 
*/
public class Police extends Person implements Employee
{

	
	public Police(String name, int age, int pNum, Rank r )
	{
		Name = name;
		Age = age;
		phoneNumber =pNum;
		role = r;
	}
	public enum Rank {Patrol, Sargent, Captin, Cheif}
	private Rank role;
	public Rank getJobRole() {return role;}
	public void setJobRole(Rank jR) {role = jR;}
	public ArrayList<String>employee= new ArrayList<String> ();
/**
* this method creats an integer with a name of method pay which hold no @param 
* has a
*@return pay 
*
*
*/
	public int pay()
	{
		int pay =1500;
		return pay;
	}
	/**
* this method creats an integer with a name of method id which hold no @param 
* @return d 
* the method body creates a 
*
*/
	public int id(){
		Scanner identification = new Scanner(System.in);
		int d = identification.nextInt();
		return d;
	}
}
