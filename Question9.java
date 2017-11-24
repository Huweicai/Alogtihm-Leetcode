package com.huweicai;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// for calling console
		System.out.println("hello:");
		while(true) {
			Scanner s=new Scanner(System.in);
			int i=s.nextInt();
			System.out.println(isPalindrome(i));
		}
		
	}
	public static boolean isPalindrome(int x) {
        if(x<0) return false;
		int y=x;
		long res=0;
        while(y!=0) {
        	res=res*10+y%10;
        	y=y/10;
        }
        if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE) {
        	return false;
        }else {
        	return x==(int)res? true:false;
        }
    }
}
