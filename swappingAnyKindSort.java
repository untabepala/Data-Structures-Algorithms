public class swappingAnyKindSort {
    public static void swap(int[] A, int
            pos1, int pos2) {

        int temp = A[pos1];
        A[pos1] = A[pos2];
        A[pos2] = temp;
    } // end swap

}
