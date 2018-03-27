package no1_알고리즘과_입출력;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q10953 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String str=sc.next();
			StringTokenizer st=new StringTokenizer(str, ",");
			int sum=0;
			while(st.hasMoreTokens()) {
				sum=sum+Integer.parseInt(st.nextToken());//문자열을 int로 변경
			}
			System.out.println(sum);
		}
	}

}
