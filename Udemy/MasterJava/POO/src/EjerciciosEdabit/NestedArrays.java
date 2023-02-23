package EjerciciosEdabit;

import java.util.Arrays;

public class NestedArrays {
    public static boolean canNest(int[] array1, int[] array2){
        Arrays.sort(array1);
        Arrays.sort(array2);

        if(array1[0] > array2[0] && array1[array1.length-1] < array2[array2.length-1]){
            return true;
        } else {
            return false;
        }

    }
}


/*
arr1 can be nested inside arr2 if:

arr1's min is greater than arr2's min.
arr1's max is less than arr2's max.


canNest([1, 2, 3, 4], [0, 6]) ➞ true

canNest([3, 1], [4, 0]) ➞ true

canNest([9, 9, 8], [8, 9]) ➞ false

canNest([1, 2, 3, 4], [2, 3]) ➞ false
 */