package ch19.sec06;

import java.io.IOException;

import org.json.JSONObject;

public class CreateJsonExample {

	public static void main(String[] args) throws IOException {
		JSONObject root = new JSONObject();
		
		root.put("id", "winter");
		root.put("name", "한겨울");
		root.put("age", 25);
		root.put("student", true);
		
		JSONObject tel = new JSONObject();
		tel.put("home", "02-1234-1234");
		tel.put("mobile", "010-1234-1234");
		tel.put("tel", tel);
	}

}
