package org.brush.algorithmsSort;

import org.junit.Before;
import org.junit.Test;

public class SortTest {

    static Sort s = null;

    @Before
    public void start()
    {
        s=new BubbleSort();
    }

    @Test
    public void TestSort()
    {
       int[] array=s.getIntArrayRandom(31,120);
       array=s.sort(array);
       s.show(array);

    }

}

