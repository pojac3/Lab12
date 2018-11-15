import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Rectangle and extends Polygon.
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class Rectangle extends Polygon
{

    /**
     * Constructor for the Rectangle class
     * 
     * @param center Center point of the rectangle
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     * @param color Desired color for the rectangle
     * @param filled Whether or not the rectangle should be filled solid
     */
    public Rectangle(Point center, int width, int height, Color color, boolean filled)
    {
    	//sending the color and filled boolean to the superclass
    	super(color, filled);
    	
    	//Instantiating the location array
    	location = new Point[4];
    	
    	//the delta x and y
    	int deltaX = width / 2;
    	int deltaY = height / 2;
    	
    	//assembling the 4 points of the rectangle
    	location[0] = new Point(center.x - deltaX,center.y - deltaY);
    	location[1] = new Point(center.x + deltaX,center.y - deltaY);
    	location[2] = new Point(center.x + deltaX,center.y + deltaY);
    	location[3] = new Point(center.x - deltaX,center.y + deltaY);
    }
}