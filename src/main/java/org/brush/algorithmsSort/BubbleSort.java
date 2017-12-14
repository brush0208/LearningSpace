package org.brush.algorithmsSort;

public class BubbleSort extends Sort {


    protected int[] sort(int[] arryy) {
       for(int i=0;i<arryy.length;++i)
           for(int j=0;j<arryy.length-1-i;j++)
           {
               if(arryy[j]<arryy[j+1]) {
                   int[] ints = swap(arryy, j, j + 1);

               }
           }
        return arryy;
    }
}
