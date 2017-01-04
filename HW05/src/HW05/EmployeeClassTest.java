package HW05;

public class EmployeeClassTest {

	public static void main(String[] args)
	{
		    EmployeeClass employee1 = new EmployeeClass ("Emily", "Smith", 25650);
            EmployeeClass employee2 = new EmployeeClass ("Jason", "Larson", 5800);
            double employee1MonthlySal = employee1.getMonthlySalary()*12;
            double employee2MonthlySal = employee2.getMonthlySalary()*12;
            System.out.printf("%s %s’s yearly salary is %f \n", employee1.getfName(),employee1.getlName(), employee1MonthlySal);
            System.out.printf("%s %s’s yearly salary is %f \n", employee2.getfName(),employee2.getlName(), employee2MonthlySal);
            employee1.setMonthlySalary(5564);
            employee2.setMonthlySalary(4562);
            employee1MonthlySal = employee1.getMonthlySalary()*12;
            employee2MonthlySal = employee2.getMonthlySalary()*12;
            System.out.printf("%s %s’s yearly salary is %f \n", employee1.getfName(),employee1.getlName(), employee1MonthlySal);
            System.out.printf("%s %s’s yearly salary is %f \n", employee2.getfName(),employee2.getlName(),employee2MonthlySal);
	}
}
