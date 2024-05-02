package json_reading;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_03 {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader path = new FileReader("./resources/Json_03.json");
		JSONParser json_parse = new JSONParser();// everything in json is stored in form of key:value pair of string
													// form
		Object obj = json_parse.parse(path);
		JSONObject json_obj = (JSONObject) obj;
		System.out.println("First name:" + (String) json_obj.get("first_name"));
		System.out.println("Last name:" + (String) json_obj.get("last_name"));
		System.out.println("Phone number:" + (String) json_obj.get("phone_no"));

	}
}
