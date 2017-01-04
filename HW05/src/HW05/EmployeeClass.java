package HW05;

public class EmployeeClass {

	public static void main(String[] args) {}
		// TODO Auto-generated method stub
		String firstName;
		String lastName;
		double monthlySalary =0;
		
		public EmployeeClass(String first, String last, double monthly)
		{
			lastName= last;
			firstName= first;
			monthlySalary = monthly;
		}
			public void setfName(String first) // this will set the first name and store it, it doesnt return anything
			{
				firstName = first; 
			}
			// in order to get the first name 
			 
			public String getfName()
			{
				return firstName; 
			}
			public void setlName(String last) // this will set the last name and store it, it doesn't return anything
			{
				lastName = last; 
			}
			// in order to get the first name 
			 
			public String getlName()
			{
				return lastName; 
			}
			public void setMonthlySalary(double monthly) 
			{
				if (monthly > 0)
					monthlySalary = monthly;
			}
			
			public double getMonthlySalary()
			{
				return monthlySalary;
			}
}

