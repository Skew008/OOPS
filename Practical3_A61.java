package practical3_a61;

public class Practical3_A61 {

    public static void main(String[] args) {
        Student[] s= new Student[5];
        s[0]=new Placement("Shreyansh","Male","CSE",9.02f,"ABC",1000000,1371);
        s[1]=new HighStudy("Saurabh","Male","CSE",9.5f,"B.Tech","RCOEM",12232,"CAT",280);
        s[2]=new Entrepreneurship("Shreyash","Male","CSE",9.8f,"XYZ","Agriculture",25,5000000);
        s[0].display();
        System.out.println("-------------------------------------------------------------------");
        s[1].display();
        System.out.println("-------------------------------------------------------------------");
        s[2].display();
    }
    
}
