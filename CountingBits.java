class CountingBits {
    public static int[] countBits(int num) {
        int[] a = new int[num+1];
        a[0] = 0;
        if (num == 0) return a;
        a[1] = 1;
        if (num == 1) return a;
        for (int i = 2; i < num+1; i++) {
            a[i] = a[i/2] + i%2;
        }
        return a;
    }
    static public void main(String[] args){
        System.out.println("HEllo");
        int[] a=countBits(2);
        System.out.println( a);
    }
}