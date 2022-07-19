package ex0401;

public class Square {
	double height;
	double width;
	double a;
	
	public Square(double height,double width)
	{
		this.height = height;
		this.width = width;
	}
	
	public double getArea()
	{
		a = height * width;
		return a;
		
	}
	
	public void display()
	{
		System.out.println("四角形の面積: " + a);
		System.out.printf("縦 ＝%.1f　横　＝%.1f \n" ,height,width);
	}
}