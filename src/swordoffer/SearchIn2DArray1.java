package swordoffer;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 从左下角开始形式二分
 */
public class SearchIn2DArray1 {
    public boolean Find(int target, int [][] array) {
        int y = array.length-1;
        int x = 0;
        while( y>=0 && x <= array[0].length){
            System.out.println(y +","+x);
            if (array[y][x] > target ) {
                y--;
            } else if (array[y][x] == target) {
                return true;
            } else {
                x++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a= {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        SearchIn2DArray1 t = new SearchIn2DArray1();
        System.out.println(t.Find(7, a));
    }
}
