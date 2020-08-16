/*
 *  ===============================================================================
 *  MovingSquare.java : A shape that is an SquarePattern.
 *  An SquarePattern has 4 handles shown when it is selected (by clicking on it).
 *  UPI:tzha842
 *  Name:Scarlett Zhang
 *  ===============================================================================
 */
import java.awt.*;
public class MovingSquarePattern extends MovingSquare {
	public MovingSquarePattern() {
		super(); 
	}

	public MovingSquarePattern(int x, int y, int s,int z,int mw, int mh, Color bc, Color fc, int pathType) {
		super(x ,y ,s,z,mw ,mh ,bc ,fc , pathType);
	}
	
	
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		if (width < height) {
			int[] x1 = {topLeft.x, topLeft.x, topLeft.x+width, topLeft.x+width,topLeft.x };
			int[] y1 = {topLeft.y, topLeft.y+width, topLeft.y+width, topLeft.y, topLeft.y};
			g.setColor(fillColor);
			g.drawPolygon(x1, y1, 4);
			int size = width/10;
			int numofsize = width/size;
			for(int n = 0; n<numofsize; n++) {
				int xpoint = topLeft.x + n * size;
				int ypoint = topLeft.y + n * size;
				g.setColor(fillColor);
				g.drawLine(xpoint, topLeft.y, topLeft.x+width, ypoint);
				g.setColor(fillColor);
				g.drawLine(topLeft.x, ypoint, xpoint, topLeft.y+width);
			}
		} else {
			int[] x1 = {topLeft.x, topLeft.x, topLeft.x+height, topLeft.x+height,topLeft.x };
			int[] y1 = {topLeft.y, topLeft.y+height, topLeft.y+height, topLeft.y, topLeft.y};
			g.setColor(fillColor);
			g.drawPolygon(x1, y1, 4);
			int size1 = height/10;
			int numofsize1 = height/size1;
			for(int n = 0; n<numofsize1; n++) {
				int x1point = topLeft.x + n * size1;
				int y1point = topLeft.y + n * size1;
				g.setColor(fillColor);
				g.drawLine(x1point, topLeft.y, topLeft.x+height, y1point);
				g.setColor(fillColor);
				g.drawLine(topLeft.x, y1point, x1point, topLeft.y+height);
			}
		}
		drawHandles(g);
	}
}