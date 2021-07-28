package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

public class LeitorJson {

	static Map<String, String> mapJson = new HashMap<String, String>();
	static Gson gson = new Gson();
	
	static Reader reader;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		reader = new FileReader("./src/main/resources/MassaTeste.json");
		mapJson = gson.fromJson(reader, Map.class);
		
		System.out.println(mapJson.get("url"));
		System.out.println(mapJson.get("produto"));
		System.out.println(mapJson.get("valor"));
		gravaArquivoJson();

	}
	private static void gravaArquivoJson() throws IOException {
		mapJson.put("url", "http://qaacademy.com.br");
		mapJson.put("curso", "testes automatizados de api");
		mapJson.put("endereço", "Av Paulista, 509");
		
		FileWriter writer = new FileWriter("./src/main/resources/massaTeste_writer.json");
		gson.toJson(mapJson, writer); 
		writer.flush();
		
	}

}
