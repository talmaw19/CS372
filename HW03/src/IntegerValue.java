import java.util.Scanner; 

public class IntegerValue {
	public static void main(String[] args){
	char[] val = {'A','B','C','a','b','c','0','1','2','$','*','+','/',' '};
	
		for(int i = 0; i < val.length; i++)
		{
			System.out.printf("the character %c has the values %d\n", val[i],((int)val[i]));
		}
	}
}
