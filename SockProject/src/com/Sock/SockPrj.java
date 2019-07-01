package com.Sock;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SockPrj {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		try {
			int n = sc1.nextInt();
			String str = sc2.nextLine();
			String arr[] = str.split(" ");
			List<String> arrList = Arrays.asList(arr);
			Set<String> set1 = new HashSet<>();
			set1.addAll(arrList);
			int pairs = 0;
			for (String s1 : set1) {
				int k = 0;
				for (String s2 : arrList) {
					if (s1.equals(s2)) {
						k++;
					}

				}
				if (k > 1) {
					pairs = pairs + (k / 2);
				}

			}
			System.out.println(pairs);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc1.close();
			sc2.close();
		}

	}
}
