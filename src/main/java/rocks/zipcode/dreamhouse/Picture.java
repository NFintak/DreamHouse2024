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
    private Triangle garageroof;
    private Square garage1;
    private Square garage2;
    private Square garagedoor1;
    private Square garagedoor2;
    private Circle carpanel1;
    private Circle carpanel2;
    private Circle carpanel3;
    private Circle carpanel4;
    private Triangle carpanel5;
    private Triangle carpanel6;
    private Square carpanel7;
    private Square carpanel8;
    private Triangle carwindow1;
    private Square carwindow2;
    private Triangle carwindow3;
    private Triangle roof1;
    private Triangle roofpanel1;
    private Square roofpanel2;
    private Square roofpanel3;
    private Triangle roofpanel4;
    private Square wall;
    private Square wall2;
    private Square door1;
    private Square door2;
    private Circle doorknob;
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
    private Square longwindow1;
    private Square longwindow2;
    private Square longpane1;
    private Square longpane2;
    private Square longpane3;
    private Square longpane4;
    private Square longpane5;
    private Square longpane6;
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

        garageroof = new Triangle();
        garageroof.changeColor("dark gray");
        garageroof.moveVertical(175);
        garageroof.moveHorizontal(35);
        garageroof.changeSize(-30,130);
        garageroof.makeVisible();

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

        garagedoor1 = new Square();
        garagedoor1.changeColor("light gray");
        garagedoor1.moveVertical(130);
        garagedoor1.moveHorizontal(-20);
        garagedoor1.changeSize(45);
        garagedoor1.makeVisible();

        garagedoor2 = new Square();
        garagedoor2.changeColor("light gray");
        garagedoor2.moveVertical(130);
        garagedoor2.moveHorizontal(5);
        garagedoor2.changeSize(45);
        garagedoor2.makeVisible();

        carpanel1 = new Circle();
        carpanel1.changeColor("blue");
        carpanel1.moveVertical(150);
        carpanel1.moveHorizontal(30);
        carpanel1.makeVisible();

        carpanel2 = new Circle();
        carpanel2.changeColor("blue");
        carpanel2.moveVertical(150);
        carpanel2.moveHorizontal(50);
        carpanel2.makeVisible();

        carpanel3 = new Circle();
        carpanel3.changeColor("blue");
        carpanel3.moveVertical(190);
        carpanel3.moveHorizontal(20);
        carpanel3.makeVisible();

        carpanel4 = new Circle();
        carpanel4.changeColor("blue");
        carpanel4.moveVertical(190);
        carpanel4.moveHorizontal(60);
        carpanel4.makeVisible();

        carpanel5 = new Triangle();
        carpanel5.changeColor("blue");
        carpanel5.moveVertical(210);
        carpanel5.changeSize(35, 20);
        carpanel5.makeVisible();

        carpanel6 = new Triangle();
        carpanel6.changeColor("blue");
        carpanel6.moveVertical(210);
        carpanel6.moveHorizontal(49);
        carpanel6.changeSize(35, 20);
        carpanel6.makeVisible();

        carpanel7 = new Square();
        carpanel7.changeColor("blue");
        carpanel7.moveVertical(184);
        carpanel7.moveHorizontal(-10);
        carpanel7.changeSize(46);
        carpanel7.makeVisible();

        carpanel8 = new Square();
        carpanel8.changeColor("blue");
        carpanel8.moveVertical(160);
        carpanel8.makeVisible();

        roof1 = new Triangle();
        roof1.changeColor("dark gray");
        roof1.moveVertical(135);
        roof1.moveHorizontal(135);
        roof1.changeSize(-30, 155);
        roof1.makeVisible();

        roofpanel1 = new Triangle();
        roofpanel1.changeColor("gray");
        roofpanel1.moveVertical(55);
        roofpanel1.moveHorizontal(90);
        roofpanel1.changeSize(50, 60);
        roofpanel1.makeVisible();

        roofpanel2 = new Square();
        roofpanel2.changeColor("gray");
        roofpanel2.moveVertical(20);
        roofpanel2.moveHorizontal(80);
        roofpanel2.changeSize(50);
        roofpanel2.makeVisible();

        roofpanel3 = new Square();
        roofpanel3.changeColor("gray");
        roofpanel3.moveVertical(20);
        roofpanel3.moveHorizontal(120);
        roofpanel3.changeSize(50);
        roofpanel3.makeVisible();

        roofpanel4 = new Triangle();
        roofpanel4.changeColor("gray");
        roofpanel4.moveVertical(55);
        roofpanel4.moveHorizontal(180);
        roofpanel4.changeSize(50, 60);
        roofpanel4.makeVisible();

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

        door1 = new Square();
        door1.changeColor("dark gray");
        door1.moveVertical(145);
        door1.moveHorizontal(145);
        door1.makeVisible();

        door2 = new Square();
        door2.changeColor("dark gray");
        door2.moveVertical(130);
        door2.moveHorizontal(145);
        door2.makeVisible();

        doorknob = new Circle();
        doorknob.changeColor("yellow");
        doorknob.moveVertical(140);
        doorknob.moveHorizontal(190);
        doorknob.changeSize(5);
        doorknob.makeVisible();

        window1 = new Square();
        window1.changeColor("white");
        window1.moveVertical(85);
        window1.moveHorizontal(75);
        window1.makeVisible();

        window1pane1 = new Square();
        window1pane1.changeColor("light gray");
        window1pane1.moveVertical(85);
        window1pane1.moveHorizontal(75);
        window1pane1.changeSize(13);
        window1pane1.makeVisible();

        window1pane2 = new Square();
        window1pane2.changeColor("light gray");
        window1pane2.moveVertical(85);
        window1pane2.moveHorizontal(92);
        window1pane2.changeSize(13);
        window1pane2.makeVisible();

        window1pane3 = new Square();
        window1pane3.changeColor("light gray");
        window1pane3.moveVertical(102);
        window1pane3.moveHorizontal(75);
        window1pane3.changeSize(13);
        window1pane3.makeVisible();

        window1pane4 = new Square();
        window1pane4.changeColor("light gray");
        window1pane4.moveVertical(102);
        window1pane4.moveHorizontal(92);
        window1pane4.changeSize(13);
        window1pane4.makeVisible();

        window2 = new Square();
        window2.changeColor("white");
        window2.moveVertical(85);
        window2.moveHorizontal(145);
        window2.makeVisible();

        window2pane1 = new Square();
        window2pane1.changeColor("light gray");
        window2pane1.moveVertical(85);
        window2pane1.moveHorizontal(145);
        window2pane1.changeSize(13);
        window2pane1.makeVisible();

        window2pane2 = new Square();
        window2pane2.changeColor("light gray");
        window2pane2.moveVertical(85);
        window2pane2.moveHorizontal(162);
        window2pane2.changeSize(13);
        window2pane2.makeVisible();

        window2pane3 = new Square();
        window2pane3.changeColor("light gray");
        window2pane3.moveVertical(102);
        window2pane3.moveHorizontal(145);
        window2pane3.changeSize(13);
        window2pane3.makeVisible();

        window2pane4 = new Square();
        window2pane4.changeColor("light gray");
        window2pane4.moveVertical(102);
        window2pane4.moveHorizontal(162);
        window2pane4.changeSize(13);
        window2pane4.makeVisible();

        longwindow1 = new Square();
        longwindow1.changeColor("white");
        longwindow1.moveVertical(130);
        longwindow1.moveHorizontal(75);
        longwindow1.makeVisible();

        longwindow2 = new Square();
        longwindow2.changeColor("white");
        longwindow2.moveVertical(130);
        longwindow2.moveHorizontal(92);
        longwindow2.makeVisible();

        longpane1 = new Square();
        longpane1.changeColor("light gray");
        longpane1.moveVertical(130);
        longpane1.moveHorizontal(75);
        longpane1.changeSize(13);
        longpane1.makeVisible();

        longpane2 = new Square();
        longpane2.changeColor("light gray");
        longpane2.moveVertical(130);
        longpane2.moveHorizontal(92);
        longpane2.changeSize(13);
        longpane2.makeVisible();

        longpane3 = new Square();
        longpane3.changeColor("light gray");
        longpane3.moveVertical(130);
        longpane3.moveHorizontal(109);
        longpane3.changeSize(13);
        longpane3.makeVisible();

        longpane4 = new Square();
        longpane4.changeColor("light gray");
        longpane4.moveVertical(147);
        longpane4.moveHorizontal(75);
        longpane4.changeSize(13);
        longpane4.makeVisible();

        longpane5 = new Square();
        longpane5.changeColor("light gray");
        longpane5.moveVertical(147);
        longpane5.moveHorizontal(92);
        longpane5.changeSize(13);
        longpane5.makeVisible();

        longpane6 = new Square();
        longpane6.changeColor("light gray");
        longpane6.moveVertical(147);
        longpane6.moveHorizontal(109);
        longpane6.changeSize(13);
        longpane6.makeVisible();

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
