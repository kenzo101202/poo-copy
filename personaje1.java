import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class personaje1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class personaje1 extends Actor
{
    /**
     * Act - do whatever the personaje1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public personaje1()
    {
        GreenfootImage myImage = getImage();
        int altura=(int) myImage.getHeight()/2;
        int ancho=(int) myImage.getWidth()/2;
        myImage.scale(ancho,altura);
    }
    int vspeed = 0;
    int accel = 0;
    int speed = 5;
    
    int vp = 1;
    boolean dañop = false;
    
    public void act()
    {
       
       checkFalling();
       fall();
       jump();
       move();
       shoot();
       hitbyvirus();
       
    }
    public void move(){
        if (Greenfoot.isKeyDown("d")){
            setLocation(getX() + speed, getY());
        } else if (Greenfoot.isKeyDown("a")){
            setLocation(getX() - speed, getY());
        }
    }
    public void fall()
    {
        setLocation(getX(), getY() + vspeed);

    }
    public void checkFalling()
    {
        if(!isTouching(plataforma.class)){
            vspeed++;
        }
        else if(isTouching(plataforma.class)){
            setLocation(getX(),getY() - 1);
            vspeed = 0;
        }
                
    }
    public void jump(){
        if (Greenfoot.isKeyDown("space")){
            vspeed=-10;
        }
        
    }
    public void shoot(){
        if(Greenfoot.mousePressed(null)){
            bullet bullet = new bullet();
            getWorld().addObject(bullet, getX(), getY());
            bullet.turnTowards(Greenfoot.getMouseInfo().getX(),Greenfoot.getMouseInfo().getY());
            
        }
    }
    public void hitbyvirus(){
        if(isTouching(virus1.class) && !dañop){
            vp--;
            dañop=true;
        }else if(!isTouching(virus1.class)){
            dañop=false;
        }
        
        if (vp<=0){
            getWorld().removeObject(this);
        }
    }
}
