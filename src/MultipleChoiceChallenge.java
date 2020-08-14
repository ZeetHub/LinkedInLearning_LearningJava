import java.util.Scanner;

public class MultipleChoiceChallenge {
    public static void main(String[] args){
        System.out.println("Below, you will find a multiple choice question. Answer the letter of your choice.");
        String Question = "Question: What is the capital city of Madagascar?";
        String ChoiceOne = "A. Cairo";
        String ChoiceTwo = "B. Addis Ababa";
        String ChoiceThree = "C. Antananarivo";

        System.out.println(Question);
        System.out.println(ChoiceOne);
        System.out.println(ChoiceTwo);
        System.out.println(ChoiceThree);
        System.out.println();

        System.out.println("Put your answer here (A, B or C): ");
        Scanner inputAnswer = new Scanner(System.in);
        String answer = inputAnswer.next();

        if(answer.equals("C")){
            System.out.println("Bravo! You nailed it!");
        }
        else{
            System.out.println("Better lack next time! The correct answer is " + ChoiceThree + ".");
        }



    }
}
