package com.huweicai;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		int i=1234567893;
		while(true) {
			System.out.println("Input:");
			Scanner scan=new Scanner(System.in);
			i=scan.nextInt();
			System.out.println("The answer is :"+reverseA(i));
		}
		
	}
	
	//use String seprate int
	public static int reverseA(int x) {
		try {
			int sign=x>0 ? 1:-1;
			String s=Integer.toString(Math.abs(x));
			StringBuilder sb=new StringBuilder("");
			for(int i=s.length()-1;i>=0;i--) {
				sb.append(s.substring(i, i+1));
			}
			x=sign*(Integer.valueOf(sb.toString()));
			return x;
		}catch(NumberFormatException e) {
			return 0;
		}
    }
	
	//use mod and div seprate int
	public static int reverseB(int x) {
		long res=1;
		while(x!=0) {
			res=res*10+x%10;
			x=x/10;
		}
		if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE) {
			return 0;
		}else {
			return (int)res;
		}
	}
}
