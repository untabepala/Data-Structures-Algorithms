import java.util.Scanner;

public class arr1Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int l = sc.nextInt();
        int arr[] = new int[l];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < l; i++) {
            System.out.println("ELEMENT " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < l; i++) {

            if (arr[i] % 2 == 0) {
                sum += arr[i];

            }
        }
        System.out.println("Sum of even numbers: "+sum);
    }
}
