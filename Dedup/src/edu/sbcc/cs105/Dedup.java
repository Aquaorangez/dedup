/**
 * CS 105 Theory and Practice I
 * CRN: 39626
 * Assignment: Dedup
 *
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 *
 * @author Mick Campitelli
 */

package edu.sbcc.cs105;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Creates an ArrayList of integers and adds value to it from an input file.
 * Has methods to return the number of duplicates and an ArrayList without duplicates
 * in ascending order
 * 
 * @author mccampitelli
 *
 */
public class Dedup {
	ArrayList<Integer> list = new ArrayList<Integer>();  
	File input;  // the file where the integer inputs are read from

	public Dedup(String filename) throws Exception {
		this.input = new File(filename);
		Scanner s = new Scanner(this.input);

		while (s.hasNextInt()) {
			list.add(s.nextInt());
		}
		s.close();

	}

	/**
	 * Returns the number of duplicates of a chosen value
	 * 
	 * @param ofThisValue
	 * 		The value which we check for duplicates of
	 * @return the number of duplicates
	 * 
	 */
	public int howMany(int ofThisValue) {
		int count = 0;

		for (int i = 0; i < this.list.size(); i++) {
			if (list.get(i) == ofThisValue) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Removes duplicate values and sorts the resulting ArrayList in ascending order
	 * 
	 * @return an ascending ArrayList of unique values
	 */
	public ArrayList<Integer> returnUnique() {
		ArrayList<Integer> unique = new ArrayList<Integer>();

		for (int i = 0; i < this.list.size(); i++) {
			if (!unique.contains(this.list.get(i))) {
				unique.add(this.list.get(i));
			}
		}
		Collections.sort(unique);
		
		return unique;
	}
}
