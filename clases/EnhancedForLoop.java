package clases;

class Student{
    int id;
    String name;
    int grade;
}

public class EnhancedForLoop {
    public static void main(String[] args) {
        Student students[] = new Student[3];

        Student s1 = new Student();
        s1.id =1;
        s1.name = "alex";
        s1.grade = 88;

        Student s2 = new Student();
        s2.id =1;
        s2.name = "Sergio";
        s2.grade = 30;

        Student s3 = new Student();
        s3.id =1;
        s3.name = "Yngrid";
        s3.grade = 25;

        students[0] = s1;
        students[1]=s2;
        students[2]=s3;

      
        for(Student student: students){
            System.out.println(student.name + " : " + student.grade);
        }
    }
    
}
