import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @Author Jude Kuo
 * @version June 2022
 */
public class Flower extends Actor
{
    public Flower()
    {
        turn(90);
    }
    public void act()
    {
        int x = getX();
        int y = getY() +2;
        setLocation(x, y);
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
