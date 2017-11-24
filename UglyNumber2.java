public class UglyNumber2 {
    public int nthUglyNumber(int n) {
        int[] a = new int[n];
        a[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int val_2 = 2, val_3 = 3, val_5 = 5;
        for(int i=1;i<n;i++){
            int min = Math.min(Math.min(val_2,val_3),val_5);
            a[i] = min;
            if(val_2 == min)
                val_2 = 2*a[++index2];
            if(val_3 == min)
                val_3 = 3*a[++index3];
            if(val_5 == min)
                val_5 = 5*a[++index5];
        }
        return a[n-1];
    }
}

