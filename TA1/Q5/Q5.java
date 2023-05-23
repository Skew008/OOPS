package Q5;

public class Q5 {

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Porche","MP+31 AZ-8207");
        try{
            v.validity();
        }
        catch(InvalidVehicle e){
            System.out.println("Caught:"+e.message());
        }
    }
    
}
