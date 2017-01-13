/*
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EmployeeID {
	private static final int MinNumber = 1110000;
    private static int LastNumber = MinNumber;

private static Map<Integer, Employee> emplo = new HashMap<Integer, Employee>();
	
private int number;
private int emploID;
private String workPlace;
public EmployeeID(int id, String work)
{
	emploID = id;
	workPlace = work; 
	number = LastNumber;
}

public int getEmploID(){
	return emploID;
}
public String getWork(){
	return workPlace;
}
public String getNumber(){
	return String.format( "%d-%04d", number / 1000, number % 10000);
}
public Integer getNum()
{
	return number;
}
)


private static String[] fName ={"Kenna","Angel","Sam","Jason","Kim","George","Emily", "Alfalfa"};
private static String[] lName = {"Larson", "Washington", "AppleBottom", "Wiser", "Golden", "Olldy", "Cramer", "Trator", "Smiliez"};
private static String[] worrk = {"Totem middle Scool", "Main High School", "Maple Vally City Hall", "Ash Wipe City Hall", "Oak Tree Middle School"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	private static void employeeDirectory(){
		Random ran = new Random();
		for (int i=0; i<100; i++)
			{
			Employee em = new Employee
					(
							 String.format("%s %s", fName[ran.nextInt(fName.length)]), lName[ran.nextInt(lName.length)],
							 String.format("%d %s", ran.nextInt(900)+100, worrk[ran.nextInt(worrk.length)])
					);
			emplo.put(em.getNum(), em);
			}
	}
}
*/