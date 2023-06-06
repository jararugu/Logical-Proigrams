/* check the given character Alphabet or not 
 * 
 */

package com;

public class Alphabet {
	  
	 static void check(char ch) {
		 
		 if(ch>=65 && ch<=122)
		 {
			 System.out.println("Alphabet");
		 }
		 else
		 {
			 System.out.println("not a Alphabet");
		 }
	 }
	 public static void main(String[] args) {
		 check('a');
		 check('A');
		check('2');
		
	}

}
/* output:
Alphabet
Alphabet
not a Alphabet
 */

