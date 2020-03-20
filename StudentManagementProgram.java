public class StudentManagementProgram {
    private String name ;
    private double[] grades ;
    private static int totalNumberOfStudents = 1;

    //constructor
    StudentManagementProgram(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
       return this.name;
    }
    public void setGrades(double[] grades){
        this.grades = grades;
        }
     public double [] getGrades(){
        
        return this.grades;
    }
    public void getTotalNumberOfStudents(){
         this.totalNumberOfStudents++;
    }
    public double getAverageGrade(){
        double average = 0;
        double sum = 0;
        for(int i= 0; i<=grades.length-1; i++){
            sum += grades[i];
            average = sum/grades.length;
        }
        return average;
    }
    public String getPrintedStudentDetails(){
        String e = "STUDENT NAME IS " + getName() + " AVERAGE GRADE IS "+getAverageGrade()+ "AND THE NUMBER OF STUDENTS IS " +this.totalNumberOfStudents;
        return e ;
    }


}
