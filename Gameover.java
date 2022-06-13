import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
* @Author Jude Kuo
 * @version June 2022
 */
public class Gameover extends World
{

    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300 , 200);
        Label b = new Label("Space to try again", 70);
        addObject(b, 300 , 300);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld a = new MyWorld();
            Greenfoot.setWorld(a);
        }
    }

}

