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
    
    private GreenfootSound backgroundMusic = new GreenfootSound("oggy-intro-made-with-Voicemod.mp3");
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    public void started() {
        // Play the background music when the scenario starts
        backgroundMusic.setVolume(20);
        backgroundMusic.playLoop(); 
    }
    
    public void stopped() {
        // Stop the background music when the scenario stops (e.g., when exiting)
        backgroundMusic.stop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cat cat = new Cat();
        addObject(cat,36,28);
        Worm worm = new Worm();
        addObject(worm,497,69);
        Worm worm2 = new Worm();
        addObject(worm2,225,277);
        Worm worm3 = new Worm();
        addObject(worm3,432,321);
        Worm worm4 = new Worm();
        addObject(worm4,74,179);
        worm4.setLocation(62,178);
        worm4.setLocation(69,178);
        Worm worm5 = new Worm();
        addObject(worm5,390,135);
        Worm worm6 = new Worm();
        addObject(worm6,86,349);
        Worm worm7 = new Worm();
        addObject(worm7,270,104);
        Worm worm8 = new Worm();
        addObject(worm8,540,231);
        Worm worm9 = new Worm();
        addObject(worm9,339,349);
        Worm worm10 = new Worm();
        addObject(worm10,150,31);
        Worm worm11 = new Worm();
        addObject(worm11,69,106);
        worm8.setLocation(708,276);
        worm3.setLocation(472,468);
        worm9.setLocation(292,422);
        worm2.setLocation(328,287);
        worm5.setLocation(631,154);
        worm.setLocation(666,54);
        worm11.setLocation(713,472);
        worm9.setLocation(171,510);
        worm6.setLocation(229,350);
        worm2.setLocation(434,212);
        worm4.setLocation(103,284);
        Worm worm12 = new Worm();
        addObject(worm12,501,52);
        Worm worm13 = new Worm();
        addObject(worm13,566,341);
        Worm worm14 = new Worm();
        addObject(worm14,321,518);
    }
}
