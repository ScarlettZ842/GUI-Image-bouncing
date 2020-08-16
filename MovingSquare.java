/*
 *  ===============================================================================
 *  MovingRectangle.java : A shape that is an Square.
 *  An Square has 4 handles shown when it is selected (by clicking on it).
 *  UPI:tzha842
 *  Name:Scarlett Zhang
 *  ===============================================================================
 */
import java.awt.*;
public class MovingSquare extends MovingRectangle {

	public MovingSquare() {
		super(); 
	}

	public MovingSquare(int x, int y, int s,int z, int mw, int mh, Color bc, Color fc, int pathType) {
		super(x ,y ,s,z, mw ,mh ,bc ,fc , pathType);
	}
	
	public void setWidth(int w) {
		super.setWidth(w);
		super.setHeight(w);
	}

	public void setHeight(int h) {
		super.setWidth(h);
		super.setHeight(h);
	}
	
	
}
