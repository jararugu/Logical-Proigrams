/*  check the character is uppercase or lowercase or Numeric or special
 * 
 */

package com;

public class Characters {
	
	static void check(char ch)
	{
		if(ch>=65 && ch<=90)
		{
			System.out.println("character is uppercse");
		}
		else if(ch>=90 && ch<=122)
		{
			System.out.println("character is lowercase");
		}
		else if(ch>=48 && ch<=57)
		{
			System.out.println("character is numeric");
		}
		else
		{
			System.out.println("character is speacial");
		}
	}
	public static void main(String[] args) {
		check('@');
	}
	
}
 /*output:
  * if you pass A,it gives the character is uppercase.
  * if you pass a, it gives the character is lowercase.
  * if you pass 2, it gives the character is numeric.
  * if you pass &, it gives the character is special.
  */
