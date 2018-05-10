import javax.naming.ldap.StartTlsRequest;

public class Questio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"aa","a"};
		System.out.println(findLCP(s));
	}
	public static String findCommonPrefix(String s1,String s2) {
		StringBuilder prefix=new StringBuilder("");
		int length=s1.length()<s2.length() ? s1.length():s2.length();
		for(int i=0;i<length;i++) {
			char c;
			if((c=s1.charAt(i))!=s2.charAt(i))
				//change "break" to "return" will improve speed a lot ,but why ?
				return prefix.toString();;
			prefix.append(c);
		}
		return prefix.toString();
	}
	public static String findLCP(String[] strs) {
		if(strs.length==0) return "";
		String tempPrefix=strs[0];
		for(int i=1;i<strs.length;i++) {
			tempPrefix=findCommonPrefix(tempPrefix, strs[i]);
		}
		return tempPrefix;
	}
}
