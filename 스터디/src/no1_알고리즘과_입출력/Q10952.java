package no1_�˰����_�����;

import java.util.Scanner;

public class Q10952 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt()) {
			int a=s.nextInt();
			int b=s.nextInt();
			if(a==0&&b==0)break;
			else System.out.println(a+b);
		}
	}

}
