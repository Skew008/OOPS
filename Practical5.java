package practical5;

public class Practical5 {

    public static void main(String[] args) {
        Student[] s = new Student[5];
        s[0] = new Student("Shreynash", 9.34f, "BE21CSU234", "Shfdjis$123");
        s[1] = new Student("Saurabh", -9.9f, "BE22CSU500", "hfdjis123");
        s[2] = new Student("Shreyash", 8f, "BE22CSU235", "SDFSGG*DD");
        s[3] = new Student("Shubham", -9.57f, "BE22CSU344", "Shfdjis!123");
        s[4] = new Student("Smit", 10.5f, "BE22CSU01", "S123");
        
        int flag=0;
        for(int i=0; i<5; i++)
        {
            try{
                System.out.println("----------------------------------------------------------------------------------------------------------------------------");
                s[i].cgpa();
                System.out.println("Valid Cgpa");
                System.out.println();
            }
            catch(InvalidStudent e){
                flag++;
                System.out.println("Caught Exception:"+e.message());
                System.out.println();
            }
            try{
                s[i].enrollnumber();
                System.out.println("Valid EnrollmentNumber");
                System.out.println();
            }
            catch(InvalidStudent e){
                flag++;
                System.out.println("Caught Exception:"+e.message());
                System.out.println();
            }
            try{
                s[i].password();
                System.out.println("Valid Password");
                System.out.println();
            }
            catch(InvalidStudent e){
                flag++;
                System.out.println("Caught Exception:"+e.message());
                System.out.println("----------------------------------------------------------------------------------------------------------------------------");
            }
            if(flag==0){
            System.out.println("All information is valid :)");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
            }
        }
    }
}
