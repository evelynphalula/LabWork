import java.util.Scanner;
public class StudentManagementProgramImple {
    public static void main(String[] args) {
        //creating a scanner object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter details
        System.out.print("ENTER YOUR NAME: ");
        String name = input.nextLine();

        double[] grades = new double[3];
        for (int i = 0; i <= grades.length - 1; i++) {
            System.out.println("ENTER YOUR GRADES: "+(i+1));
            grades[i] = input.nextDouble();
        }

        //CREATING OBJECTS
        StudentManagementProgram studentC = new StudentManagementProgram();
        studentC.setName(name);
        studentC.setGrades(grades);
        studentC.getTotalNumberOfStudents();
        System.out.print(studentC.getPrintedStudentDetails());

    }
}