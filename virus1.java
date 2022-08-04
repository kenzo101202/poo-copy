import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class virus1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class virus1 extends Actor
{
    /**
     * Act - do whatever the virus1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public virus1(){
        getImage().scale(50,50);
    }
    int vida = 2;
    boolean daño = false;
    public void act()
    {
        // Add your action code here.
        hit();
        mv();
        
        
    }
    public void hit(){
        if(isTouching(bullet.class) && !daño){
            vida--;
            daño=true;
        }else if(!isTouching(bullet.class)){
            daño=false;
        }
        
        if (vida<=0){
            getWorld().removeObject(this);
        }
    }
    public void mv(){
        move(3);
        World m = getWorld();
        if (getX()>=m.getWidth()-5||getX()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        if (getY()>=m.getHeight()-5||getY()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
    }
}
