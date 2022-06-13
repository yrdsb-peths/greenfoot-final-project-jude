import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @Author Jude Kuo
 * @version June 2022
 */
public class Bee extends Actor
{
    GreenfootSound lofi = new GreenfootSound("lofi.mp3");
    boolean space =true;
    GreenfootSound beeSound = new GreenfootSound("bee.mp3");
    GreenfootImage[] move = new GreenfootImage[6];
    public Bee()
    {
        for(int i = 0; i< move.length; i++)
        {
            
            move[i] = new GreenfootImage("images/tile00" + i +".png");
            move[i].scale(50,50);
        }
        setImage(move[0]);
    }
    int imageIndex=0;
    public void animateBee()
    {
        setImage(move[imageIndex]);
        imageIndex = (imageIndex + 1) % move.length;
    }
    public void act()
    {
        
        if(Greenfoot.isKeyDown("d"))
        {
            move(3);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(-3);
        }
        fire();
        nectar();
        animateBee();
    }
        public void nectar()
        {
            if(isTouching(Flower.class))
            {
                removeTouching(Flower.class);
                MyWorld world = (MyWorld) getWorld();
                world.increaseScore();
            }
            
            
        }
        public void fire()
    {
        if (Greenfoot.isKeyDown("space") && space == true)
        {
            getWorld().addObject(new Shoot(),getX(), getY()-23);
            space = false;
        }
        else if (!Greenfoot.isKeyDown("space"))
        {
            space = true;
        }
        if (1 == 1)
        {
            lofi.play();
        }
        
        

    }
    
}
