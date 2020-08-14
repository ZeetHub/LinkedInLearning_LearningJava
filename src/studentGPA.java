import java.util.Scanner;

public class studentGPA {
    public static void main(String[] args) {
        String studentFirstName = "Zerihun";
        String studentLastName = "Tilahun";
        double studentGPA = 3.08;

        System.out.println(studentFirstName+" "+ " "+ studentLastName+ " has a GPA of "+studentGPA);

        System.out.println("What do you want to upgrade your grade to? ");

        Scanner input = new Scanner(System.in);

        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " has now a GPA of " + studentGPA);


    }
}
