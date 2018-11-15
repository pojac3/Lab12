import java.awt.Color;
import java.awt.Point;

/**
 * 
 * Abstract shape class that stores the location of the starting point, the color of the shape
 * and whether or not the shape is filled
 * 
 * @author Jacob Courtney
 * @version Nov 15, 2018
 */

public abstract class Shape implements Drawable
{
	//location of the starting point
	protected Point[] location;
	
	//color of the shape
	Color color;
	
	//whether or not the shape is filled
	boolean filled;
	
	/**
	 * constructor. sets the color and filled boolean
	 * @param color the color
	 * @param filled filled boolean
	 */
	public Shape(Color color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * gets the color
	 * @return the color
	 */
	public Color getColor()
	{
		return this.color;
	}
	
	/**
	 * whether or not the shape is filled
	 * @return the filled boolean
	 */
	public boolean isFilled()
	{
		return this.filled;
	}
	
	/**
	 * the location stored as an array
	 * @return the array with the location value
	 */
	public Point[] getLocation()
	{
		return this.location;
	}
}
