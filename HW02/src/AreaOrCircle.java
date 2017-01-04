import java.util.Scanner; 

public class AreaOrCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Enter the circles radius ");
		Scanner num= new Scanner(System.in); // sets it to a new scanner which is a raw data source
		double radius = num.nextDouble(); // reads a double from data source 
		double area = Math.PI*(radius * radius );
		System.out.printf("The Area of the circle is:" + area );
	}

}
