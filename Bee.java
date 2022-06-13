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
    GreenfootImage[] moveRight = new GreenfootImage[6];
    GreenfootImage[] moveLeft = new GreenfootImage[6];
    
    String facing ="right";
    public Bee()
    {
        for(int i = 0; i< moveRight.length; i++)
        {
            
            moveRight[i] = new GreenfootImage("images/tile00" + i +"-removebg-preview.png");
            moveRight[i].scale(50,50);
        }

        for(int i = 0; i < moveLeft.length; i++)
        {
            
            moveLeft[i] = new GreenfootImage("images/tile00" + i +"-removebg-preview.png");
            moveLeft[i].mirrorHorizontally();
            moveLeft[i].scale(50,50);
            
        }
        
        
    }
    int imageIndex=0;
    public void animateBee()
    {
        if(facing.equals("right"))
        {
        setImage(moveRight[imageIndex]);
        imageIndex = (imageIndex + 1) % moveRight.length;
    }
    else
    {
        setImage(moveLeft[imageIndex]);
        imageIndex = (imageIndex + 1) % moveLeft.length;
    }
    }
    public void act()
    {
        
        if(Greenfoot.isKeyDown("d"))
        {
            move(4);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(-4);
            facing = "right";
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
