import java.util.Scanner; 

public class OddOrEven
{
	public static void main(String[] args)
	{
		int x;
		System.out.printf("Enter an integer\n");
		Scanner num= new Scanner (System.in);
		x= num.nextInt();
		
		if(x%2!=0)
			System.out.printf("this number you have entered is an odd number");
		else 
			System.out.printf("this number you have entered is an even number");
	
	}
	
}