package ex0402;

public class Triangle extends shape{
	
	double a;
	
	public Triangle(double height,double width)
	{
		this.height = height;
		this.width = width;
	}
	
	public double getArea()
	{
		a =height * width / 2;
		return a;	
	}
	
	public void display()
	{
		System.out.println("三角形の面積: " + a);
		System.out.printf("縦 ＝%.1f　横　＝%.1f \n" ,height,width);
	}

}
