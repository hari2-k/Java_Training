package StudentColln;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion." + 
					"This has never happened before";
		
		Map<String,Integer> stringOccurances = new HashMap<>();
		String[] words = str.split(" ");
		
		for(String word:words) {
			Integer integer = stringOccurances.get(word);
			if(integer==null) {
				stringOccurances.put(word,1);
			}else {
				stringOccurances.put(word, integer+1);
				
			}
		}
			System.out.println(stringOccurances);

	}

}
	