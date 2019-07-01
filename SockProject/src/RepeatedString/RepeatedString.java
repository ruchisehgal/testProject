package RepeatedString;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		String s = sc2.nextLine();
		long n = sc1.nextLong();
		//int p = (int) n;
		String tmp = s;
		long counter = 0;
		if (s.length() == 1) {
			counter = n;
		} else {
			while(s.length()< n+1) {
				//s = formSubstring(s, n);	
				s = s.concat(tmp);
			}
			
			
			char [] c = s.toCharArray();
			//int counter = 0;
			for(int k = 0; k < n; k++ ) {
				if(c[k] == 'a') {
					counter++;
				}
			}
		}
		
		System.out.println(counter);
		//start
		//end
	}

	/*private static String formSubstring(String s, int n) {
		// TODO Auto-generated method stub
		String temp = s;
		s = s.concat(temp);
		if(s.length() < n+1) {
			s = formSubstring(te,n);
		}
		
		return s;
	}*/

}
