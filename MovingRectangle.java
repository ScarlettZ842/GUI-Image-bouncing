/*
 *  ===============================================================================
 *  MovingRectangle.java : A shape that is an rectangle.
 *  An Rectangle has 4 handles shown when it is selected (by clicking on it).
 *  UPI:tzha842
 *  Name:Scarlett Zhang
 *  ===============================================================================
 */
import java.awt.*;
public class MovingRectangle extends MovingShape {

	/** constructor to create an oval with default values
	 */
	public MovingRectangle() {
		super();
	}

	/** constructor to create an oval shape
	 */
	public MovingRectangle(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pathType) {
		super(x ,y ,w ,h ,mw ,mh ,bc ,fc , pathType);
	}

	/** draw the oval with the fill colour
	 *  If it is selected, draw the handles
	 *  @param g	the Graphics control
	 */
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g.setColor(fillColor);
		g.fillRect(topLeft.x, topLeft.y, width, height);
		g.setColor(borderColor);
		g.drawRect(topLeft.x, topLeft.y, width, height);
		drawHandles(g);
	}

	/** Returns whether the point is in the oval or not
	 * @return true if and only if the point is in the oval, false otherwise.
	 */
	public boolean contains(Point mousePt) {
		return ((mousePt.x >= topLeft.x) && (mousePt.x <=topLeft.x +width+1)
	               && (mousePt.y >= topLeft.y) && (mousePt.y <=topLeft.y +height+1));


	}
}