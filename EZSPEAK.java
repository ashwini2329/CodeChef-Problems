/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		
		for(int j=0; j<testCases; j++) {
		    int strLen = scanner.nextInt();
			String str = scanner.next();
			int count = 0;
			String result = "YES";
			
			for(int i=0; i<strLen; i++) {
				char c = str.charAt(i);
				boolean check = ((Character.compare(c, 'a') == 0) || (Character.compare(c, 'e') == 0)
						|| (Character.compare(c, 'i') == 0) || (Character.compare(c, 'o') == 0)
						|| (Character.compare(c, 'u') == 0));
				if(!check) {
					count++;
				} else {
					count = 0;
				}
				
				if(count == 4) {
					result = "NO";
					break;
				}
			}
			
			System.out.println(result);
		}
		scanner.close();
	}
}
