/* package codechef; // don't place package name! */

/**
 Chef's son Chefu found some matches in the kitchen and he immediately starting playing with them.

The first thing Chefu wanted to do was to calculate the result of his homework — the sum of AA and BB, and write it using matches. 
Help Chefu and tell him the number of matches needed to write the result.

Digits are formed using matches in the following way:
Input

    The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
    The first and only line of each test case contains two space-separated integers AA and BB.

Output

For each test case, print a single line containing one integer — the number of matches needed to write the result (A+BA+B).
Constraints

    1≤T≤1,0001≤T≤1,000
    1≤A,B≤1061≤A,B≤106

Sample 1:
Input
Output

3
123 234
10101 1010
4 4

13
10
7

Explanation:

Example case 1: The result is 357357. We need 55 matches to write the digit 33, 55 matches to write the digit 55 and 33 matches to write the digit 77.

Example case 2: The result is 1111111111. We need 22 matches to write each digit 11, which is 2⋅5=102⋅5=10 matches in total.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		for(int i=0; i<testCases; i++) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    
		    int sum = A+B;
		    String str = String.valueOf(sum);
		    int strLen = str.length();
		    int count = 0;
		    
		    for(int j=0; j<strLen; j++) {
		        char c = str.charAt(j);
		        if((Character.compare(c, '0') == 0) || (Character.compare(c, '6') == 0) || (Character.compare(c, '9') == 0)) {
		            count+=6;
		        } else if((Character.compare(c, '2') == 0) || (Character.compare(c, '3') == 0) || (Character.compare(c, '5') == 0)) {
		            count+=5;
		        } else if(Character.compare(c, '1') == 0) {
		            count+=2;
		        } else if(Character.compare(c, '4') == 0) {
		            count+=4;
		        } else if(Character.compare(c, '7') == 0) {
		            count+=3;
		        } else {
		            count+=7;
		        }
		    }
		    System.out.println(count);
		}
		sc.close();
		
	}
}
