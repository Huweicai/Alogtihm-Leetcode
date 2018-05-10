import java.util.Arrays;

public class Question66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s= {9,9,9};
		s=plusOne(s);
		System.out.println();
		for(int i:s) {
			System.out.print(i);
		}
	}
	public static int[] plusOne(int[] digits) {
        int l=digits.length;
        for(int i=l-1;i>=0;i--) {
        	System.out.print(digits[i]);
        	if(digits[i]!=9) {
        		digits[i]++;
        		return digits;
        	}else {
        		digits[i]=0;
        	}
        }
        if(digits[0]==0) {
        	int[] x=new int[digits.length+1];
        	x[0]=1;
        	for(int i=1;i<x.length;i++) {
        		x[i]=digits[i-1];
        	}
        	return x;
        }
        return digits;
    }
}
