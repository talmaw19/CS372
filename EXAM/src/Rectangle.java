
public class Rectangle implements Shape {
int WIDTH, LENGTH, ID;
String COLOR;
	
	public Rectangle(int width, int length, int id, String color)
	{
		WIDTH = width;
		LENGTH = length;
		ID = id;
		COLOR =color;
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
