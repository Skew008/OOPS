
package practical2;



public class Practical2 {
public static void main(String[] args) {

    Attendance[] a1=new Attendance[3];
    Time tin=new Time(10,0,0);
    Time tout=new Time(19,0,0);
    a1[0]=new Attendance(tin,tout,17,4,23);
    tin=new Time(13,0,0);
    tout=new Time(19,0,0);
    a1[1]=new Attendance(tin,tout,18,4,23);
    tin=new Time(12,0,0);
    tout=new Time(20,0,0);
    a1[2]=new Attendance(tin,tout,19,4,23);
    Employee e1=new Employee("Shreansh",20,24590,1120,"SD",a1);
    e1.workingHours();
    e1.dateWrite(19,4,23);
    }
    
}
