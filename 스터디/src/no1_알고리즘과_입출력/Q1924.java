package no1_알고리즘과_입출력;

import java.util.Scanner;

public class Q1924 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=0;
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		switch(x) {
		case 12:
			total+=30;
		case 11:
			total+=31;
		case 10:
			total+=30;
		case 9:
			total+=31;
		case 8:
			total+=31;
		case 7:
			total+=30;
		case 6:
			total+=31;
		case 5:
			total+=30;
		case 4:
			total+=31;
		case 3:
			total+=28;
		case 2:
			total+=31;
		case 1:
			total+=y;
		}
		
		switch(total%7) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 0:
			System.out.println("SUN");

		}

	}

}
