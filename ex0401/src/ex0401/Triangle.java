package ex0401;

public class Triangle {
	double height;
	double width;
	double a;
	
	public Triangle(double height,double width)
	{
		this.height = height;
		this.width = width;
	}
	
	public double getArea()
	{
		this.a = this.height * this.width / 2;
		return this.a;
		
	}
	
	public void display()
	{
		System.out.println("三角形の面積: " + a);
		System.out.printf("縦 ＝%.1f　横　＝%.1f \n" ,height,width);

	}
}
