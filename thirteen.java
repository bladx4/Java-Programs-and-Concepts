//13. Write a java program to implement multilevel inheritance
class thirteen{
	public static void main(String[] args) {
		result r = new result();
		r.getln();
		r.getw();
		r.showdata();
	}}

class recLength{
	 int length;
	 void getln(){
		length=10;
	 }}

class recWidth extends recLength{
	int width;
	void getw(){
	   width=20;
	}}

class result extends recWidth{
	void showdata(){
		System.out.println(length*width);
	}}
