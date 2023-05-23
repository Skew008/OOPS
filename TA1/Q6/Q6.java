public class Q6{
    public static void main(String[] args){
        Time t1 = new Time();
        Time t2 = new Time();
        
        Time t3 = t1.add(t2);
        t3.display();
        System.out.println();
        Time t4 = t1.sub(t2);
        t4.display();
        System.out.println();
        System.out.println();
        
        GreatClock ta = new GreatClock();
        GreatClock tb = new GreatClock();
        
        GreatClock tc = ta.add(tb);
        tc.display();
        GreatClock td = ta.sub(tb);
        td.display();
        System.out.println();
        
        TimeZone t = new TimeZone();
        t.convert();
    }
}
