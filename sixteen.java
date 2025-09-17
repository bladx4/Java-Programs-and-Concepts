//16. Write a java program to implement final class and final method
/**
 * sixteen
 */
public class sixteen {

    public static void main(String[] args) {
        temp2 t= new temp2();
        t.fD();
        t.eD();

        temp4 t1= new temp4();
        t1.run();
    }
}

final class temp{
    void fD()
    {
        System.out.println("I am final");
    }
}

class temp2 extends temp{
    void eD()
    {
        System.out.println("I am inherited from final");
    }

}


class temp3
{
    final void run()
    {
        System.out.println("Final method");
    }
}

class temp4 extends temp3{
    void run()
    {
        System.out.println("Inherited Method");
    }
}