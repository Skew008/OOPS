
package practical5;

class InvalidStudent extends Exception{
    String message;
    InvalidStudent(String s){
    message = s;
    }
    
    public String message(){
        return message;
    }
}

class Student{
    String name;
    double cgpa;
    String enrollmentNumber;
    String password;
    
    Student(String name, double cgpa, String enroll, String password)
    {
        this.name=name;
        this.cgpa=cgpa;
        enrollmentNumber=enroll;
        this.password=password;
    }
    
    void cgpa() throws InvalidStudent
    {
        if(!(cgpa>0 && cgpa<10))
        {
            throw new InvalidStudent("CGPA not valid.");
        }
    }
    
    void enrollnumber() throws InvalidStudent
    {
        String a = "BE";
        String b = "CSU";
        String c = "ENU";
        String d = "ECU";
        String e = "EEU";
        int f = Integer.parseInt(enrollmentNumber.substring(2, 4));
        int g = Integer.parseInt(enrollmentNumber.substring(7, 10));
        
        if(!(enrollmentNumber.substring(0,2).equals(a) && (f>=20 && f<=23) &&(enrollmentNumber.substring(4,7).equals(b) || enrollmentNumber.substring(4,7).equals(c) || enrollmentNumber.substring(4,7).equals(d) || enrollmentNumber.substring(4,7).equals(e)) && (g>1 && g<250)))
        {
            throw new InvalidStudent("Enrollment Number not valid");
        }
    }
    
    void password() throws InvalidStudent
    {
        if(password.length()<8)
        {
            throw new InvalidStudent("Length less than 8");
        }
        else
        {
            char[] s = new char[password.length()];
            for(int i=0; i<password.length(); i++)
                s[i] = password.charAt(i);
            int uc=0;
            int lc=0;
            int ss=0;
            int no=0;
            for(int i=0; i<password.length(); i++)
            {
                if(s[i] >= 'A' && s[i]<= 'Z')
                    uc++;
                if(s[i] >= 'a' && s[i]<= 'z')
                    lc++;
                if(s[i] >= '0' && s[i]<= '9')
                    no++;
                if(s[i]=='!' || s[i]=='$' || s[i]=='*' || s[i]=='&'|| s[i]=='%')
                    ss++;
            }
            if(uc==0)
                throw new InvalidStudent("Upper case not involved.");
            if(lc==0)
                throw new InvalidStudent("Lower case not involved.");
            if(ss==0)
                throw new InvalidStudent("Special symbol not involved.");
            if(no==0)
                throw new InvalidStudent("Number not involved.");
        }
    }
}

public class Practical5 {

    public static void main(String[] args) {
        Student s1= new Student("Shreyansh", 9.03f, "BE23CSU200","AFHDF&54");
        try{
            s1.cgpa();
            s1.enrollnumber();
            s1.password();
        }
        catch(InvalidStudent e){
            System.out.println("Caught: "+e.message());
        }
    }
    
}

