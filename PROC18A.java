/**
 *********************************************************
					The Great Run
				(Difficulty Raing 1097)
 *********************************************************

 
 Vishal loves running. He often visits his favourite Nehru Park and runs for very long distances. On one such visit 
he found that the number of girls in the park was unusually high. Now he wants to use this as an opportunity to 
impress a large number of girls with his awesome speed.

The track on which he runs is an N kilometres long straight path. There are ai
girls standing within the ith kilometre of this path. A girl will be impressed only if Vishal is running at his maximum 
speed when he passes by her. But he can run at his best speed only for a single continuous stretch of 
K kilometres. Now Vishal wants to know what is the maximum number of girls that he can impress.

###Input First line of the input contains the number of testcases T

For each test case,

First line contains two space-separated integers N and K, the length of the track and the maximum distance he can run at his best speed.

Second line contains N space-separated integers, the number of girls within each kilometre of the track.

###Output For each test case print one line containing an integer, denoting the maximum number of girls Vishal can impress.
 */



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
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		for(int j=0; j<testCases; j++) {
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int[] girls = new int[n];
		    for(int i=0; i<n; i++) {
		        girls[i] = sc.nextInt();
		    }
		    int result = 0;

		    for(int i=0; i<n-(k-1); i++) {
		        int current = 0;
		        for(int a=i; a<(i+k); a++) {
		            current+=girls[a];
		        }
		        if(current > result) {
		            result = current;
		        }
		    }
		    
		    System.out.println(result);
		}

		sc.close();
	}
}