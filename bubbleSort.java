import java.util.Collections;

import static java.util.Collections.swap;

public class bubbleSort {
    public static void bubbleSort(int[] A) {
        int i, j;
        for (i = 0; i < A.length; i++) {
            for (j = A.length - 1; j > i; j--) {
                if (A[j] < A[j - 1]) {
                    swap(Collections.singletonList(A), j, j - 1);
                }
            }
        }
    } // end bubbleSort
        }

