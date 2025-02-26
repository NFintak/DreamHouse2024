package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square grass;
    private Triangle driveway;
    private Square sky;
    private Square garage1;
    private Square garage2;
    //private Square garageDoor1;
    //private Square garageDoor2;
    private Triangle garageRoof;
    private Triangle roof;
    private Square wall;
    private Square wall2;
    //private Square door1;
    //private Square door2;
    private Square window1;
    private Square window1pane1;
    private Square window1pane2;
    private Square window1pane3;
    private Square window1pane4;
    private Square window2;
    private Square window2pane1;
    private Square window2pane2;
    private Square window2pane3;
    private Square window2pane4;
    private Triangle tree1;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        grass = new Square();
        grass.changeColor("green");
        grass.moveVertical(175);
        grass.moveHorizontal(-60);
        grass.changeSize(300);
        grass.makeVisible();

        driveway = new Triangle();
        driveway.changeColor("gray");
        driveway.moveVertical(105);
        driveway.moveHorizontal(25);
        driveway.changeSize(180, 120);
        driveway.makeVisible();

        sky = new Square();
        sky.changeColor("blue");
        sky.moveVertical(-125);
        sky.moveHorizontal(-60);
        sky.changeSize(300);
        sky.makeVisible();

        garageRoof = new Triangle();
        garageRoof.changeColor("dark gray");
        garageRoof.moveVertical(175);
        garageRoof.moveHorizontal(35);
        garageRoof.changeSize(-30,130);
        garageRoof.makeVisible();

        garage1 = new Square();
        garage1.moveVertical(115);
        garage1.moveHorizontal(20);
        garage1.changeSize(60);
        garage1.makeVisible();

        garage2 = new Square();
        garage2.moveVertical(115);
        garage2.moveHorizontal(-30);
        garage2.changeSize(60);
        garage2.makeVisible();

        roof = new Triangle();
        roof.changeColor("dark gray");
        roof.moveVertical(135);
        roof.moveHorizontal(135);
        roof.changeSize(-30, 155);
        roof.makeVisible();

        wall = new Square();
        wall.moveVertical(75);
        wall.moveHorizontal(60);
        wall.changeSize(100);
        wall.makeVisible();

        wall2 = new Square();
        wall2.moveVertical(75);
        wall2.moveHorizontal(90);
        wall2.changeSize(100);
        wall2.makeVisible();

        window1 = new Square();
        window1.changeColor("white");
        window1.moveVertical(85);
        window1.moveHorizontal(75);
        window1.makeVisible();

        window2 = new Square();
        window2.changeColor("white");
        window2.moveVertical(85);
        window2.moveHorizontal(145);
        window2.makeVisible();

        tree1 = new Triangle();
        tree1.changeSize(150, 25);
        tree1.moveVertical(70);
        tree1.moveHorizontal(210);
        tree1.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveVertical(-35);
        sun.moveHorizontal(225);
        sun.changeSize(30);
        sun.makeVisible();


    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window1.changeColor("white");
            tree1.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window1.changeColor("black");
            tree1.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
