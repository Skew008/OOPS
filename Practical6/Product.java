package practical6;
import java.io.Serializable;
public class Product implements Serializable{
    int id;
    String name;
    int quantity;
    double price;
    
//    Product(int i, String n, int q, double p)
//    {
//        id = i;
//        name = n;
//        quantity = q;
//        price = p;
//    }
    
    public String toString()
    {
        return "Id:"+id+", Product Name:"+name+", Quantity:"+quantity+", Price:"+price;
    }
}
