//14. Write a java program to implement hierarchical inheritance
class fourteen {
    public static void main(String[] args) {   
        four f1= new four();
        f1.getdata();
        f1.multi();
        two tw= new two();
        tw.getdata();
        tw.add();
    }}

class one{
    int a,b;
    void  getdata(){
        a=20;
        b=10;
    }}

class two extends one{
    void add(){
        System.out.println("Addition of "+a+" and "+b+" is :" +(a+b));
    }}

class four extends one {
    void multi(){
        System.out.println("Multiplication of "+a+" and "+b+" is : " +(a*b));
        System.out.println();
    }}