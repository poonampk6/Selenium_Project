package genericUtility;

import java.time.LocalDate;
import java.util.Random;

public class JavaUtility 
{
	public int randomNumber()
	{
		Random r=new Random();
		int value=r.nextInt();
		return value;
	}
	
	public String localDate()
	{
		String date=LocalDate.now().toString().replace("-","");
		System.out.println(date);
		return date;
	}
	
	public String localDateTime()
	{
		String dateTime=LocalDate.now().toString().replace("-","");
		System.out.println(dateTime);
		return dateTime;
	}
}
