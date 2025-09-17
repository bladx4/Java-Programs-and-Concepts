//19. Write a java program to implement Interface
interface circle{
    double pi=3.14;
    double r =4;
}

class Derived implements circle{
    public void area()
    {
        System.out.println("Area:"+(pi*r*r));
    }
}

class nineteen
{
    public static void main(String[] args) {
        Derived d = new Derived();
        d.area();
    }
}