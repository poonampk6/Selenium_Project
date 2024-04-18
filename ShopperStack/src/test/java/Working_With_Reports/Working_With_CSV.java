package Working_With_Reports;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Working_With_CSV 
{
	public static void main(String[] args) throws IOException, CsvException
	{
		FileReader file=new FileReader("./src/test/resources/TestData/File.csv");
		CSVReader reader=new CSVReader(file);
		/*String[] value=reader.readNext();
		for(String string:value)
		{
			System.out.println(string);
		}
		*/
		//System.out.println();
		List<String[]> values=reader.readAll();
		for(String[] strings : values)
		{
			for(String string2:strings)
			{
			System.out.println(string2);
			}
		}
	}
}
