//8. Write a java program to implement method overloading
class eight{
	public static void main(String args[]){
		rectangle r1= new rectangle();
		rectangle r2= new rectangle();
		rectangle r3= new rectangle();
		r1.calarea(20,40);
		r2.calarea(20);
		r3.calarea(17.5);}}

class rectangle{
	int length,width,side;double radius;
	void calarea(int l, int w){
		length=l;
		width=w;
		System.out.println("Area of rectangle is:" +(length*width));}

	void calarea(int s){
		side=s;
		System.out.println("Area of square is :" +(side*side));}

	void calarea(double r){
		radius=r;
		System.out.println("Area of circle is:" +(3.14*radius*radius));}
}



