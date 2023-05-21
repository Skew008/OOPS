package Q1;

public class Q1 {
    public static void main(String[] args) {
        Department d = new Department();
        int flag=0; //For checking number of students
        
        d.s[0] = new Student();
        d.s[1] = new Student();
//        d.s[2] = new Student();
//        d.s[3] = new Student();
//        d.s[4] = new Student();s
       
        for(int i=0; d.s[i] != null; i++) //Counting number of students
        {
            flag++;
        }
        d.averageage(flag);

//        d.t[0] = new Teacher();
//        System.out.println(d.t[0].age());
    }
    
}
