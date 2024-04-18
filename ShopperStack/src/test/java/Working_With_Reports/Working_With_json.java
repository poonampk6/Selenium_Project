package Working_With_Reports;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Working_With_json 
{
	public static void main(String[] args) throws IOException, ParseException
	{
		FileReader file=new FileReader("./src/test/resources/TestData/json.json");
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(file);
		JSONObject map=(JSONObject) obj;
		System.out.println(map.get("url"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		System.out.println(map.get("phoneno"));
	}

}
