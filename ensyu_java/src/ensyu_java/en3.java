package ensyu_java;
import java.applet.Applet;
import java.awt.Graphics;

public class en3 extends Applet
{
	public void paint(Graphics g)
	{
		int x;
		for(x=0;x<=200;x=x+10){
			g.drawLine(0,0, x, 200-x);
		}
	}

}
