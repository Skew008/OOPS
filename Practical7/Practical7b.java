package shreyansh.practical7;

public class Practical7b {

    public static void main(String[] args){
        try{
            StudentPhoneDirectory d = new StudentPhoneDirectory(5);

            d.addStudent(62,"Shreyash",4,"Pune","9075453525");
            d.addStudent(61,"Shreyansh",4,"Nagpur","9075607658");
            d.addStudent(64,"Smit",4,"Nagpur","9832456732");
            d.addStudent(60,"Saurabh",4,"Nagpur","");
            d.addStudent(63, "Shubham", 0,"Delhi","9237246758");
            System.out.println();
            System.out.println("Current students in Directory:");
            d.viewall();
            System.out.println();
            System.out.println("From Nagpur city:");
            d.viewcity("Nagpur");
            System.out.println();
            System.out.println("Removing (Shreyansh)");
            d.removeStudent("Shreyansh");
            System.out.println("From Nagpur city:");
            d.viewcity("Nagpur");
            System.out.println();
            System.out.println("From Pune city:");
            d.viewcity("Pune");
            System.out.println();
            System.out.println("Current students in Directory:");
            d.viewall();
            System.out.println();
            System.out.println("Removing (Shreyash)");
            d.removeStudent("Shreyash");
            System.out.println("From Pune city:");
            d.viewcity("Pune");
            System.out.println();
            System.out.println("Removing (Shubham)");
            d.removeStudent("Shubham");
            System.out.println();
            System.out.println("Current students in Directory:");
            d.viewall(); 
            System.out.println();            
            System.out.println("Removing (Smit)");
            d.removeStudent("Smit");
            System.out.println("Current students in Directory:");
            d.viewall();
        }
        catch(myException e)
        {
            System.out.println(e.message);
        }
    }   
}
