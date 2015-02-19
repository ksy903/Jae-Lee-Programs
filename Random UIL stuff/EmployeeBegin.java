import java.util.*;
import java.io.*;

public class EmployeeBegin
{

   public static void main (String[] args)
   {
		Scanner read = new Scanner(System.in);

		System.out.print("Username: ");
		String username = read.next();
		System.out.print("Password: ");
		String password = read.next();

		while(!username.equals("username") || !password.equals("password"))
		{
			System.out.println("Wrong username and/or password");
			System.out.print("Username: ");
			username = read.next();
			System.out.print("Password: ");
			password = read.next();
		}
		System.out.println("");
		System.out.println("ACCESS GRANTED!");
		System.out.println("");
		System.out.println("");
		System.out.println("*********************************************");
		System.out.println("");
		System.out.println("");

		System.out.print("Enter employee full name: ");
		String firstName = read.next();
		String lastName = read.next();
		String fullName = firstName + " " + lastName;
		System.out.print("Enter employee pay hourly rate: ");
		double hourRate = read.nextDouble();
		System.out.print("Enter hours worked: ");
		int hourWorked = read.nextInt();
		System.out.println("");
		System.out.println("");
		System.out.println("************************************************************");
		System.out.println("						PAYROLL REPORT");
		System.out.println("************************************************************");

		Employee e = new Employee(fullName, hourRate, hourWorked);

		//cut OT payrate to 2 decimal but dont round.

		System.out.print("ID: " + e.getEmpID());
		System.out.println("");
		System.out.print("First Name: " + e.getFirstName());
		System.out.println("");
		System.out.print("Last Name: " + e.getLastName());
		System.out.println("");
		System.out.print("Regular Pay Rate: $");
		System.out.printf("%.2f", e.getRegHourlyPayRate());
		System.out.print("/hour");
		System.out.println("");
		System.out.print("Regular hours: " + e.getHoursWorked() + " hours");
		System.out.println("");
		System.out.print("Regular hour pay: $" );
		System.out.printf("%.2f", e.getRegTotalPay());
		System.out.println("");
		System.out.print("Overtime hour: " + e.getOtHours() + " hours");
		System.out.println("");
		System.out.print("Overtime pay rate: $");
		System.out.printf("%.2f", e.getOtHourlyPayRate());
		System.out.print("/hour");
		System.out.println("");
		System.out.print("Overtime Pay: $");
		System.out.printf("%.2f", e.getOtTotalPay());
		System.out.println("");
		System.out.print("Total Pay: $");
		System.out.printf("%.2f", e.getTotalPay());
		System.out.println("");
   }
}
