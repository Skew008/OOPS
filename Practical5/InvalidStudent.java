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
        if(!(cgpa>0 && cgpa<10)) //Checking for valid CGPA
        {
            throw new InvalidStudent("CGPA not valid.");
        }
    }
    
    void enrollnumber() throws InvalidStudent
    {
        if(enrollmentNumber.length()!=10) //Checking for length of Enrollment Number
            throw new InvalidStudent("Length of enrollment Number is not valid");
        
        String a = "BE";
        String b = "CSU"; //For checking the branch
        String c = "ENU"; //For checking the branch
        String d = "ECU"; //For checking the branch
        String e = "EEU"; //For checking the branch
        int f = Integer.parseInt(enrollmentNumber.substring(2, 4)); //For number between 20-23
        int g = Integer.parseInt(enrollmentNumber.substring(7, 10)); //For number between 001-250
        
        //Now check for the given parameters in the question
        if(!(enrollmentNumber.substring(0,2).equals(a) && (f>=20 && f<=23) &&(enrollmentNumber.substring(4,7).equals(b) || enrollmentNumber.substring(4,7).equals(c) || enrollmentNumber.substring(4,7).equals(d) || enrollmentNumber.substring(4,7).equals(e)) && (g>=1 && g<=250)))
        {
            throw new InvalidStudent("Enrollment Number not valid");
        }
    }
    
    void password() throws InvalidStudent
    {
        if(password.length()<8) //Checing for length of password
        {
            throw new InvalidStudent("Passowrd Length less than 8");
        }
        else
        {
            char[] s = new char[password.length()];
            for(int i=0; i<password.length(); i++)
                s[i] = password.charAt(i); // Converting string to char array
            int uc=0; //Count of Uppercase 
            int lc=0; //Count of Lowercase
            int ss=0; //Count of Special Symbol
            int no=0; //Count of Numbers
            
            //Checking for required parameters given in question
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
            
            String[] a = new String[4]; //For storing invalid messages
            for(int i=0; i<4; i++)
                a[i]=" "; //Initializing all the values of array to null
            if(uc==0)
                a[0]=" Uppercase";
            if(lc==0)
                a[1]=" Lowercase";
            if(ss==0)
                a[2]=" Special Symbol";
            if(no==0)
                a[3]=" Number";
            if(uc==0 || lc==0 || ss==0 || no==0)
                throw new InvalidStudent("Password Invalid, involve the following:"+a[0]+a[1]+a[2]+a[3]);
        }
    }
}
