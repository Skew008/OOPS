package Q1;
import java.time.*;
import java.util.*;
/**
 *
 * @author MSI
 */
public class Person {
    String name;
    LocalDate dob;
    int age;
    
    Person(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:");
        name = sc.nextLine();
        System.out.print("Enter DOB in YYYY-MM-DD format:");
        String date = sc.nextLine();
        dob = LocalDate.parse(date);
        //sc.close();
    }
    
    int age(){
        LocalDate cur = LocalDate.now();
        if ((dob != null) && (cur!= null))   
        {  
            age=Period.between(dob, cur).getYears();
            return age;  
        }    
        return 0;
    }
}

class Student extends Person{
    int rollno;
    int sem;
    double cgpa;
    
    Student()
    {
        super();
        super.age();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter RollNo.:");
        rollno = sc.nextInt();
        System.out.print("Enter Semester:");
        sem = sc.nextInt();
        System.out.print("Enter CGPA:");
        cgpa = sc.nextDouble();
    }
}

class Teacher extends Person{
    double salary;
    String qualification;
    int exp;
    
    Teacher(){
        super();
        super.age();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Qualification:");
        qualification = sc.nextLine();
        System.out.print("Enter Experiece:");
        exp = sc.nextInt();
    }
}

class Department{
    String name;
    Student[] s = new Student[5];
    Teacher[] t = new Teacher[2];
    
    Department(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department name:");
        name = sc.nextLine();
    }
     
    void averageage(int flag){
        int age  = 0;
        double avgage = 0;
        for(int i=0; i<flag; i++)
        {
            age += s[i].age; 
        }
        avgage = age/flag;
        System.out.println("Average age of students: "+avgage);
    }
}