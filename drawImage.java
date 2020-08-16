/*
 *  ===============================================================================
 *  Movingrectangle.java : A shape that is an polygon.
 *  An polygon has 4 handles shown when it is selected (by clicking on it).
 *  UPI:tzha842
 *  Name:Scarlett Zhang
 *  ===============================================================================
 */
import java.awt.*;
public class drawImage extends MovingShape {

    public drawImage(){
        super();
    }

    public drawImage(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pt){
        super(x, y, w ,h, mw, mh, bc, fc, pt);
    }

    public void draw(Graphics g){
        int xsize;
        int ysize;
        xsize = width / 8;
        ysize = height / 8;
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.red);
        g.fillArc(topLeft.x, topLeft.y, width, height, 0, 180);
        g.setColor(Color.black);
        g.fillArc(topLeft.x, topLeft.y, width, height, 180, 180);
        g.setColor(Color.white);
        int x[]={topLeft.x+width/2,topLeft.x,topLeft.x+width};
        int y[]={topLeft.y,topLeft.y+height,topLeft.y+height};
        g.fillPolygon(x,y,3);
        
        
        
        g.setColor(Color.orange);
        g.fillArc(topLeft.x + xsize/2, topLeft.y + ysize/2, width - xsize, height - ysize, 0, 180);
        g.setColor(Color.pink);
        g.fillArc(topLeft.x + xsize/2, topLeft.y + ysize/2, width - xsize, height - ysize, 180, 180);
        g.setColor(Color.black);
        int x1[]={topLeft.x+width/2,topLeft.x+xsize/2,topLeft.x+width-xsize/2};
        int y1[]={topLeft.y+ysize/2,topLeft.y+height-ysize/2,topLeft.y+height-ysize/2};
        g.fillPolygon(x1,y1,3);
        
        g.setColor(Color.yellow);
        g.fillArc(topLeft.x + xsize, topLeft.y + ysize, width - xsize *2, height - ysize *2, 0, 180);
        g.setColor(Color.blue);
        g.fillArc(topLeft.x + xsize, topLeft.y + ysize, width - xsize *2, height - ysize *2, 180, 180);
        g.setColor(Color.pink);
        int x2[]={topLeft.x+width/2,topLeft.x+xsize,topLeft.x+width-xsize};
        int y2[]={topLeft.y+ysize,topLeft.y+height-ysize,topLeft.y+height-ysize};
        g.fillPolygon(x2,y2,3);
        
        g.setColor(Color.green);
        g.fillArc(topLeft.x + xsize *3/2, topLeft.y + ysize * 3/2, width - xsize *3, height - ysize *3, 0, 180);
        g.setColor(Color.cyan);
        g.fillArc(topLeft.x + xsize *3/2, topLeft.y + ysize * 3/2, width - xsize *3, height - ysize *3, 180, 180);
        g.setColor(Color.blue);
        int x3[]={topLeft.x+width/2,topLeft.x+ xsize *3/2,topLeft.x+width-xsize *3/2};
        int y3[]={topLeft.y+ ysize * 3/2,topLeft.y+height- ysize * 3/2,topLeft.y+height- ysize * 3/2};
        g.fillPolygon(x3,y3,3);
        
        g.setColor(Color.cyan);
        g.fillArc(topLeft.x + xsize *2, topLeft.y + ysize * 2, width - xsize *4, height - ysize *4, 0, 180);
        g.setColor(Color.green);
        g.fillArc(topLeft.x + xsize *2, topLeft.y + ysize * 2, width - xsize *4, height - ysize *4, 180, 180);
        g.setColor(Color.gray);
        int x4[]={topLeft.x+width/2,topLeft.x+ xsize *2,topLeft.x+width-xsize*2};
        int y4[]={topLeft.y+ ysize * 2,topLeft.y+height- ysize * 2,topLeft.y+height- ysize * 2};
        g.fillPolygon(x4,y4,3);
        
        g.setColor(Color.blue);
        g.fillArc(topLeft.x + xsize *5/2, topLeft.y + ysize * 5/2, width - xsize *5, height - ysize *5, 0, 180);
        g.setColor(Color.yellow);
        g.fillArc(topLeft.x + xsize *5/2, topLeft.y + ysize * 5/2, width - xsize *5, height - ysize *5, 180, 180);
        g.setColor(Color.magenta);
        int x5[]={topLeft.x+width/2,topLeft.x+ xsize *5/2,topLeft.x+width-xsize*5/2,};
        int y5[]={topLeft.y+ ysize*5/2,topLeft.y+height- ysize * 5/2,topLeft.y+height- ysize*5/2};
        g.fillPolygon(x5,y5,3);
        
        g.setColor(Color.pink);
        g.fillArc(topLeft.x + xsize *3, topLeft.y + ysize * 3, width - xsize *6, height - ysize *6, 0, 180);
        g.setColor(Color.green);
        g.fillArc(topLeft.x + xsize *3, topLeft.y + ysize * 3, width - xsize *6, height - ysize *6, 180, 180);
        g.setColor(Color.cyan);
        int x6[]={topLeft.x+width/2,topLeft.x+ xsize *3,topLeft.x+width-xsize*3};
        int y6[]={topLeft.y+ ysize * 3,topLeft.y+height- ysize * 3,topLeft.y+height- ysize * 3};
        g.fillPolygon(x6,y6,3);
        
        g.setColor(Color.black);
        g.fillArc(topLeft.x + xsize *7/2, topLeft.y + ysize * 7/2, width - xsize *7, height - ysize *7, 0, 180);
        g.setColor(Color.red);
        g.fillArc(topLeft.x + xsize *7/2, topLeft.y + ysize * 7/2, width - xsize *7, height - ysize *7, 180, 180);
        g.setColor(Color.white);
        int x7[]={topLeft.x+width/2,topLeft.x+ xsize *7/2,topLeft.x+width-xsize*7/2};
        int y7[]={topLeft.y+ ysize * 7/2,topLeft.y+height- ysize *7/ 2,topLeft.y+height- ysize *7/ 2};
        g.fillPolygon(x7,y7,3);
        
        drawHandles(g);

    }

    public boolean contains(Point mousePt){
        double dx;
        double dy;
        Point EndPt = new Point(topLeft.x + width, topLeft.y + height);
        dx = (2 * mousePt.x - topLeft.x - EndPt.x) / (double) width;
        dy = (2* mousePt.y - topLeft.y - EndPt.y) / (double) height;
        return dx * dx + dy * dy < 1.0;
    }

}