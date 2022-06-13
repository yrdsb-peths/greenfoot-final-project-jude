import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    GreenfootSound beeSound = new GreenfootSound("bee.mp3");
    public void act()
    {
        
        if(Greenfoot.isKeyDown("d"))
        {
            move(6);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(-6);
        }
        fire();
        nectar();
        
    }
        public void nectar()
        {
            if(isTouching(Flower.class))
            {
                removeTouching(Flower.class);
                MyWorld world = (MyWorld) getWorld();
                world.makeFlower();
                world.increaseScore();
                beeSound.play();
            }
            
            
        }
        public void fire()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new Shoot(),getX(), getY()-23);
        }
    }
    
}
