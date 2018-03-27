package no1_알고리즘과_입출력;

import java.util.Scanner;

public class Q11721 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		while(str.length()>10) {
			System.out.println(str.substring(0,10));
			str=str.substring(10);
		}
		System.out.println(str);

	}

}
