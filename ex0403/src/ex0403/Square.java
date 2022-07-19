package ex0403;

public class Square extends Shape{
	
	double a;
	double height;
	double width;
	
	public Square(double height,double width)
	{
		this.height = height;
		this.width = width;
	}
	
	public double getArea()
	{
		a =height * width;
		return a;	
	}
	
	public void display()
	{
		System.out.println("四角形の面積: " + a);
		System.out.printf("縦 ＝%.1f　横　＝%.1f \n" ,height,width);
	}

}
