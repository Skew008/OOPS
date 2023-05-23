import java.util.*;

class Time{
    int hours; 
    int minutes;
    Scanner sc = new Scanner(System.in);
    
    Time(int h, int m)
    {
        hours = h;
        minutes = m;
    }
    Time()
    {
        System.out.print("Enter Hours:");
        hours = sc.nextInt();
        System.out.print("Enter Minutes:");
        minutes = sc.nextInt();
    }
    
    Time add(Time t)
    {
        Time tf = new Time(0,0);
        
        tf.hours = this.hours + t.hours;
        tf.minutes = this.minutes + t.minutes;
        
        if(tf.minutes>=60)
        {
            tf.minutes = tf.minutes - 60;
            tf.hours++;
        }
        
        return tf;
    }
    
    Time sub(Time t)
    {
        Time tf = new Time(0,0);
        
        tf.hours = this.hours - t.hours;
        tf.minutes = this.minutes - t.minutes;
        
        if(tf.minutes<0)
        {
            tf.minutes = tf.minutes + 60;
            tf.hours = tf.hours - 1;
        }
        if(tf.hours<0)
            tf.hours = tf.hours + 24;
        
        return tf;
    }
    
    void display()
    {
        System.out.print(this.hours+":"+this.minutes);
    }
}
