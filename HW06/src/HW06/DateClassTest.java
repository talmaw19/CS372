package HW06;

public class DateClassTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateClass d= new DateClass(2,1,17);
		System.out.printf("%d %d %d\n", d.getDay(),d.getMonth(), d.getYear());
		DateClass d2= new DateClass(6,8,26);
		System.out.printf("%d %d %d", d2.getDay(),d2.getMonth(), d2.getYear());
	}
}
