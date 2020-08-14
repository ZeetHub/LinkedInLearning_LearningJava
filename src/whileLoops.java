import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
        boolean playCurrentSong = true;
        Scanner checkInput = new Scanner(System.in);

        while (playCurrentSong) {
            System.out.println("Playing current song again!");
            System.out.println("Would you like to play the next song?");
            String reply = checkInput.next();

            if (reply.equals("yes"))
                playCurrentSong = false;
        }
        System.out.println("Playing the next song!");
    }
}
