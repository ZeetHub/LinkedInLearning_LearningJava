public class studentProfile {
    String firstName;
    String lastName;
    int yearOfGraduation;
    double GPA;
    String declaredMajor;


    public studentProfile(String firstName, String lastName, int yearOfGraduation, double GPA, String declaredMajor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfGraduation = yearOfGraduation;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public int incrementYear(){
        return this.yearOfGraduation +1;
    }

    public static void main(String[] args) {
        studentProfile studentA = new studentProfile("Abebe", "Zenebe", 2022, 3.45, "Computer Science");
        studentProfile studentB = new studentProfile("Zinash", "Alemu", 2021, 3.76, "Software Engineering");

        System.out.println(studentA.firstName+studentA.lastName);
        int updatedGraduation = studentA.incrementYear();
        System.out.println(updatedGraduation);
    }
}
