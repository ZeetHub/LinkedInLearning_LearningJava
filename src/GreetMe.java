public class GreetMe {
    public static void main(String[] args){
        System.out.println("Hello Sir, welcome to your first Java Program!");

        String programmerFirstName = "Zerihun";
        String programmerMiddleName = "Tilahun";
        char programmerFirstInitial = programmerFirstName.charAt(0);
        char programmerLastInitial = programmerMiddleName.charAt(0);


        System.out.println(programmerFirstInitial);
        System.out.println(programmerLastInitial);
        System.out.println(programmerFirstName+' '+programmerMiddleName);
    }
}
