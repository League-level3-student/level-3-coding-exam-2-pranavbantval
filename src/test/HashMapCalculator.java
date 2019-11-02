package test;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {

	public ArrayList<String> commonKeyValues(ArrayList<Integer> lst, HashMap<Integer, String> hm) {
		// TODO Auto-generated method stub
	
		ArrayList<String> words = new ArrayList<String>();
		for (int i = 0; i < lst.size(); i++) {
			
			if(hm.get(lst.get(i)) != null) {
				words.add(hm.get(lst.get(i)));
			}
		}
		return words;
	}

}
