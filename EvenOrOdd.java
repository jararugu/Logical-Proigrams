/*
 * check the number is even or odd
 */
package com;
public class EvenOrOdd {
	
	static void check(int num)
	{
		if(num%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
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
