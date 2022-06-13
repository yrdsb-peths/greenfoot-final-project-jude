import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @Author Jude Kuo
 * @version June 2022
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        
        Bee a = new Bee();
        addObject(a, 300, 350);
        
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel,50, 50); 
        
        
        act();
        
    }
    public void gameOver()
    {
        Greenfoot.setWorld(new Gameover());
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    public void makeFlower()
    {
        addObject(new Flower(), Greenfoot.getRandomNumber(600), 0);
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(60)<1)
        {
            makeFlower();
        }
    }
}
