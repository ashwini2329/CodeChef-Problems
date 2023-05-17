/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// creating an object of Scanner class
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();   // taking input for no. of testCases
		
		// creating for loop for no. of testCases
		for(int i=0; i<testCases; i++) {
		    //  takin input for total units of money and no. of people
		    int people = sc.nextInt();
		    int moneyUnits = sc.nextInt();
		    int[] moneyNeeds = new int[people];
		    
		    // taking input for people with no. of units money they need 
		    for(int j=0; j<people; j++) {
		        moneyNeeds[j] = sc.nextInt();
		    }
		    
			// looping on people
			// if money to withdraw is equal or less than money in ATM, print 1, else print 0
		    for(int j=0; j<people; j++) {
		        if(moneyUnits >= moneyNeeds[j]) {
		            moneyUnits-=moneyNeeds[j];
		            System.out.print("1");
		        } else {
		            System.out.print("0");
		        }
		    }
		    System.out.println("");
		}
		
	}
}
