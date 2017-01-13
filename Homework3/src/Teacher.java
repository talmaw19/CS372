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
* Teacher inherits from a person and is an employee 
*/
public class Teacher extends Person //implements Employee
{
	String Certification;
	int grade;
	
	public Teacher(String name, int age, int pNum, String cert, int grd )
	{
		Name = name;
		Age = age;
		phoneNumber =pNum;
		Certification = cert;
		grade=grd;
	}
//public ArrayList<String>employee = new ArrayList<String> ();
/**
* this method creates an integer with a name of method pay which hold no @param 
* has a @return pay type
*/
	public int pay(){
		int pay =1500;
		return pay;
	}
/** this method creates an integer with a name of method id which hold no @param 
* has a @return d type
* the method body creates a 
*
*/
	public int id(){
		Scanner identification = new Scanner(System.in);
		int d = identification.nextInt();
		return d;
	}
}
