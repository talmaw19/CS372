
public class Triangle implements Shape {
int SIDE1, SIDE2, SIDE3, ID;
String COLOR;

	public Triangle(int side1, int side2,int side3, int id, String color)
	{
		SIDE1 = side1;
		SIDE2 = side2;
		SIDE3 = side3;
		ID = id;
		COLOR = color;	
	}
	@Override
	public String getKind() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDetailString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
