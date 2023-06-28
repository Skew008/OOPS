/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical7;

/**
 *
 * @author MJC
 */
public class StudentPhoneDirectory {
    int roll;
    String name;
    int sem;
    String city;
    String contact;
    
    StudentPhoneDirectory(int r, String n, int s, String c, String con)
    {
        roll = r;
        name = n;
        sem = s;
        city = c;
        contact = con;
    }
    
    void addStudent(int r, String n, int s, String c, String con)
    {
        roll = r;
        name = n;
        sem = s;
        city = c;
        contact = con;
    }
    
    static void removeStudent(StudentPhoneDirectory s)
    {
        s = null;
    }
    
    void viewcity(String c, StudentPhoneDirectory[] s)
    {
        int i=0;
        while(i<s.length)
        {
            if(c.equals(s[i].city))
            {
                System.out.println("Name:"+name+", Phone:"+contact);
            }
        }
    }
    
    void viewall()
    {
            
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
