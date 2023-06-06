/*  check the number is even or odd without using if-else 
 * 
 *  or
 *  
 *  check the number is even or odd using switch case
 * 
 */

package com;

public class EvenOrOdd2 {
	
	static void check(int num)
	{
		switch(num%2)
		{
		case 0: System.out.println("number is even");
		          break;
		case 1: System.out.println("number is odd");
		//default: System.out.println("number is odd");
		
		      
		}
	}
	public static void main(String[] args) {
		check(4);
	}

}

/* output:
 *  if you pass the 4  ,it will gives the output as "number is even".
 *  if you pass the 5 , it will gives the output as "number is odd".
 * 
 */
