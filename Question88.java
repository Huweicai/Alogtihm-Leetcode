package com.huweicai;

public class Question88 {

	public static void main(String[] args) {
		int[] a= {0,2,0,0,0,0,0,0},b= {1,5};
		merge(a,2,b,2);
		for(int i:a) {
			System.out.println(i);
		}
	}
	 public static void merge(int[] a, int m, int[] b, int n) {
	        int x=m-1,y=n-1,k=m+n-1;
	        while(y>=0&&x>=0) {
	        	if(a[x]>b[y]) {
	        		a[k--]=a[x--];
	        	}else {
	        		a[k--]=b[y--];
	        	}
	        }
	        while(y>=0)
				a[k--] = b[y--];
	    }
}
