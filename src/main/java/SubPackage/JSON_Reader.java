package SubPackage;

import java.io.FileReader;
import java.util.Iterator;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSON_Reader {	
	
	public static void main (String[] args)
	{
	
/*	public String uname;
	public String pwd;*/
	
	
	
	/*public void  jsonTestdata()
	{*/
		JSONParser parser = new JSONParser();	
		
	
			try {
				 
		        Object obj = parser.parse(new FileReader("Testdata\\sample.json"));
		
		        JSONObject jsonObject = (JSONObject) obj;
		
		        String uname = (String) jsonObject.get("uname");
		        String pwd = (String) jsonObject.get("pwd");
		         JSONArray details = (JSONArray) jsonObject.get("details");
		
		        System.out.println("uname: " + uname);
		        System.out.println("pwd: " + pwd);
		        System.out.println("\ndetails:");
		        Iterator<String> iterator = details.iterator();
		        while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        }
		       
		    } catch (Exception e) {
		        e.printStackTrace();
		    }	
				
			 
			 
		/*}*/
	}

}
