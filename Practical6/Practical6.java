package shreyansh.practical6;
import java.io.*;

public class Practical6 implements Serializable{

    public static void main(String[] args) {
        File f1 = new File("E:\\netbeans\\Projects\\Practical6\\src\\main\\java\\shreyansh\\practical6\\product.txt");
        File f2 = new File("E:\\netbeans\\Projects\\Practical6\\src\\main\\java\\shreyansh\\practical6\\customer.txt");
        int n=0;
        try{
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            FileOutputStream product = new FileOutputStream(f1);
            FileOutputStream customer = new FileOutputStream(f2);
            ObjectOutputStream p1 = new ObjectOutputStream(product);
            ObjectOutputStream c1 = new ObjectOutputStream(customer);
            
            for(int i=0; i<1; i++)
            {
                String s;
                System.out.print("Enter number of products:");
                s = console.readLine();
                n = Integer.parseInt(s);
                Product[] p = new Product[n];
                Customer c = new Customer(p);

                System.out.print("Enter Customer name: ");
                s = console.readLine();
                c.name=s;
                System.out.println("Enter Product Details:");
                for(int j=0; j<n; j++)
                {
                    p[j] = new Product();
                    System.out.print("Enter Product id: ");
                    s = console.readLine();
                    c.p[j].id=Integer.parseInt(s);
                    System.out.print("Enter Product Name: ");
                    s = console.readLine();
                    c.p[j].name=s;
                    System.out.print("Enter Quantity: ");
                    s = console.readLine();
                    c.p[j].quantity=Integer.parseInt(s);
                    System.out.print("Enter Price: ");
                    s = console.readLine();
                    c.p[j].price=Double.parseDouble(s);
                    p1.writeObject(p[j]);
                }
                c1.writeObject(c);
            }
            
            c1.flush();
            p1.flush();
            c1.close();
            p1.close();
            product.close();
            customer.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        try{
            //FileInputStream product = new FileInputStream(f1);
            FileInputStream customer = new FileInputStream(f2);
            //ObjectInputStream p1 = new ObjectInputStream(product);
            ObjectInputStream c1 = new ObjectInputStream(customer);
            
            for(int i = 0; i<1; i++)
            {
                Product[] p = new Product[n];
                for(int j=0; j<n; j++){p[j]=new Product();}
                Customer c = new Customer(p);

                c=(Customer)c1.readObject();
                System.out.println(c);
                for(int j=0; j<n; j++){System.out.println(c.p[j]);}
            }
            //product.close();
            customer.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }   
}
