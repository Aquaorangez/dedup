/**
 *
 * @author Mick Campitelli
 */

package edu.sbcc.cs105;

public class Main {

	public static void main(String[] args) throws Exception {
		Dedup demo = new Dedup("large.txt");  // large.txt contains 100s of numbers
		
		System.out.println(demo.howMany(2)); // contains 0
		System.out.println(demo.howMany(99)); // contains 0
		System.out.println(demo.howMany(234)); // contains 0
		System.out.println(demo.howMany(638)); // contains 1
		System.out.println(demo.howMany(0)); // contains 0
		
		System.out.println(demo.returnUnique().get(200)); // 324 is the 200th number
		

	}

}
