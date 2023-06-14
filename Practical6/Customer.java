package shreyansh.practical6;
import java.io.Serializable;
public class Customer implements Serializable{
    static int id = 0;
    String cid;
    String name;
    int n;
    Product p[];
    
    Customer(int n, Product[] p)
    {
        this.n=n;
        this.p = p;
        id=id+1;
        if(id>=1 && id<=9)
            cid = "C00"+id;
        else if(id>=10 && id<=99)
            cid = "C0"+id;
        else if(id>=100 && id<=999)
            cid = "C"+id;
    }
    
    public String toString()
    {
        return "Customer ID:"+cid+", Name:"+name+", Product Details:\n";
    }
}
