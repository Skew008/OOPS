package Q1;
import java.time.*;
import java.util.*;

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
    
    int age(){ // 'a' part
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
    double[] cgpa;
    
    Student()
    {
        super();
        super.age();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter RollNo.:");
        rollno = sc.nextInt();
        System.out.print("Enter Semester:");
        sem = sc.nextInt();
        cgpa = new double[sem];
        for(int i=0; i<sem;i++){
            System.out.print("Enter CGPA of sem "+(i+1)+":");
            cgpa[i] = sc.nextDouble();
        }
    }
    
    void DeptAvg(){ // 'e' part
        double sum = 0;
        double CGPA = 0;
        for(int i=0; i<sem; i++)
        {
            sum += cgpa[i];
        }
        CGPA = sum/sem;
        System.out.println("Departmental Average is "+CGPA);
    }
    
    void SemAvg(int sem){ // 'f' part
        double sum = 0;
        double CGPA = 0;
        for(int i=0; i<sem; i++)
        {
            sum += cgpa[i];
        }
        CGPA = sum/sem;
        System.out.println("Semester Average CGPA "+CGPA);
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
    
    double salary(){ // 'd' part
        String a = "PG";
        String b = "PHD";
        
        if(qualification.equals(a))
            salary = 60000 + (exp*2000);
        if(qualification.equals(b))
            salary = 80000 + (exp*2000);
        return salary;
    }
}

class Department{
    String name;
    Student[] s = new Student[10];
    Teacher[] t = new Teacher[5];
    
    Department(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department name:");
        name = sc.nextLine();
    }
    
    void minmax(int flag){ // 'b' part
        int[] age = new int[flag];
        for(int i=0; i<flag; i++)
        {
            age[i]=t[i].age;
        }
        
        int max = 0;
        for(int i=0; i<age.length; i++ ) {
           if(age[i]>max) {
                max = age[i];
           }
        }
        
        int min = 0;
        for(int i=0; i<age.length; i++ ) {
           if(age[i]<min) {
                min = age[i];
           }
        }
        
        System.out.println("Minimum and Maximum ages are "+min+" years and "+max+" years.");
    }
    
    void averageage(int flag){ // 'c' part
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
