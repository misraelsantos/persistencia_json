package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

public class LeitorJson {

	static Map<String, String> mapJson = new HashMap<String, String>();
	static Gson gson = new Gson();
	
	static Reader reader;
	

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		reader = new FileReader("./src/main/resources/MassaTeste.json");
		mapJson = gson.fromJson(reader, Map.class);
		
		System.out.println(mapJson.get("url"));
		System.out.println(mapJson.get("produto"));
		System.out.println(mapJson.get("valor"));


	}

}
