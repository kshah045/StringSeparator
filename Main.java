/**
 * 
 */
package com.kshah007.page1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kirtan
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String temp = ", Hello World ! Its Kirtan .";
		String sep = " ";

		String[] words = temp.split(" ");
		List<String> listWords = Arrays.asList(words);
		Map<Integer, String> indexs = new HashMap<>();
		int index = 0;
		for (String word : listWords) {
			if (word.equals(",") || word.equals(".") || word.equals("!")) {
				indexs.put(index, word);
			}
			index++;
		}

		Collections.reverse(listWords);

		StringBuilder original = new StringBuilder();
		for (String x : listWords) {
			original.append(x);
			original.append(sep);
		}

		System.out.println("Orignal= " + temp);
		System.out.println("OriginalRever= " + original);

		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (String word : listWords) {
			if (indexs.containsKey(count)) {
				sb.append(indexs.get(count));
				sb.append(" ");
				count++;
			} else if (word.equalsIgnoreCase(",") || word.equalsIgnoreCase(".") || word.equalsIgnoreCase("!")) {
			} else {
				sb.append(word);
				sb.append(" ");
				count++;
			}
		}

		System.out.println("New= " + sb);
	}

	public static void testingBranch1() {
		System.out.println("testing the new branch 1")
	}

}
