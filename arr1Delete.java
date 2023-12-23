public class arr1Delete {
    public static void main(String[] args) {
        int arr[]=new int[3];
        int n=arr.length;
        System.out.println("Array before Deletion: ");
        for (int i=0;i<n;i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
        for (int i=0;i<n;i++){
            arr[i]=arr[i+1];
            n=n+1;
        }
        System.out.println("Array after Deletion: ");
        for ( int i=0;i<n;i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}
