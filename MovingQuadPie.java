/*
 *  ===============================================================================
 *  MovingCircle.java : A shape that is an QuadPie.
 *  An oval/circle has 4 handles shown when it is selected (by clicking on it).
 *  UPI:tzha842
 *  Name:Scarlett Zhang
 *  ===============================================================================
 */
import java.awt.*;
import java.awt.geom.Arc2D;
import static java.awt.Color.blue;
import static java.awt.Color.orange;
import static java.awt.Color.white;
public class MovingQuadPie extends MovingOval {
	public MovingQuadPie() {
		super(); 
	}

	public MovingQuadPie(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pathType) {
		super(x ,y ,w ,h ,mw ,mh ,bc ,fc ,pathType);
	}
	
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}

	public void setHeight(int height) {
		super.setWidth(height);
		super.setHeight(height);
	}
	
	
	
	public void draw(Graphics g) { 
		Graphics2D g2d = (Graphics2D) g;
		if (width < height) {
			int xlen;
			int ylen;
			xlen = width/10;
			ylen = width/10;
			g.setColor(Color.orange);
			g.fillOval(topLeft.x, topLeft.y, width, width);
			g.setColor(Color.white);
			g.fillOval(topLeft.x+xlen, topLeft.y+ylen, width-xlen*2, width-ylen*2);
			g.setColor(Color.blue);
			g.fillArc(topLeft.x+xlen, topLeft.y+ylen, width-xlen*2, width-ylen*2, 0, 90);
			g.setColor(Color.blue);
			g.fillArc(topLeft.x+xlen, topLeft.y+ylen, width-xlen*2, width-ylen*2, 180, 90);
			
		
		} else {
			int x1len;
			int y1len;
			x1len = height/10;
			y1len = height/10;
			g.setColor(Color.orange);
			g.fillOval(topLeft.x, topLeft.y, height, height);
			g.setColor(Color.white);
			g.fillOval(topLeft.x+x1len, topLeft.y+y1len, height-x1len*2, height-y1len*2);
			g.setColor(Color.blue);
			g.fillArc(topLeft.x+x1len, topLeft.y+y1len, height-x1len*2, height-y1len*2, 0, 90);
			g.setColor(Color.blue);
			g.fillArc(topLeft.x+x1len, topLeft.y+y1len, height-x1len*2, height-y1len*2, 180, 90);
		}
		drawHandles(g);
	}
}
