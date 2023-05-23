package Q5;

public class InvalidVehicle extends Exception{
    String d;
    InvalidVehicle(String a){
        d=a;
    }
    
    public String message(){
        return d;
    }
}

class Vehicle{
    String name;
    String regnum;
    
    Vehicle(String name, String regno){
        this.name=name;
        regnum=regno;
    }
    
    void validity() throws InvalidVehicle
    {
        if(regnum.length()!=13)
            throw new InvalidVehicle("Invalid Length.");
        else{
            String a= "MH";
            String b= "MP";
            String c= "AP";
            String d= "DL";
            String e= "GJ";
            
            char[] s = new char[regnum.length()];
            for(int i=0; i<regnum.length(); i++)
            {
                s[i]=regnum.charAt(i);
            }
            
            if(!((regnum.substring(0, 2).equals(a) ||regnum.substring(0, 2).equals(b) ||regnum.substring(0, 2).equals(c) ||regnum.substring(0, 2).equals(d) ||regnum.substring(0, 2).equals(e))))
                throw new InvalidVehicle("State not valid.");
            
            if((s[2]=='-') &&(s[3]>='0' && s[3]<='9') && (s[4]>='0' && s[4]<='9') && (s[5]==' ') && (s[6]>='A' && s[6]<='Z') && (s[7]>='A' && s[7]<='Z') && (s[8]=='-') && (s[9]>='0' && s[9]<='9') && (s[10]>='0' && s[10]<='9') && (s[11]>='0' && s[11]<='9') && (s[12]>='0' && s[12]<='9'))
                System.out.println("Number is valid:"+regnum);
            else
                throw new InvalidVehicle("Registration Number not in standard format(CC-99 CC-9999,stands for character and 9 stands for number).");
        }
    }
}
