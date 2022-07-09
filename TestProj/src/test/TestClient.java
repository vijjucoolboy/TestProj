package test;

import java.util.*;

public class TestClient {

	public static void main(String[] args) {
		
		
		List<String> list = getPermutationCount();
		
		list.forEach(e-> System.out.println(e + ", "));

	}
	
	public static List<String> getPermutationCount (){
		
		String str = "abc";

		char [] strChar = str.toCharArray();

		char [] strChar2;

		List<String> finalList = new ArrayList<>();
		
		strChar2 = strChar;

		for(int i=0; i<strChar.length; i++){

				

			for(int j=0; j<strChar.length; j++){


					if(i!=j)
					{
							char ch = strChar2[i];
							strChar2[i] = strChar2[j];
							strChar2[j] = ch;

							finalList.add(new String(strChar2));
						
					}
			}

		}

		return finalList;
		}

}
