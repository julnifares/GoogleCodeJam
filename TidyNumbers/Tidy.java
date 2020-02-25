

//Solution to: https://code.google.com/codejam/contest/3264486/dashboard#s=p1

import java.util.*;
import java.io.*;
class Tidy {
	public static void main(String[] args) {

	Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();

		for(int i=1; i<=t; i++) {    
			long n = in.nextLong();
			System.out.println("Case #"+i+": "+tidy(n));
		}
	}



static long tidy(long number) {

OUTER: for(long j=1; j<number; j++) {
	boolean czy=false;
	if(number<10) return number;
		String str2 = String.valueOf(number);
		
	INNER: for(int i=1; i<str2.length();) 
		{
			if(Integer.parseInt(""+str2.charAt(i))>=Integer.parseInt(""+str2.charAt(i-1))) 
				{ 
					if(i==str2.length()-1) 
						return number; 
						i++; continue;
				}

			if(Integer.parseInt(""+str2.charAt(i))<Integer.parseInt(""+str2.charAt(i-1))) 
				{number--; 
				continue OUTER;
				} 
		
		}
		
		
	}
return number;
}
}
