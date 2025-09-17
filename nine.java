//9. Write a java program to implement classes
class nine 
{
	public static void main(String args[])
	{
		rectangle r1= new rectangle();
		r1.getdata();
		r1.showdata();	
	}
}

class rectangle
{
	int length,width;
	void getdata()
	{
		length=20;
		width=20;
	}
	
	void showdata()
	{
		System.out.println("Area of rectangle is :" +(length*width));
	}
}




