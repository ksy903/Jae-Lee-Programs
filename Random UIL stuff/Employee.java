import java.util.*;
public class Employee
{
	private String fullName;
	private int hoursWorked;
	private double hourlyPay;
	Random RanGen = new Random();
	public Employee(String name, double pay, int hours)
	{
		fullName = name;
		hoursWorked = hours;
		hourlyPay = pay;
	}
	public int getEmpID()
	{
		return RanGen.nextInt(1000)+1;
	}
	public String getFirstName()
	{
		int space = fullName.indexOf(' ');
		return fullName.substring(0, space+1);
	}
	public String getLastName()
	{
		int space = fullName.indexOf(' ');
		return fullName.substring(space, fullName.length());
	}
	public double getRegHourlyPayRate()
	{
		return hourlyPay;
	}
	public double getHoursWorked()
	{
		if(hoursWorked > 40)
			return 40;
		else
			return hoursWorked;
	}
	public double getOtHours()
	{
		if(hoursWorked > 40)
			return hoursWorked-40;
		else
			return 0;
	}
	public double getOtHourlyPayRate()
	{
		return hourlyPay * 1.5;
	}
	public double getRegTotalPay()
	{
		if(hoursWorked > 40)
			return (hoursWorked-(hoursWorked-40)) * hourlyPay;
		else
			return(hoursWorked*hourlyPay);
	}
	public double getOtTotalPay()
	{
		if(hoursWorked > 40)
			return ((hoursWorked-40) * (hourlyPay * 1.5));
		else
			return 0;
	}
	public double getTotalPay()
	{
		if(hoursWorked > 40)
			return ((40 * hourlyPay) + ((hoursWorked-40) * (hourlyPay * 1.5)));
		else
			return(hoursWorked*hourlyPay);
	}
}
