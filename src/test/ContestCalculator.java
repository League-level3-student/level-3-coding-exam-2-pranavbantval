package test;

import java.util.ArrayList;

public class ContestCalculator {

	public ArrayList<Double> calculateWinner(ArrayList<Double> one, ArrayList<Double> two) {
		// TODO Auto-generated method stub
		int oneSum=0;
		int twoSum=0;
		for (int i = 0; i < one.size(); i++) {
			oneSum += one.get(i);
		}
		for (int i = 0; i < two.size(); i++) {
			twoSum+= two.get(i);
		}
		if(oneSum>twoSum) {
		return one;
	}
		else {
			return two;
		}
	}
}


	


