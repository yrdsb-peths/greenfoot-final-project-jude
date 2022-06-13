import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shoot extends Actor
{
    /**
     * Act - do whatever the Shoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        touch();// Add your action code here.
    }
    public void move()
    {
        setLocation(getX(),getY()-5);
    }
    public void touch()
        {
        
        Actor Flowers = getOneIntersectingObject(Flower.class);
        if (Flowers != null)
        {
            getWorld().removeObject(Flowers);
            getWorld().removeObject(this);
        }
    }
        
        
}
