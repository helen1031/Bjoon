package no1_�˰����_�����;

import java.util.Scanner;

public class Q10992 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(' ');
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j==1 || j==2*i-1)  System.out.print('*');
				else  System.out.print(' ');
			}
			System.out.println();
		}
		for(int i=1;i<=2*n-1;i++) {
			System.out.print('*');
		}

	}

}
