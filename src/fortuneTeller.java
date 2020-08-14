import java.util.Scanner;

public class fortuneTeller {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");

        Scanner scan = new Scanner(System.in);

        int inputNum = scan.nextInt();

        if (inputNum<5){
            System.out.println("Congrats. You have free tickets to Paris!");
        }
        else{
            System.out.println("You have free pair of shoes!");
        }
    }
}
