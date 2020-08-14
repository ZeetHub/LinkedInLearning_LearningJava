//Run in debugger mode
import java.util.Scanner;

public class functionDef {
    public static void developerTeaTime(){
        System.out.println("Waiting for developer's tea time...");
        System.out.println("Press any key to start developer's teat time break: ");

        Scanner input = new Scanner(System.in);
        input.next();// no need to save it into a variable.

        System.out.println("Developer's tea time had started.");

    }
    public static void main(String[] args){

        System.out.println("Welcome to your workday!");
        System.out.println("Please work on issues postponed from yesterday.");

        developerTeaTime();

        System.out.println("finalize task");
        System.out.println("Submit report to boss.");

        developerTeaTime();


    }
}
