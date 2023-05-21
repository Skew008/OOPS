package Q7;

public class Q7 {
    public static void main(String[] args) {
        Employee e1;
    }
    
}

interface PermanentManager{
    
}

class Director{
    
}

interface ConsultantManager{
    
}

class Manager extends Director implements ConsultantManager, PermanentManager{
    
} 

interface Consultant extends ConsultantManager{
    
}

interface PermanentEmployee extends PermanentManager{
    
}

interface TempEmployee extends Consultant{
    
}

class Employee extends Manager implements PermanentEmployee,TempEmployee{
    
}
