//16. Write a java program to implement multiple inheritance
interface in1
{
    final int a =15;
    void display();
}

class testClass implements in1{
    public void display()
    {
        System.out.println("hello");
    }
    
}

class seventeen extends testClass
{
    public static void main(String[] args) {
        testClass t= new testClass();
        System.out.println(a);
        t.display();
    }
}