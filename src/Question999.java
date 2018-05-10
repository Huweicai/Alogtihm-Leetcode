public class Question999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="11";
		String b="1";
		Integer x=Integer.valueOf(a);
		Integer y=Integer.valueOf(b);
		System.out.println(x.byteValue()+y.byteValue());
	}
	public static int SQrt(int x) {
		if(x==0||x==1) return x;
		long low=0;
		long high=Integer.MAX_VALUE;
		while(low<high) {
			long mid=(low+high)/2;
			long sqrt=mid*mid;
			if(sqrt==x) return (int)mid;
			if(sqrt>x) high=mid-1;
			if(sqrt<x) low=mid+1;
		}
		return 0;
	}
}
