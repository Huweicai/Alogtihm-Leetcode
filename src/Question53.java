public class Question53 {

	public static void main(String[] args) {
		Question53 q=new Question53();
		int[] a= {-1,1,-3,4,-1,2,1,-5,4};
		System.out.println(q.maxSubArray(a));
	}
	public int maxSubArray(int[] a) {
		int max=a[0],sum=0;
        for(int i=0;i<a.length;i++) {
        	sum+=a[i];
        	if(sum>max) max=sum;
        	if(sum<0) sum=0;
        }
        return max;
    }
	
//	int max=a[0],sum=0;
//    for(int i=0;i<a.length;i++) {
//    	sum+=a[i];
//    	if(sum<0) {
//    		sum=0;
//    	}else {
//    		if(max<sum)
//    			max=sum;
//    	}
//    	
//    }
//    return max;
}
