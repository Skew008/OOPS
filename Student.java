package practical3_a61;

class Student {
    String name;
    String gender;
    String deptname;
    float cgpa;
    
    Student(String n, String g, String d, float c)
    {
        name=n;
        gender=g;
        deptname=d;
        cgpa=c;
    }
    
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Department Name:"+deptname);
        System.out.println("CGPA:"+cgpa);
    }
}

class Placement extends Student{
    String indname;
    int Package;
    int joining;
    
    Placement(String n, String g, String d, float c, String i, int p, int j)
    {
        super(n,g,d,c);
        indname=i;
        Package=p;
        joining=j;
    }
    
    void display()
    {
        super.display();
        System.out.println("Industry Name:"+indname);
        System.out.println("Annual Package:"+Package);
        System.out.println("Joining Letter Number:"+joining);
    }
}

class HighStudy extends Student{
    String degname;
    String colname;
    int adletno;
    String examname;
    int score;
    
    HighStudy(String n, String g, String d, float c, String deg, String col, int a, String e, int s)
    {
        super(n,g,d,c);
        degname=deg;
        colname=col;
        adletno=a;
        examname=e;
        score=s;
    }
    
    void display()
    {
        super.display();
        System.out.println("Degree Name:"+degname);
        System.out.println("College Name:"+colname);
        System.out.println("Admission Letter Number:"+adletno);
        System.out.println("Compititive Exam Name:"+examname);
        System.out.println("Compititive Exam Score:"+score);
    }
}

class Entrepreneurship extends Student{
    String compname;
    String sector;
    int empcount;
    int anturnover;
    
    Entrepreneurship(String n, String g, String d, float c, String com, String sec, int count, int turnover)
    {
        super(n,g,d,c);
        compname=com;
        sector=sec;
        empcount=count;
        anturnover=turnover;
    }
    
    void display()
    {
        super.display();
        System.out.println("Company Name:"+compname);
        System.out.println("Sector:"+sector);
        System.out.println("Number of Employees:"+empcount);
        System.out.println("Annual Turnover:"+anturnover);
    }
}