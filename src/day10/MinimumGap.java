package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumGap {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>(Arrays.asList(7 , 1, 3, 4, 1, 7));
		System.out.println(minimumGap(intList));
		

	}
	
	public static int minimumGap(List<Integer> intList) {
		List<Integer> tempList = new ArrayList<>();
		int minGap = intList.size();
		String intToArray = "";
		
		for (int i = 0; i < intList.size(); i++ ) {
			intToArray += Integer.toString(intList.get(i));
		}
		
		for (int i = 0; i < intList.size(); i++) {
			if (tempList.indexOf(intList.get(i)) == -1) {
				tempList.add(intList.get(i));
			} else {
				int firstDupIndex = intToArray.indexOf(Integer.toString(intList.get(i)));
				int secondDupIndex = intToArray.indexOf(Integer.toString(intList.get(i)), firstDupIndex + 1);
				minGap = minGap(minGap, secondDupIndex - firstDupIndex);
			}
		}
		
		return minGap;
	}
	
	public static int minGap (int minGap, int tempMinGap) {
		if (minGap < tempMinGap) {
			return minGap;
		} else {
			return tempMinGap;
		}
	}

}
