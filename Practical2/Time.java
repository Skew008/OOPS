package practical2;
public class Time {
    int h,m,s;
    Time(int hour, int minute, int second)
    {
        h=hour;
        m=minute;
        s=second;
    }
    
    Time add(Time t)
    {
        Time tf=new Time(0,0,0);
        int t1=this.h*3600+this.m*60+this.s;
        int t2=t.h*3600+t.m*60+t.s;
        
        int finTime=t1+t2;
        
        tf.h = finTime/3600;
        tf.m = (finTime- (tf.h*3600))/60;
        tf.s = finTime - (tf.h*3600) - (tf.m*60);
        
        return tf;
    }
    
    Time sub(Time t)
    {
        Time tf=new Time(0,0,0);
        int t1=this.h*3600+this.m*60+this.s;
        int t2=t.h*3600+t.m*60+t.s;
        
        int finTime;
        if(t1>t2)
            finTime=86400+(t2-t1);
        else
            finTime=t2-t1;
        
        tf.h = finTime/3600;
        tf.m = (finTime- (tf.h*3600))/60;
        tf.s = finTime - (tf.h*3600) - (tf.m*60);
        
        return tf;
    }
}

