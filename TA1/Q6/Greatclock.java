import java.util.*;

class GreatClock extends Time{
    float seconds;
    float miliseconds;
    Scanner s = new Scanner(System.in);
    
    GreatClock(int h, int m, float s)
    {
        super(h,m);
        seconds=s;
    }
    GreatClock()
    {
        super();
        System.out.print("Enter seconds:");
        seconds = s.nextFloat();
        System.out.print("Enter miliseconds:");
        miliseconds = s.nextFloat();
        seconds = seconds + (miliseconds/1000);
    }
    
    GreatClock add(GreatClock t)
    {
        GreatClock tf = new GreatClock(0,0,0);
        
        tf.hours = super.hours + t.hours;
        tf.minutes = super.minutes + t.minutes;
        tf.seconds = this.seconds + t.seconds;
        
        if(tf.seconds>=60)
        {
            tf.seconds = tf.seconds - 60;
            tf.minutes++;
        }
        if(tf.minutes>=60)
        {
            tf.minutes = tf.minutes - 60;
            tf.hours++;
        }
        
        return tf;
    }
    
    GreatClock sub(GreatClock t)
    {
        GreatClock tf = new GreatClock(0,0,0);
        
        tf.hours = super.hours - t.hours;
        tf.minutes = super.minutes - t.minutes;
        tf.seconds = this.seconds - t.seconds;
        
        if(tf.seconds<0)
        {
            tf.seconds = tf.seconds + 60;
            tf.minutes = tf.minutes - 1;
        }
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
        super.display();
        System.out.println(":"+this.seconds);
    }
}
