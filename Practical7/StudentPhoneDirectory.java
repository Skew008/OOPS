/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shreyansh.practical7;
import java.util.*;

public class StudentPhoneDirectory {
    Student[] s;
    int length = 0;
    int index = -1;
    int size;
    
    StudentPhoneDirectory(int s)
    {
        size = s;
        this.s = new Student[size];
    }
    
    void addStudent(int r, String n, int s, String c, String con)
    {
        if(index<size)
        {
            length++;
            index++;
            this.s[index] = new Student(r,n,s,c,con);
        }
        ArrayList<Student> al = new ArrayList<>();
        for(int i=0; i<length; i++){al.add(this.s[i]);}
        Collections.sort(al, new comp());
        for(int i=0; i<length; i++){this.s[i] = al.get(i);}
    }
    
    void removeStudent(String n)
    {
        int flag=0;
        for(int i=0; i<s.length; i++)
        {
            if(s[i]!=null)
            {
                if(n.equals(s[i].name))
                {
                    s[i] = null;
                    flag++;
                    length--;
                } 
            }
        }
        if(flag==0)
            System.out.println("No student with name "+n+" exist in direcetory");
    }
    
    void viewcity(String c)
    {
        int i=0;
        int flag=0;
        while(i<s.length)
        {
            if(s[i]!=null){
            if(c.equals(s[i].city))
            {
                System.out.println("Name:"+s[i].name+", Phone:"+s[i].contact);
                flag++;
            }}
            i++;
        }
        if(flag==0)
            System.out.println("No one from "+c+" city");
    }
    
    void viewall()
    {
        int i=0;
        int flag=0;
        while(i<s.length)
        {
            if(s[i]!=null)
            {
                System.out.println("Name:"+s[i].name+", Phone:"+s[i].contact);
                flag++;
            }
            i++;
        }
        if(flag==0)
            System.out.println("No student");
    }
}

class myException{
    
    String message;
    
    myException(String d)
    {
        message = d;
    }
    
    public String toString()
    {
        return message;
    }
}

class comp implements Comparator<Student>{
    
    @Override
    public int compare(Student s1, Student s2)
    {
        if(s1.sem!=s2.sem)
            return s1.sem - s2.sem;
        else
            return s1.roll - s2.roll;
    }
}
