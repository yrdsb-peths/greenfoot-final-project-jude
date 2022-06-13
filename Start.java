import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @Author Jude Kuo
 * @version June 2022
 */
public class Start extends World
{
    Label titleLabel = new Label("Flower Shoot", 50);
    Label a = new Label("Press A to move left", 50);
    Label b = new Label("Press D to move right", 50);
    Label c = new Label("Press space to shoot",50);
    Label d = new Label("Press space to start", 50);
    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 300, 60);
        addObject(a,300, 100);
        addObject(b,300, 140);
        addObject(c,300, 180);
        addObject(d,300, 260);
        
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gWorld = new MyWorld();
            Greenfoot.setWorld(gWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

    }
}

