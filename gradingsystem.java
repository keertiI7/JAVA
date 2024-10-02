package labinternal;
import java.util.Scanner;

public class gradingsystem {

    // Separate class for student
    public static class student {
        String sname;
        int studentid;

        public student(String name, int id) {
            this.sname = name;
            this.studentid = id;
        }

        public int totalmarks(int maths, int physics, int social, int science) {
            return maths + physics + social + science;
        }
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        // Student 1 details
        System.out.println("Enter the details of student1:");
        System.out.println("Enter the student1 name:");
        String std1 = s1.nextLine();
        System.out.println("Enter student1 id:");
        int sid1 = s1.nextInt();
        System.out.println("Enter maths marks of student1:");
        int m1 = s1.nextInt();
        System.out.println("Enter physics marks of student1:");
        int p1 = s1.nextInt();
        System.out.println("Enter social marks of student1:");
        int so1 = s1.nextInt();
        System.out.println("Enter science marks of student1:");
        int sc1 = s1.nextInt();
        student obj1 = new student(std1, sid1);
        int marks1 = obj1.totalmarks(m1, p1, so1, sc1);

        // Clear the buffer
        s1.nextLine();

        // Student 2 details
        System.out.println("Enter the details of student2:");
        System.out.println("Enter the student2 name:");
        String std2 = s1.nextLine();
        System.out.println("Enter student2 id:");
        int sid2 = s1.nextInt();
        System.out.println("Enter maths marks of student2:");
        int m2 = s1.nextInt();
        System.out.println("Enter physics marks of student2:");
        int p2 = s1.nextInt();
        System.out.println("Enter social marks of student2:");
        int so2 = s1.nextInt();
        System.out.println("Enter science marks of student2:");
        int sc2 = s1.nextInt();
        student obj2 = new student(std2, sid2);
        int marks2 = obj2.totalmarks(m2, p2, so2, sc2);

        // Clear the buffer
        s1.nextLine();

        // Student 3 details
        System.out.println("Enter the details of student3:");
        System.out.println("Enter the student3 name:");
        String std3 = s1.nextLine();
        System.out.println("Enter student3 id:");
        int sid3 = s1.nextInt();
        System.out.println("Enter maths marks of student3:");
        int m3 = s1.nextInt();
        System.out.println("Enter physics marks of student3:");
        int p3 = s1.nextInt();
        System.out.println("Enter social marks of student3:");
        int so3 = s1.nextInt();
        System.out.println("Enter science marks of student3:");
        int sc3 = s1.nextInt();
        student obj3 = new student(std3, sid3);
        int marks3 = obj3.totalmarks(m3, p3, so3, sc3);

        // Determine the student with highest marks
        if (marks1 > marks2 && marks1 > marks3) {
            System.out.println("The student who scored the highest marks is: " + obj1.sname);
        } else if (marks2 > marks1 && marks2 > marks3) {
            System.out.println("The student who scored the highest marks is: " + obj2.sname);
        } else {
            System.out.println("The student who scored the highest marks is: " + obj3.sname);
        }

        s1.close();
    }
}
