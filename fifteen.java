//15. Write a java program to implement method overriding
class fifteen 
{
	public static void main(String args[])
	{
		SUB s = new SUB();
		s.display();
	}
}


class SUPER
{
	void display()
	{
		System.out.println("Super class");
	}
	
}

class SUB extends SUPER
{
	void display()
	{
		System.out.println("Sub class");
	}
}
