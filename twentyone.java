public class twentyone extends Thread {
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"-count:"+i);
            if(i==2)
            {
                try{
                    Thread.sleep(3000);
                }
                catch(InterruptedException e)
                {
                    System.out.println("Thread interrupted:"+e.getMessage());
                }
            }}

            Thread.yield();
        }
    


    public static void main(String[] args) {
        twentyone t1= new twentyone();
        twentyone t2= new twentyone();
        t1.start(); 
        t2.start();

        try{
            Thread.sleep(5000);
            t1.interrupt();
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread:"+e.getMessage());
        }
    }
}
