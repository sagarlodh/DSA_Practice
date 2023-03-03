import dsa.util.ArrayOps;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        System.out.println("Hello Java, again!!");
        Integer[] arr = {10, 20, 30, 40, 50};
        System.out.print("Original Array: ");
        System.out.println(Arrays.toString(arr));

        // reversing array
        Integer[] reversedArray = ArrayOps.reverse(arr);
        System.out.print("Reversing Array: ");
        System.out.println(Arrays.toString(reversedArray));

        // right rotating array
        Integer[] rightRotatedArray = ArrayOps.rightRotateArray(arr);
        System.out.print("Right Rotating Array: ");
        System.out.println(Arrays.toString(rightRotatedArray));

        // linear search in array
        System.out.println(ArrayOps.positionOfSearchingElement(arr,30));
    }
}
