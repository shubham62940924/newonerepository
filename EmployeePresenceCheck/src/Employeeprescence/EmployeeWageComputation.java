package Employeeprescence;

public class EmployeeWageComputation
{
	public static void main(String args[])
	{
		final int FULL_TIME = 1;
		int emptype = (int)(Math.random()*100 ) %2;
		if (emptype == FULL_TIME)
		{
			System.out.println("emp is present");
		}
		else
			System.out.println("emp is absent");
		
			
		
	}
}
