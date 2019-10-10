import java.util.*;
import java.io.*;

public class Solution {
  public static void main(String[] args) {
 
	Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    	int t = in.nextInt();

	for(int i=1; i<=t; i++) {    
		int n = in.nextInt();	
		int z=1;
		Tablica d = new Tablica();
			do {
				d.sprawdz(n*z);
				z++;
			} while(n!=0&&!d.wszystkie());

	if (n==0)
		System.out.println("Case #"+i+": "+"INSOMNIA");
	else 	
		System.out.println("Case #"+i+": "+n*--z);
	}
  	
}

 

static boolean czyJest(int liczba, int jaka){
	Integer A = liczba;
	Integer B = jaka;

	String str = A.toString();
	String jaka1 = B.toString();

	return str.indexOf(jaka1)!=-1;
}

static class Tablica{
	boolean tab[] = new boolean[10];

	void sprawdz(int numer){
		for (int i = 0; i<10; i++) {
			
			if (czyJest(numer, i))
				tab[i] = true;
		}
	}

	boolean wszystkie(){
		boolean a=true;
		for(int i=0; i<10; i++){
		if (!tab[i]) a=false;
		}
		return a;
	}
}
}