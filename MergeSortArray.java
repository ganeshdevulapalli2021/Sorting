
/**
 * Tata Elxsi, A TATA Group. All rights reserved.
 */

/**
 * @author ganesh.d
 *
 */
import java.util.Arrays;

public class MergeSortArray {
    private static int[] mergeArray(int[] arrayA, int[] arrayB) {
        int[] mergedArray = new int[arrayA.length + arrayB.length];

        int i = 0, j = 0, k = 0;

        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] < arrayB[j]) {
                mergedArray[k] = arrayA[i];
                i++;
                k++;
            } else {
                mergedArray[k] = arrayB[j];
                j++;
                k++;
            }
        }

        while (i < arrayA.length) {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        }

        while (j < arrayB.length) {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arrayA = new int[] {1, 3, 5, 7, 8};

        int[] arrayB = new int[] {2, 4, 6, 9, 10};

        int[] mergedArray = mergeArray(arrayA, arrayB);

        System.out.println("Array A : " + Arrays.toString(arrayA));

        System.out.println("Array B : " + Arrays.toString(arrayB));

        System.out.println("Merged Array : " + Arrays.toString(mergedArray));
    }
}