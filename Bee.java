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
            turn(3);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            move(2);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            move(-1);
        }
        move(1);
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
    
}
