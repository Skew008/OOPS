package practical2;

public class Practical2 {
public static void main(String[] args) {
//        Time t1=new Time(12,3,45);
//        Time t2=new Time(23,2,42);
//        Time tf=t1.add(t2);
//        System.out.println(tf.h+":"+tf.m+":"+tf.s);
    
    Attendance[] a = new Attendance[3];
    Time tin=new Time(12,3,5);
    Time tout=new Time(19,0,0);
    a[0]=new Attendance(tin,tout,17,4,23);
    tin=new Time(12,3,5);
    tout=new Time(19,0,0);
    a[1]=new Attendance(tin,tout,17,4,23);
    tin=new Time(12,3,5);
    tout=new Time(19,0,0);
    a[2]=new Attendance(tin,tout,17,4,23);
    }
    
}
