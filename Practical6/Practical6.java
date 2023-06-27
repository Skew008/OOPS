package shreyansh.practical6;
import java.io.*;

public class Practical6 implements Serializable{

    public static void main(String[] args) {
        File f1 = new File("E:\\netbeans\\Projects\\Practical6\\src\\main\\java\\shreyansh\\practical6\\product.txt");
        File f2 = new File("E:\\netbeans\\Projects\\Practical6\\src\\main\\java\\shreyansh\\practical6\\customer.txt");
        int n;
        int prodcount=-1;
        try{
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            FileOutputStream product = new FileOutputStream(f1);
            FileOutputStream customer = new FileOutputStream(f2);
            ObjectOutputStream p1 = new ObjectOutputStream(product);
            ObjectOutputStream c1 = new ObjectOutputStream(customer);
            
            Customer[] c = new Customer[2];
            Product[] pstore = new Product[5];
            for(int i=0; i<2; i++)
            {
                System.out.println("Customer "+(i+1));
                String s;
                System.out.print("Enter number of products:");
                s = console.readLine();
                n = Integer.parseInt(s);
                Product[] p = new Product[n];
                c[i] = new Customer(n,p);

                System.out.print("Enter Customer name: ");
                s = console.readLine();
                c[i].name=s;
                System.out.println("Enter Product Details:");
                for(int j=0; j<n; j++)
                {
                    p[j] = new Product();
                    System.out.print("Enter Product id: ");
                    s = console.readLine();
                    c[i].p[j].id=Integer.parseInt(s);
                    System.out.print("Enter Product Name: ");
                    s = console.readLine();
                    c[i].p[j].name=s;
                    System.out.print("Enter Quantity: ");
                    s = console.readLine();
                    c[i].p[j].quantity=Integer.parseInt(s);
                    System.out.print("Enter Price: ");
                    s = console.readLine();
                    c[i].p[j].price=Double.parseDouble(s);
                    //p1.writeObject(p[j]);
                    int count=0;
                    while(pstore[count]!=null && count<n )
                    {
                        if(p[j].name.equals(pstore[count].name)){
                            pstore[count].quantity = pstore[count].quantity + p[j].quantity;
                            break;}
                        else
                            count++;
                    }
                    if(pstore[count]==null || count==n)
                    {
                        prodcount++;
                        pstore[prodcount] = p[j];
                    }
                }
                c1.writeObject(c[i]);
            }
            for(int i=0; i<=prodcount; i++)
            {
                //System.out.println(pstore[i]);
                p1.writeObject(pstore[i]);
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
            FileInputStream product = new FileInputStream(f1);
            FileInputStream customer = new FileInputStream(f2);
            ObjectInputStream p1 = new ObjectInputStream(product);
            ObjectInputStream c1 = new ObjectInputStream(customer);
            
            Customer[] c = new Customer[2];
            Product[] pretrieve = new Product[5];
            
            System.out.println("Customer.txt");
            for(int i = 0; i<2; i++)
            {
                c[i]=(Customer)c1.readObject();
                System.out.println(c[i]);
                for(int j=0; j<c[i].n; j++){System.out.println(c[i].p[j]);}
            }
            System.out.println("Product.txt");
            for(int i = 0; i<=prodcount; i++)
            {
                pretrieve[i]=(Product)p1.readObject();
                System.out.println(pretrieve[i]);
            }
            p1.close();
            c1.close();
            product.close();
            customer.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }   
}
