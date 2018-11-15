
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.ORANGE, true);
        
        // Ears:
        RightTriangle leftEar = new RightTriangle(new Point(300,200),60,-175,Color.ORANGE,true);
        RightTriangle rightEar = new RightTriangle(new Point(500,200),-60,-175,Color.ORANGE,true);
        RightTriangle leftEarInside = new RightTriangle(new Point(305,175),30,-125,Color.RED,true);
        RightTriangle rightEarInside = new RightTriangle(new Point(495,175),-30,-125,Color.RED,true);
        
        // Eyes:
        Oval insideLeftEye = new Oval(new Point(300,250),20,40,Color.BLACK,true);
        Oval insideRightEye = new Oval(new Point(500,250),20,40,Color.BLACK,true);
        Oval outsideLeftEye = new Oval(new Point(300,250),25,45,Color.WHITE,true);
        Oval outsideRightEye = new Oval(new Point(500,250),25,45,Color.WHITE,true);
        
        // Nose and Whiskers:
        Circle nose = new Circle(new Point(400, 300),50,Color.BLACK,true);
        PolyLine leftSideOfMouth = new PolyLine(new Point(350,350),new Point(400,325),60,Color.BLACK,true);
        PolyLine rightSideOfMouth = new PolyLine(new Point(400,325),new Point(450,350),60,Color.BLACK,true);
        //No Whiskers in the sample picture?
        
        
        // Collar:
        Oval collar = new Oval(new Point(400,500),350,20,Color.GREEN,true);
        Circle collarFilledRing = new Circle(new Point(400,500),50,Color.GRAY,true);
        Circle collarEmptyRing = new Circle(new Point(400,500),40,Color.WHITE,false);
        
        // Square around the dog:
        Square square = new Square(new Point(400,275),500,Color.BLUE,false);

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(leftEar);
        drawPanel.addShape(rightEar);
        drawPanel.addShape(leftEarInside);
        drawPanel.addShape(rightEarInside);
        drawPanel.addShape(outsideLeftEye);
        drawPanel.addShape(outsideRightEye);
        drawPanel.addShape(insideLeftEye);
        drawPanel.addShape(insideRightEye);
        drawPanel.addShape(nose);
        drawPanel.addShape(leftSideOfMouth);
        drawPanel.addShape(rightSideOfMouth);
        drawPanel.addShape(collar);
        drawPanel.addShape(collarFilledRing);
        drawPanel.addShape(collarEmptyRing);
        drawPanel.addShape(square);
        
        // set background color
        drawPanel.setBackground(Color.YELLOW);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
