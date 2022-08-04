import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plataforma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plataforma extends Actor
{
    /**
     * Act - do whatever the plataforma wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public plataforma()
    {
        GreenfootImage myImage = getImage();
        int altura=(int) myImage.getHeight()/4;
        int ancho=(int) myImage.getWidth()/4;
        myImage.scale(ancho,altura);
    }
    public void act()
    {
        // Add your action code here.
    }
}
