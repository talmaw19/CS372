import java.util.Scanner; 

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bmi =new Scanner (System.in);
		System.out.printf("Enter Weight in Pounds");
			int weight = bmi.nextInt(); //reads an integer from data source
		System.out.printf("Enter Height in Inches");
		
	
		int height = bmi.nextInt();
		
		double index= (weight *703)/ (height * height) ;
		
		System.out.printf("Body Mass Index is :" + index);
		
		if ( index >= 30 ) // if index is greater than or equal to 30 
			System.out.printf("BMI: Values is Obese\n");
		else if (index >= 25) // if index is greater than or equal to 25
			System.out.printf("BMI: Values is Overweight\n");
		else if (index >= 18.5) //  if index is greater than or equal to 18.5
			System.out.printf("BMI: Values is Normal\n");
		else // if index is less than 18.5
			System.out.printf("BMI: Values is Underweight\n");
		
	}

}
