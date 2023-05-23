import java.util.*;
class Functions{
        String s; //Input in fraction form
        char[] c; //To store string converted char array
        int i;
        char[] final1; //To store decimal part
    	Scanner sc = new Scanner(System.in);
    	
    	Functions(){
    	    System.out.print("Enter the number in fraction form:");
    	    s = sc.nextLine();
    	    c = new char[s.length()]; // String to char[] 
    		for(int i=0; i<s.length(); i++)
    		{
    		    c[i]=s.charAt(i);
    		}
    	}
    	
		float decimalcon() //Fraction to decimal conversion
		{
		    i=0; //Declared above
    		String a=""; //Storing before '/' part
            while(c[i]!='/')
            {
                a = a+c[i];
                i++;
            }
            i++; //To get next character after '/'
            String b=""; //Storing after '/' part
            while(i!=s.length())
            {
                b = b+c[i];
                i++;
            }
            // Converting string to float value for performing division
            float m = Float.parseFloat(a); 
            float n = Float.parseFloat(b);
            float num = m/n;
            return num; //Returning in decimal form 
		}
		
	    String wholeAndDecimal(String n1) //For getting whole part and decimal part
	    {
	        c = new char[n1.length()]; //'c' declared above and converting string to char[]
            for(i=0; i<n1.length(); i++)
    		{
    		    c[i]=n1.charAt(i);
    		}
    		String whole=""; //For storing whole part
    		i=0; //Declared above
    		while(c[i]!='.') //Part before '.'
    		{
    		    whole += c[i];
    		    i++;
    		}
    		i++; //To get next character after '.'
    		int j=0; //For indexing of final1[]
    		final1 = new char[n1.length()-i];
    		while(i!=n1.length()) //Part after '.' stored in final1[] and can be viewed using display()
    		{
    		    final1[j]=c[i];
    		    i++;
    		    j++;
    		}
    		return whole;
	    }
	    
	    void display(){
	        System.out.print("DecimalArray:");
	        for(int i=0; i<final1.length; i++)
	            System.out.print(final1[i]+" ");
	        System.out.println();
	    }
}

public class Obj{ //Just made to show abstraction
    Functions f = new Functions();
    Scanner s = new Scanner(System.in);
    int anyinteger; //Input of integer value
	float mul;
	float num; //Stores decimal form of input fraction
	Obj(){
	    System.out.print("Enter integer to multiply:");
	    anyinteger = s.nextInt();
	}
	void show() //To perform above functionalities in one function
	{
	    num = f.decimalcon();
	    System.out.println("------------------Before multiplication------------------");
    	String n1 = String.valueOf(num);
    	String a = f.wholeAndDecimal(n1); //Returning whole part
    	f.display(); //Array before multiplication
    	System.out.println("------------------After multiplication------------------");
    	mul = anyinteger*num;
    	n1 = String.valueOf(mul);
    	a = f.wholeAndDecimal(n1); //Returning whole part
    	System.out.println("Whole Part:"+a);
    	f.display(); //Array after multiplication
	}
}
