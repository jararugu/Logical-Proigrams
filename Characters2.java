/* check the Given character is uppercase or lowercase
 * 
 */
package com;

public class Characters2 {
	static void check(char ch)
	{
		if(ch>=65 && ch<=90)
		{
			System.out.println("character is uppercse");
		}
		else if (ch>=90 && ch<=122)
		{
			System.out.println("character is lowercase");
		}
		else {
			System.out.println("invalid");
		}

}
	public static void main(String[] args) 
	{
		check('A');
		check('a');
	}
}

/*
 * output:
character is uppercase
character is lowercase

 */