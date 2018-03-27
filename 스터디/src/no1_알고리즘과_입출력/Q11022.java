package no1_알고리즘과_입출력;

import java.util.Scanner;

public class Q11022 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a+b);
		}
		

	}

}
