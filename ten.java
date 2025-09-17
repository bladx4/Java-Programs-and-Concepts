//10. Write a java program to implement constructors
class ten
{
	public static void main(String args[])
	{
		add a = new add(50,20);
		a.display();
	}
}


class add
{
	int n1,n2;
	
	add(int a, int b)
	{
		n1=a;
		n2=b;
	}
	
	void display()
	{
		System.out.println(n1+n2);
	}
}