import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        personaje1 personaje1 = new personaje1();
        addObject(personaje1,100,500);

        plataforma plataforma = new plataforma();
        addObject(plataforma,175,665);
        plataforma.setLocation(34,765);

        plataforma plataforma2 = new plataforma();
        addObject(plataforma2,175,665);
        plataforma2.setLocation(108,765); 

        plataforma plataforma3 = new plataforma();
        addObject(plataforma3,175,765);
        plataforma3.setLocation(182,765);

        plataforma plataforma4 = new plataforma();
        addObject(plataforma4,175,765);
        plataforma4.setLocation(256,765);

        plataforma plataforma5 = new plataforma();
        addObject(plataforma5,175,765);
        plataforma5.setLocation(330,765);

        plataforma plataforma6 = new plataforma();
        addObject(plataforma6,175,765);
        plataforma6.setLocation(404,765);

        plataforma plataforma7 = new plataforma();
        addObject(plataforma7,175,765);
        plataforma7.setLocation(478,765);

        plataforma plataforma8 = new plataforma();
        addObject(plataforma8,175,765);
        plataforma8.setLocation(552,765);

        plataforma plataforma9 = new plataforma();
        addObject(plataforma9,175,765);
        plataforma9.setLocation(626,765);

        plataforma plataforma10 = new plataforma();
        addObject(plataforma10,175,765);
        plataforma10.setLocation(700,765);

        plataforma plataforma11 = new plataforma();
        addObject(plataforma11,175,765);
        plataforma11.setLocation(774,765);

        plataforma plataforma12 = new plataforma();
        addObject(plataforma12,175,765);
        plataforma12.setLocation(848,765);

        plataforma plataforma13 = new plataforma();
        addObject(plataforma13,175,765);
        plataforma13.setLocation(922,765);

        plataforma plataforma14 = new plataforma();
        addObject(plataforma14,175,765);
        plataforma14.setLocation(996,765);

        plataforma plataforma15 = new plataforma();
        addObject(plataforma15,175,765);
        plataforma15.setLocation(1070,765);

        plataforma plataforma16 = new plataforma();
        addObject(plataforma16,175,765);
        plataforma16.setLocation(1144,765);

        plataforma plataforma17 = new plataforma();
        addObject(plataforma17,175,765);
        plataforma17.setLocation(1218,765);

        plataforma plataforma18 = new plataforma();
        addObject(plataforma18,175,765);
        plataforma18.setLocation(1292,765);

        plataforma plataforma19 = new plataforma();
        addObject(plataforma19,175,765);
        plataforma19.setLocation(1366,765);

        plataforma plataforma20 = new plataforma();
        addObject(plataforma20,175,765);
        plataforma20.setLocation(1440,765);

        plataforma plataforma21 = new plataforma();
        addObject(plataforma21,175,765);
        plataforma21.setLocation(1514,765);

        personaje1.setLocation(38,600);
        crearv(5);
    }

    public void crearv(int numero){
        for(int i = 0; i<numero;i++){
            virus1 v=new virus1();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(v,x,y);
        }
        
    }
}
