public class arr1Update {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int item=15;
        System.out.println("The array elements are: ");
        for (int i=0;i<5;i++){
            arr[i]=i+2;
            System.out.println("arr["+i+"]="+arr[i]);
        }
        arr[3]=item;
        System.out.println("The array elements after updation are: ");
        for (int i=0;i<5;i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}
