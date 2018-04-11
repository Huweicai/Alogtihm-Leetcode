package SwordOffer;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpace2 {
    public static String replaceSpace(StringBuffer str) {
        str.toString().replace(" " , "%20");
        char[] old = str.toString().toCharArray();
        int num = getCharNum(old, ' ');
        //先确定数组长度
        char[] newC = new char[old.length + 2*num];
        //记录哪儿开始复制
        int end = newC.length-1;
        for (int i = old.length-1; i >= 0 ; i--) {
            //一个一个复制过去
            if (old[i] == ' ') {
                //替换
                newC[end--]= '0';
                newC[end--]= '2';
                newC[end--]= '%';
            } else {
                newC[end--] = old[i];
            }
        }
        return new String(newC);
    }


    private static int getCharNum(char[] sc, char c) {
        int num = 0;
        for (char x : sc) {
            num = x == c ? num + 1 : num;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("234 5")));
    }
}
