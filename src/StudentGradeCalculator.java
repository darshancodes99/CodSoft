import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        //task 2

        Scanner input = new Scanner(System.in);
        System.out.print("please enter total subjects : ");
        int subjects = input.nextInt();

        if (subjects <= 0) {
            System.out.println("Number of subjects should be greater than zero.");
            return;
        }

        int[] marks = new int[subjects];

        for (int i = 0; i < marks.length; i++){
            System.out.print("please enter " + (i + 1) + " subject's marks : ");
            marks[i] = input.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Marks should be between 0 and 100.");
                return;
            }
        }

        input.close();

        int totalMarks = 0;

        for (int mark : marks){
            totalMarks += mark;
        }

        double avePercentage = (double) totalMarks / subjects;

        String grade;
        if (avePercentage >= 90){
            grade = "A+";
        } else if (avePercentage >= 80) {
            grade = "A";
        } else if (avePercentage >= 70){
            grade = "B";
        } else if (avePercentage >= 50){
            grade = "C";
        } else if (avePercentage >= 33) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("Here is you results : ");
        System.out.println("total Marks : " + totalMarks);
        System.out.printf("Percentage: %.2f%%\n", avePercentage);
        System.out.println("Your Grade : " + grade);
    }
}
