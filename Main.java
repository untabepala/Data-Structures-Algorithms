import java.util.LinkedList;

public class StudentMarks {

    public static void main(String[] args) {

        // Create a linked list to store the students' Mathematics marks
        LinkedList<Integer> marks = new LinkedList<>();

        // Add the marks of 5 students to the linked list
        marks.add(90);
        marks.add(85);
        marks.add(75);
        marks.add(65);
        marks.add(55);

        // Display the students' Mathematics marks
        System.out.println("The students' Mathematics marks are: ");
        for (Integer mark : marks) {
            System.out.println(mark);
        }
    }
}