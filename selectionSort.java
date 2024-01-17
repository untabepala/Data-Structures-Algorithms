import java.util.Collections;

import static java.util.Collections.swap;

public class selectionSort {
    public static void selectionSort(int[] A) {
        int i, j, least;
        for (i = 0; i < A.length-1; i++) {
            least = i;
            for (j = i+1; j < A.length; j++)
                if (A[j] < A[least]) least = j;
            if (i != least) swap(Collections.singletonList(A), least, i);
        } // end for
    } // end selectionSort

}
