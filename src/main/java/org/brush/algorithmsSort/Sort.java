package org.brush.algorithmsSort;

import java.util.Date;
import java.util.Random;

public abstract class Sort {
    private int count=0;
    private long algorithmTime=0;
    protected abstract int[] sort(int[] arryy);
    public int[] startSort(int[] arry)
    {
        long start=System.nanoTime();
        int[] ints = this.sort(arry);
        long end=System.nanoTime();
        algorithmTime=end=start;
        return ints;
    }
    protected int[] swap(int[] arry,int i,int j)
    {
        int temp=arry[i];
        arry[i]=arry[j];
        arry[j]=temp;
        count++;
        return arry;
    }
    protected  void show(int[] arry)
    {
        for(int a: arry)
        {
            System.out.println(a);
        }
        System.out.println("数组长度:"+ arry.length+"交换次数"+count+"执行时间"+this.algorithmTime);
    }

    public int[] getIntArrayRandom(int length,int max)
    {
        int[]arr=new int[length];
        Random r=new Random(new Date().getTime());
        for(int i=0;i<arr.length;++i)
            arr[i]=r.nextInt(max);
        return arr;
    }
    protected  int max(int[] arr)
    {
        int max=0;
        for(int a: arr)
        {
            if(a>max)
                max=a;
        }
        return max;
    }


}
