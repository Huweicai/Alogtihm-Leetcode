public class PalindramicSubstring {
    public static int countSubstrings(String s) {
        if (s.length() == 0) return 0;
        int num = 1;
        char[] c = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            num++;
            int left = i-1;
            int right = i+1;
            while( left >= 0 && right <= s.length() && c[left] == c[right]) {
                num ++;
            }
            left+=1;
            while( left >= 0 && right <= s.length() && c[left] == c[right]) {
                num ++;
            }
        }
        return num;
    }


    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }
}
