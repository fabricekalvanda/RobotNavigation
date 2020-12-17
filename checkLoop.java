/*
  Fabrice Kalvanda
*/

import becker.robots.*;

public class checkLoop{
    public static void main(String[] args){

        City longIsland = new City(120, 20);

        new Wall(longIsland, 0, 1, Direction.NORTH);
        
        // declaring the counter
        int i = 0;
        int height = 14;
        
        while (i < height){
            new Wall(longIsland, i, 1, Direction.WEST);
            i++;
        }
        
        // resetting the counter
        i = 0;
        
        while(i < height){
            new Wall(longIsland, i, 1, Direction.EAST);
            i++;
        }
        
        // NOTICE that we didn't reset the counter. What is the value of i here?
        new Wall(longIsland, i, 1, Direction.WEST);
        new Wall(longIsland, i, 1, Direction.SOUTH);
        new Wall(longIsland, i, 2, Direction.SOUTH);
        
        // We are decrementing to build the wall
        while(i > 0){
            new Wall(longIsland, i, 2, Direction.EAST);    
            i--;
        }
        
        new Wall(longIsland, 0, 2, Direction.NORTH);


        Robot jerry = new Robot(longIsland, 0, 1, Direction.SOUTH);
        
        
        // Jerry should get out of Long Island
        // at each turn print out "Gotta get out!!"
        
        // Type in console "I'm free!!!" when Jerry gets out of Long Island
        while(jerry.frontIsClear())
         {
            jerry.move();
         }
            jerry.turnLeft();
            System.out.println("gotta get out!!!");
            jerry.move();
            jerry.turnLeft();
            System.out.println("gotta get out!!!");
        while(jerry.frontIsClear())
         {
            jerry.move();
         }
        while(jerry.getDirection() !=Direction.EAST)
         {
            jerry.turnLeft();
         }
            System.out.println("gotta get out!!!");   
            jerry.move();
            System.out.println("I'm free");   
     }
}

