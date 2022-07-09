package test;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		
		
		String str = "abcbcaccb";
		
		getFreq(str);

	}
	
	
	public static void getFreq(String str) {
		
		
		char [] strChar = str.toCharArray();
		
		Map<Character, Integer> map =  new HashMap<>();
		
		
		
		for(int i=0; i<strChar.length; i++) {
			
			map.put(strChar[i], map.get(strChar[i])==null?1:map.get(strChar[i])+1);
		}
		
		map.entrySet().forEach(e->System.out.println(e.getKey()+ " : "+e.getValue()));
		
	}

}
