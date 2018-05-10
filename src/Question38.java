public class Question38 {
	public static void main(String[] args) {
		System.out.println(countAndSay(10));
	}
	public static String countAndSay(int n) {
        String temp="11";
		for(int i=0;i<n-2;i++) {
        	temp=getNext(temp);
        	System.out.println(temp);
        }
		return temp;
    }
	public static String getNext(String s) {
		int count=1;
		char[] a=s.toCharArray();
		StringBuilder sb=new StringBuilder("");
		for(int i=1;i<a.length;i++) {
			if(a[i-1]==a[i]) {
				count++;
			}else {
				sb.append(count+""+a[i]);
				count=1;
			}
		}
		String c=(count+""+a[a.length-1]);
		System.out.println("@"+c);
		sb.append(c);
		System.out.println("#"+sb.toString());
		return sb.toString();
	}
}
