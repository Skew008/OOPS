import java.util.*;

class TimeZone extends Time{
    Zone z = new Zone();
    Time t1,t2;
    String timezone = "";
    Scanner c = new Scanner(System.in);
    
    TimeZone()
    {
        super();
        System.out.print("Enter Current time zone(IN, US, UK, RU):");
        timezone = c.nextLine();
        t1 = z.zone(timezone);
    }
    
    void convert()
    {
        Time tf = new Time(0,0);
        System.out.print("Enter Time Zone to be converted to(IN, US, UK, RU):");
        timezone = c.nextLine();
        t2 = z.zone(timezone);
        
        if(t1.hours>t2.hours)
        {
            tf = super.sub(t1.sub(t2)); //tf = t - (t1 - t2)
        }
        if(t2.hours>t1.hours)
        {
            tf = super.add(t2.sub(t1)); //tf = t + (t2 - t1)
        }
        tf.display();
    }
}

class Zone{
    Time t = new Time(0,0);
    Time zone(String s)
    {
        if(s.equals("IN"))
        {
            t = new Time(5,30);
        }
        if(s.equals("US"))
        {
            t = new Time(-4,0);
        }
        if(s.equals("UK"))
        {
            t = new Time(0,0);
        }
        if(s.equals("RU"))
        {
            t = new Time(3,0);
        }
        return t;
    }
}
