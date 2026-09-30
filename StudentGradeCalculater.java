public class StudentGradeCalculater{
  public static void main(string[] args){
    String name = "Guru lakshmi";
    int marks1 = 90;
    int marks2 = 80;
    int marks3 = 70;
    int marks4 = 50;
    int total marks = marks1 + marks2 + marks3 + marks4;
    double percentage = total/4.0;
    char grade;
    if (Percentage>=90)
      grade = 'A';
    else if(Percentage>=80)
      grade = 'B';
    else if(Percentage>=70)
      grade ='C';
    System.out.println("Name of the student is :" +name);
    System.out.println("Subject1 :" +marks1);
    System.out.println("Subject2 :" +marks2);
    System.out.println("Subject3 :" +marks3);
    System.out.println("Subject4 :" +marks4);
    System.out.println("Total marks of the Student is :" +total marks);
    System.out.println("Percentage of the student is :" + percentage);
    System.out.println("Grade of the Student is :" +grade);
  }
}
