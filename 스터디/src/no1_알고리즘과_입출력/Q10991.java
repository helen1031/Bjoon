package no1_알고리즘과_입출력;

import java.util.Scanner;

public class Q10991 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(' ');
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j%2==1)  System.out.print('*');
				else  System.out.print(' ');
			}
			System.out.println();
		}

	}

}
