import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shoot here.
 * 
 * @Author Jude Kuo
 * @version June 2022
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
        touch();

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
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            getWorld().removeObject(Flowers);
            getWorld().removeObject(this);
 

        }
        }
    }

        
        

