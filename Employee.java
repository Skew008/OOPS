public class Employee{
    int age, salary,id;
    String name, designation;
    Attendance[] a;
    
    Employee(String name, int age, int salary, int id, String designation, Attendance[] a)
    {
        this.name=name;
        this.id=id;
        this.designation=designation;
        this.age=age;
        this.salary=salary;
        this.a=a;
    }
    
    void workingHours()
    {
        Time t=new Time(0,0,0);
        for(int i=0; i<a.length;i++)
        {
            t = t.add(a[i].tin.sub(a[i].tout));
        }
        System.out.print("Name:"+name+"\nHours Worked:");
        display(t);
    }
    
    void dateWrite(int dd,int mm, int yy)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i].dd==dd && a[i].mm==mm && a[i].yy==yy)
            {
                Time t = a[i].tin.sub(a[i].tout);
                System.out.println("Name:"+name);
                System.out.print("IN Time:");
                display(a[i].tin);
                System.out.print("OUT Time:");
                display(a[i].tout);
                System.out.print("Hours Worked on "+dd+"/"+mm+"/"+yy+" :");
                display(t);
                
            }
        }
    }
    
    void display(Time t)
    {
        System.out.println(t.h+":"+t.m+":"+t.s);
    }
}
