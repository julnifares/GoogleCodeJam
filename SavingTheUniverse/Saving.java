//solution to https://codingcompetitions.withgoogle.com/codejam/round/00000000000000cb/0000000000007966

import java.util.*;
import java.io.*;
class Saving {
	public static void main(String[] args) {
	
	Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	int test = in.nextInt();
	String order ="";
	
	
	for(int i=1; i<=test; i++) {
		int shield = in.nextInt();
		String str = in.next();
		int countHacks = countHacks(shield, str);
		if(countHacks<0)
			System.out.println("Case #"+i+": "+"IMPOSSIBLE");
		else 	
		System.out.println("Case #"+i+": "+countHacks);
	
	}
	}
	
	static int countHacks(int shield, String str) {
		
		int positionOfC = str.indexOf('C');
		int howManySteps = str.length();
		if(positionOfC==-1&&str.length()>shield) return-1;
		if (shield-totalDemage(str.indexOf('C'), str.length())>=0) return 0;
		
		else {
			for(int i=0; i<str.length(); i++) {
								if (shield-totalDemage(i, str.length())==0)
								return Math.abs(positionOfC-i);
	
			}
		}
		
		return -1;
		
				
	
	}

	static int totalDemage(int index, int length) {
		if(	index==-1)
			return length;
		if(index==length-1)
			return length-1;
		else 
		return index + 2*(length-index-1);
	}
	
	
	
	
	}

			
		
		
		
