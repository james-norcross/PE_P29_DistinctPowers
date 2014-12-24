package projecteuler.problem29;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DistinctPowers {

	/**
	 * Author: James Norcross
	 * Date: 12/12/14
	 * Purpose: Project Euler Problem 29
	 * Description: Counts the distinct values of a list consisting of all the integers generated from the expression
	 * a^b where 2<=a<=100 and 2<=b<=100
	 * 
	 */
	public static void main(String[] args) {
		
		
		HashSet<BigInteger> powerSet = new HashSet<BigInteger>();	// note using hashset insures no duplicates
		
		for (int a = 2; a<=100; a++) {
			for (int b = 2; b<=100; b++) {
				powerSet.add(BigInteger.valueOf(a).pow(b));
			}
		}

		System.out.println("The number of distinct terms is " + powerSet.size());
		
	}


}
