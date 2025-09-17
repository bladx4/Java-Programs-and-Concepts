//11. Write a java program to implement constructor overloading
class eleven
{
	public static void main(String args[])
	{
		  calculate c1 = new calculate();
		  calculate c2 = new calculate();
		  c1.getdata(20,50);
		  c2.getdata(10.6);
		 
	}
}

class calculate 
{
	int length,width;
	double radius;
	
	void getdata(int l,int w)
	{
		length=l;
		width=w;
		System.out.println("Area of rectangle is:" +(length*width));
	}
	
	void getdata(double r)
	{
		radius=r;
		System.out.println("Area of circle is:" +(3.14*radius*radius));
	}
}