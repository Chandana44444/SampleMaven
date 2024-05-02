package json_reading;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;

public class Json_01 {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectNode jsonNode = objectMapper.createObjectNode();
		jsonNode.put("name", "Abc");
		jsonNode.put("age", 23);
		jsonNode.put("city", "Blore");
		jsonNode.put("state", "Karnataka");
		jsonNode.put("country", "India");
		objectMapper.writeValue(new File("./resources/mydata.json"), jsonNode);
	}
}
