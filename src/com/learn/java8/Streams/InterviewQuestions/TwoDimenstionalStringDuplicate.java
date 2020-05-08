package com.learn.java8.Streams.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Remove duplicates from two dimentional strings. If reversal element of an element is already present that element should also be considered as duplicate
//ex { "U1,U2", "U3,U4", "U2,U1", "U1,U5" } should result in { "U1,U2", "U3,U4","U1,U5" } 

public class TwoDimenstionalStringDuplicate {

	public static void main(String args[]) {

		String[] strArray = { "U1,U2", "U3,U4", "U2,U1", "U1,U5" };

		List<String> strList = Arrays.asList(strArray);

		List<String> finalList = new ArrayList<String>();

		for (String temp : strList) {

			if (toAddorIgnore(temp, finalList)) {
				finalList.add(temp);
			}
		}

		System.out.println(finalList);
	}

	private static boolean toAddorIgnore(String ele, List<String> finalList) {

		String[] strToken = ele.split(",");

		String reversedString = strToken[1] + "," + strToken[0];

		if (finalList.contains(ele) || finalList.contains(reversedString)) {
			return false;
		}

		return true;
	}

}
