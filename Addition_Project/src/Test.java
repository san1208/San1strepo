import java.util.HashMap;
import java.util.Map;


public class Test {

	public static void main(String[] args) {
		
		

		String String ="rama";
		System.out.println(String);
		Map<String, String> hashMap = new HashMap<>();

		hashMap.put("1", "one");
		hashMap.put("2", "two");
		hashMap.put("12", "twelve");
		hashMap.put("11", "eleven");

		// array to store keys of the HashMap
		String[] key = new String[hashMap.size()];

		// array to store values of the HashMap
		String[] value = new String[hashMap.size()];

		int i = 0;

		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			key[i] = entry.getKey();
			value[i++] = entry.getValue();
		}

		for (i = 0; i < hashMap.size(); i++)
			System.out.println( "{" + key[i] + "=" + value[i] + "}" );
              	
}

	}


