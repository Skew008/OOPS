package practical6;
import java.io.*;

public class Practical6 implements Serializable{

    public static void main(String[] args) {
        try{
//        File f1 = new File("C:\\Users\\SRCOEM\\Desktop\\b42\\Practical6\\src\\practical6\\product.txt");
//        File f2 = new File("C:\\Users\\SRCOEM\\Desktop\\b42\\Practical6\\src\\practical6\\customer.txt");
        
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream product = new FileOutputStream("C:\\Users\\SRCOEM\\Desktop\\b42\\Practical6\\src\\practical6\\product.txt");
        FileOutputStream customer = new FileOutputStream("C:\\Users\\SRCOEM\\Desktop\\b42\\Practical6\\src\\practical6\\customer.txt");
        ObjectOutputStream p1 = new ObjectOutputStream(product);
        ObjectOutputStream c1 = new ObjectOutputStream(customer);
        
        Product p = new Product();
        Customer c = new Customer(p);
        String s;
        
        System.out.print("Enter Customer name: ");
        s = console.readLine();
        c.name=s;
        System.out.println("Enter Product Details:");
        System.out.print("Enter Product id: ");
        s = console.readLine();
        c.p.id=Integer.parseInt(s);
        System.out.print("Enter Product Name: ");
        s = console.readLine();
        c.p.name=s;
        System.out.print("Enter Quantity: ");
        s = console.readLine();
        c.p.quantity=Integer.parseInt(s);
        System.out.print("Enter Price: ");
        s = console.readLine();
        c.p.price=Double.parseDouble(s);
        
        c1.writeObject(c);
        p1.writeObject(p);
        
        c1.flush();
        p1.flush();
        c1.close();
        p1.close();
        product.close();
        customer.close();
        System.out.println(c);
        System.out.println(p);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }   
}
