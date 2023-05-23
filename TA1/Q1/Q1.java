package Q1;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Department d = new Department();
        int flag1=0; //For checking number of students
        int flag2=0; //For checking number of teachers
        
        d.s[0] = new Student();
//        d.s[1] = new Student();
//        d.s[2] = new Student();
//        d.s[3] = new Student();
//        d.s[4] = new Student();
        d.t[0] = new Teacher();
//        d.t[1] = new Teacher();
//        d.t[2] = new Teacher(); 
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Refer the menu below to perform functionalities:");
        System.out.println("Enter 1 to get age.");
        System.out.println("Enter 2 to get Minmum and Maximum age from teachers data.");
        System.out.println("Enter 3 to get average age of students data.");
        System.out.println("Enter 4 to get salary of a teacher.");
        System.out.println("Enter 5 to get CGPA of all semesters.");
        System.out.println("Enter 6 to get CGPA till perticular semester.");  
        System.out.println("Enter 7 to terminate program.");
        System.out.println("------------------------------------------------------------------------");
        int i;
        Scanner s = new Scanner(System.in);
        Scanner S = new Scanner(System.in);
        for(i=0; i!=-1; i++)
        {
            System.out.print("Enter choice: ");
            i = s.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println("Enter name of person:");
                    String name = S.nextLine();
                    int j = 0;
                    int a = 0;
                    while(d.s[j]!=null || d.t[j]!=null)
                    {
                        if(d.s[j].name.equals(name)){
                            a = d.s[j].age();
                            System.out.println(name+"'s age is "+a);
                            break;
                        }
                        if(d.t[j].name.equals(name)){
                            a = d.t[j].age();
                            System.out.println(name+"'s age is "+a);
                            break;
                        }
                        j++;
                    }
                    System.out.println("------------------------------------------------------------------------");
                break;
                case 2:
                    for(j=0; d.t[j]!=null; j++) //Counting number of teachers
                    {
                        flag2++;
                    }
                    d.minmax(flag2);
                    System.out.println("------------------------------------------------------------------------");
                break;
                case 3:
                    for(j=0; d.s[j]!=null; j++) //Counting number of students
                    {
                        flag1++;
                    }
                    d.averageage(flag1); 
                    System.out.println("------------------------------------------------------------------------");
                break;
                case 4:
                    System.out.println("Enter name of teacher:");
                    name = S.nextLine();
                    j=0;
                    double b;
                    while(d.t[j]!=null)
                    {
                        if(d.t[j].name.equals(name)){
                            b = d.t[j].salary();
                            System.out.println(name+"'s salary is "+b);
                            break;
                        }
                        j++;
                    }
                    System.out.println("------------------------------------------------------------------------");
                break;
                case 5:
                    System.out.println("Enter name of student:");
                    name = S.nextLine();
                    j=0;
                    while(d.s[j]!=null)
                    {
                        if(d.s[j].name.equals(name)){
                            d.s[j].DeptAvg();
                            break;
                        }
                        j++;
                    }
                    System.out.println("------------------------------------------------------------------------");
                break;
                case 6:
                    System.out.println("Enter name of student:");
                    name = S.nextLine();
                    System.out.println("Enter sem number:");
                    int sem = s.nextInt();
                    j=0;
                    while(d.s[j]!=null)
                    {
                        if(d.s[j].name.equals(name)){
                            d.s[j].SemAvg(sem);
                            break;
                        }
                        j++;
                    }
                    System.out.println("------------------------------------------------------------------------");
                break;
                case 7:
                    i=-1;
            }
            if(i==-1)
                break;
        }  
    }
}
