import java.util.Scanner;

public class ProjectSalaryCalculator {
    public static double salaryCalculator(){
        int numberOfWeeks = 52;
        System.out.println("Enter the number of hours of work per week: ");
        Scanner scanInputHours = new Scanner(System.in);
        int numberOfHours = scanInputHours.nextInt();

        System.out.println("Enter the hourly rate: ");
        Scanner scanInputRate =  new Scanner(System.in);
        double payRate = scanInputRate.nextDouble();

        double yearlySalary = numberOfWeeks * numberOfHours * payRate;

        return  yearlySalary;
    }
    public static void main(String[] args) {
        double salary = salaryCalculator();
        System.out.println("Your yearly salary is $" + salary);
    }
}
