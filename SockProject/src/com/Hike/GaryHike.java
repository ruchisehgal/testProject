package com.Hike;

import java.util.Scanner;

public class GaryHike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int n = sc1.nextInt();
		String s[] = sc2.nextLine().split("");

		//start method
		int sum = 0;
		int valleyTraversed = 0;
		int k = 0;
		int sealLevel = 0;
		
		for(int i = 0; i< s.length;i++) {
			if(s[i].equals("U")) {
				sum = sum +1;
				if((sum == sealLevel) && (s[i].equals("U"))) {
					valleyTraversed++;
					k = 0;
				}
			} else if (s[i].equals("D")) {
				k++;
				sum = sum -1;
			}
			
		}
		System.out.println(valleyTraversed);
		
		//end method
	}

}
