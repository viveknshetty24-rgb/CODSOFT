import java.util.Scanner;

public class StudentGradeCalculator {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int subjects;
          System.out.println("Enter the number of Subjects:");
          subjects = sc.nextInt();
          int total_marks = 0;
          for (int i = 1; i <= subjects; i++) {
               System.out.println("Enter marks for subject" + i + ":");
               int marks = sc.nextInt();
               total_marks = total_marks + marks;
          }
          double average = (double) total_marks / subjects;
          char grade;
          if (average >= 90) {
               grade = 'A';
          } else if (average >= 75) {
               grade = 'B';
          } else if (average >= 60) {
               grade = 'C';
          } else if (average >= 40) {
               grade = 'D';
          } else {
               grade = 'F';
          }
          System.out.println("Total Marks :" + total_marks);
          System.out.println("Average :" + average +"%");
          System.out.println("Grade :" + grade);
          sc.close();
     }

}
