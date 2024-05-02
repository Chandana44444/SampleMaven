package json_reading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_02 {
	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();// to parse the json file
		FileReader reader = new FileReader("./resources/json_02.json");// path of json file
		Object obj = jsonparser.parse(reader);// parsing the file which returns object of java type
		JSONObject empjsonobj = (JSONObject) obj;// parsing the file which returns object of json type
		String fname = (String) empjsonobj.get("first_Name");
		String lname = (String) empjsonobj.get("last_Name");
//		String ph_no = (String) empjsonobj.get("lastName");//if present gives value else null

		String ph_no = (String) empjsonobj.get("phone_Number");
		System.out.println("First name:" + fname);
		System.out.println("Last name:" + lname);
		System.out.println("Phone number:" + ph_no);
		System.out.println("*************************");

		JSONArray array = (JSONArray) empjsonobj.get("subjects");
		for (int i = 0; i < array.size(); i++) {
			JSONObject address = (JSONObject) array.get(i);
			String subject_01 = (String) address.get("subject_01");
			String subject_02 = (String) address.get("subject_02");
//			System.out.println("Subjects are: " + i + " is...");
			System.out.println("Priority of Subjects are:" + (i + 1));
			System.out.println("Subject-01 :" + subject_01);
			System.out.println("Subject-02 :" + subject_02);
		}

	}

}
