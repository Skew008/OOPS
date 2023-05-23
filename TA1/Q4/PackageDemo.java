package PackageDemo;
import Q4.Arithmetic;

public class PackageDemo {

    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        double ans = a.add(3.4,3.75);
        System.out.println("Addition = "+ans);
        ans = a.sub(3.75, 3.4);
        System.out.println("Addition = "+ans);
    }
    
}
