package RepeatedString;

import java.util.Scanner;

public class RepStringNewLogic {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		String s = sc2.nextLine();
		long n = sc1.nextLong();
		long k = s.length();
		long len = s.length();
		long singlestringoccurence = 0;
		
		while(len < (n+1)) {
			len = len + k;
		}
		char [] c = s.toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(c[i] == 'a') {
				singlestringoccurence++;
			}
		}
		long j = k /n;
		long p = k%n;
		long multipleoccur = j*singlestringoccurence;
		for(int o = 0; o< p; o++) {
			if(c[o] == 'a') {
				multipleoccur++;
			}
		}
		System.out.println(multipleoccur);
		
		
	}
}
