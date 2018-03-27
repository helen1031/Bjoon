package no1_알고리즘과_입출력;

import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=sc.nextInt();
		n--;
		int max=num;
		int min=num;
		while(n-->0) {
			num=sc.nextInt();
			if(num>max) max=num;
			if(min>num) min=num;
		}
		System.out.printf("%d %d\n", min, max);

	}

}
