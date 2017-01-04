package HW06;

public class DateClass {

	
	int month;
	int year;
	int day;
	
	public DateClass (int d, int m, int y ){
		month = m;
		day = d;
		year = y;
	}
	
	public void setMonth(int m)
	{
		month =m;
	}
	public void setDay(int d)
	{
		day =d;
	}
	public void setYear(int y)
	{
		year =y;
	}
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}


}
