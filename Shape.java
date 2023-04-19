package practical_1;

public class Shape {
    int volume(int a)
    {
        return a*a*a;
    }
    int volume(int l,int b, int h)
    {
        return l*b*h;
    }
    double volume(double r)
    {
        return (4*Math.PI*r*r*r)/3;
    }
    double volume(double r, double h)
    {
        return Math.PI*r*r*h;
    }
}
