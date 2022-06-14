import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
* @Author Jude Kuo
 * @version June 2022
 */
public class Gameover extends World
{
    static int highScore = 0;

    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover(int score)
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        if(score>=highScore)
        {
            highScore = score;
        }
        Label gameOverLabel = new Label("Game Over", 70);
        addObject(gameOverLabel, 300 , 200);
        Label b = new Label("Space to try again", 50);
        addObject(b, 300 , 300);
        Label c = new Label("Score:" + score, 50);
        addObject(c, 300 , 100);
        Label d = new Label("High score:" + highScore, 50);
        addObject(d, 300 , 50);

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

