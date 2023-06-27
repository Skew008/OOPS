package shreyansh.practical7;

public class MyArray<T> {
    int index;
    int prev = -1;
    int size;
    Object[] arr;
    Object[] temp;
    
    public MyArray(int s)
    {
        size = s;
        arr = new Object[size];
        index=size-1;
    }
    
    void add(T i)
    {
       if(index > prev)
       {
           arr[index] = i;
           index--;
       }
       else 
       {
           grow();
           arr[index] = i;
           index--;
       }
    }
    
    private void grow()
    {
        temp = arr;
        prev=size-1;
        size = (size*3)/2;
        index=size-1;
        arr = new Object[size];
        for(int i=0; i<=prev; i++){arr[i]=temp[i];}
    }
    
    void swap(int a, int b)
    {
        Object temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
    void display()
    {
        for(int i=0; i<size; i++)
        {
            T a = (T)arr[i];
            System.out.println(a);
        }
    }
}