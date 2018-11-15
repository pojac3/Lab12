import java.awt.Graphics;

/**
 * Interface that requires that Shapes have a Drawable() method
 * 
 * @author Jacob Courtney
 * @version Nov 15, 2018
 * 
 */

public interface Drawable
{
	//contract to create a drawable method
	public abstract void draw(Graphics g);
}
