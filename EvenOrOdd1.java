/*   check the number is even or odd without using modulus.
 * 
 */
package com;

public class EvenOrOdd1 {
	static void check(int num)
	{
		if(num/2*2==num)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
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
