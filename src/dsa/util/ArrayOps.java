package dsa.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayOps {

    /**
     * reverses the integer array
     * @param a - integer array input
     * @return the reversed array
     */
    public static Integer[] reverse(Integer[] a)
    {
        Integer[] reversedArray = {};
        List<Integer> arrayAsList = new ArrayList<>(Arrays.asList(a));
        Collections.reverse(arrayAsList);     // reversing the list
        reversedArray = arrayAsList.toArray(reversedArray);
        return reversedArray;
    }

    /**
     * reverses the integer array
     * @param a - integer array input
     * @return the reversed array
     */
    public static Integer[] rightRotateArray(Integer[] a)
    {
        Integer[] rightRotatedArray = new Integer[a.length];
        rightRotatedArray[0] = a[a.length-1];
        for(int i=1; i<=a.length-1; i++) {
            rightRotatedArray[i] = a[i-1];
        }
        return rightRotatedArray;
    }
}
