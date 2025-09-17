//3. Write a java program to find factorial of a given number.
class three{
	
	public static void main(String args[]){
		int n=5;
		System.out.println(fact(n));
	}
	static int fact(int fact){
		if(fact==1 || fact==0){
			return 1;
		}else{
			return fact*fact(fact-1);
		}}
}
