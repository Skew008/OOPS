package practical_1;

public class Practical_1 
{
    public static void main(String[] args) 
    {
        Stack s = new Stack(4);
        s.push(12);
        s.push(13);
        s.push(113);
        s.push(13);
        s.push(23);
        s.peek();
        s.pop();
        s.peek();
        System.out.println();
        Shape shape = new Shape();
        System.out.println("Volume of cube:"+shape.volume(10));
        System.out.println("Volume of cuboid:"+shape.volume(5,8,2));
        System.out.println("Volume of cylinder:"+shape.volume(10.00,4.50));
        System.out.println("Volume of sphere:"+shape.volume(10.00));
    }
}

