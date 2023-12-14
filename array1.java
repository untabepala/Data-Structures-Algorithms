import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        String [] studentNames=new String[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("Enter Name "+(i+1)+": ");
            studentNames[i]=sc.nextLine();
        }
        System.out.println("Names are:");
        for (int i=0;i<5;i++){
            System.out.println(studentNames[i]);
        }

    }
}
