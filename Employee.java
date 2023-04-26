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
        for(int i=0; i<3;i++)
        {
            t = t.add(a[i].tin.sub(a[i].tout));
        }
        System.out.println(t);
    }
}
