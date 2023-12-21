public class arr1Insertion {
    public static void main(String[] args) {
       int[] arr=new int[3] ;
        System.out.println("Array Before Insertion:");
        for(int i=0;i<3;i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
            System.out.println("Inserting Elements...");
            System.out.println("Array after Insertion: ");
        for (int i=0;i<3;i++){
            arr[i]=i+3;
            System.out.println("arr[" + i +"]=" + arr[i]);
        }
    }
}
