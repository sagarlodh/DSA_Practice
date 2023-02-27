package dsa.util;

public class ReverseArray {

    /**
     * reverses the integer array
     * @param a - integer array input
     */
    public static void reverse(Integer[] a)
    {
        for (int i=a.length-1; i>=0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
