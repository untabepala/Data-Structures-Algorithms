public class insertionSort {
    public static void insertionSort (int[] A) {
        int temp;
        int i, j;
        for (i=1; i < A.length; i++) {
            temp = A[i];
            for (j=i; j>0 && temp < A[j-1]; j--)
                A[j] = A[j-1];
            A[j] = temp;
        } // end for
    } // end insertionSort

}
