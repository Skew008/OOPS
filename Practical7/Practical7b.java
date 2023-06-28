package shreyansh.practical7;

public class Practical7b {

    public static void main(String[] args) {
        StudentPhoneDirectory d = new StudentPhoneDirectory(5);
        
        d.addStudent(62,"Shreyash",4,"Pune","9075453525");
        d.addStudent(61,"Shreyansh",4,"Nagpur","9075607658");
        d.addStudent(60,"Saurabh",4,"Nagpur","9078275953");
        
        
        d.viewall();
        System.out.println();
        
        d.viewcity("Nagpur");
        System.out.println();
        
        d.removeStudent("Shreyansh");
        d.viewcity("Nagpur");
        System.out.println();
        
        d.viewall();
        System.out.println();
        
        d.removeStudent("Shreyash");
        d.removeStudent("Saurabh");
        d.viewall();
        System.out.println();
        
        d.viewcity("Nagpur");
        System.out.println();
        
        d.viewcity("Pune");
    }   
}
