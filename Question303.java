package com.huweicai;

/*
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 */
public class Question303 {
	int[] a;
	public Question303(int[] nums) {
		a=new int[nums.length+1];
		//To make 0,n can be count 
		a[0]=0;
		int sum=0;
        for(int i=1;i<=nums.length;i++) {
        	sum+=nums[i-1];
        	a[i]=sum;
        }
    }
    
    public int sumRange(int i, int j) {
    	if(a==null) return 0;
    	return a[j+1]-a[i];
    }
	public static void main(String[] args) {
		int[] a= {0,-2,3};
		Question303 q=new Question303(a);
		System.out.println(q.sumRange(0, 2));
	}

}
