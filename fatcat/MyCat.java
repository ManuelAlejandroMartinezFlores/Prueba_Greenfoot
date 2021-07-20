import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        sleep(10);
        if (isSleepy() && isAlone()){
            sleep(10);
            setTired(false);
        }
        shoutHooray();
        if (isBored()){
            dance();
            setBored(false);
        }
        if (isHungry()){
            eat();
            setHungry(false);
        }
    }    
}
