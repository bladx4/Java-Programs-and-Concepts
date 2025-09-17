//7. Write a java program to implement single level inheritance
class tweleve{
	public static void main(String[] args) {
		recWidth r = new recWidth();
		r.getdata();
		r.showdata();
	}}

class recLength{
	 int length,width;
	 void getdata(){
		length=10;
		width=20;
	 }}

class recWidth extends recLength{
	void showdata(){
		System.out.println(length*width);
	}}
