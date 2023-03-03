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

    public static String positionOfSearchingElement(Integer[] a, int n)
    {
        int pos = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                pos = i+1;
            }
        }
        if(pos==0){
            return "Element " + n + " not found";
        }
        return "Element " + n + " found at pos: " + pos;
    }
}
