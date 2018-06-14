import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Not a Good Solution
public class Anagrams {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

	private static boolean isAnagram(String a, String b) {
		boolean isAnagram = true;
		Map<Character,Integer> firstMap = new HashMap<>();
		Map<Character,Integer> secondMap = new HashMap<>();
		
		if(a.length()==b.length()){
			
			for(int i=0;i<a.length();i++){
				Character aChar = a.charAt(i);
				Character bChar = b.charAt(i);
				if(firstMap.containsKey(aChar)){
					firstMap.put(aChar, firstMap.get(aChar)+1);
				}else{
					firstMap.put(aChar,1);
				}
				
				if(secondMap.containsKey(bChar)){
					secondMap.put(bChar, secondMap.get(bChar)+1);
				}else{
					secondMap.put(bChar,1);
				}
				
			}
			
			if(firstMap.size() == secondMap.size()){
				
				for(Map.Entry<Character, Integer> entry : firstMap.entrySet()){
					
					Integer secondMapValue = null;
					if(secondMap.get(entry.getKey())!=null){
						secondMapValue = secondMap.get(entry.getKey());
					}else if(secondMap.get(Character.toLowerCase(entry.getKey().charValue()))!=null){
						secondMapValue = secondMap.get(Character.toLowerCase(entry.getKey().charValue()));
					}else{
						secondMapValue = secondMap.get(Character.toUpperCase(entry.getKey().charValue()));
					}
					
					if(secondMapValue!=entry.getValue()){
						isAnagram=false;
					}
				}
			}else{
				isAnagram = false;
			}
		}else{
			isAnagram = false;
		}
		return isAnagram;
	}
}
