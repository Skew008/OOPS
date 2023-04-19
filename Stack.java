
package practical_1;

public class Stack {
    int size;
    int a[];
    int top;
    
    Stack(int size)
    {
        this.size=size;
        a=new int[this.size];
        top=-1;
    }
    
    int isEmpty(int top)
    {
        if(top==-1)
            return 0;
        return 1;
    }
    
    int isFull(int top)
    {
        if(top==size-1)
            return 0;
        return 1;
    }
    
    void push(int value)
    {
        if(isFull(top)==0)
            System.out.println("Stack Overflow.");
        else
        {
            top++;
            a[top]=value;
            System.out.println(a[top]+" was pushed to stack.");
        }
    }
    
    void pop()
    {
        if(isEmpty(top)==0)
                System.out.println("Stack Underflow.");
        else
        {
            System.out.println(a[top]+" was popped from top.");
            top--;
        }
    }
    
    void peek()
    {
        System.out.println(a[top]+" s at the top.");
    }
}
