//7. Write a java program to implement string handling using StringBuffer class
class seven{
	public static void main(String args[])
	{
		StringBuffer sb= new StringBuffer("Hello");
		
		System.out.println(sb.append("World"));
		
		System.out.println(sb.insert(5,"-"));
		
		System.out.println(sb.delete(4,6));
		
		System.out.println(sb.replace(0,4,"Java"));
		
		sb.setCharAt(1,'s');
		System.out.println(sb);
		
		System.out.println(sb.reverse());
	
	}
}
