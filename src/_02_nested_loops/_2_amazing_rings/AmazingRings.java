package _02_nested_loops._2_amazing_rings;

import processing.core.PApplet;
import processing.core.PImage;

/*
 * Goal: Create a pair of Amazing Rings!
 * 
 * 1. Open the demonstration for this recipe by opening the Recipe.html
 *    file in this folder.
 * 
 * In the setup() method:
 * 2. Set the size of your window to be a rectangle like in the recipe
 *    demonstration
 * 3. Call the noFill() command so all the ellipses will be transparent
 *
 * In the draw() method:
 * 4. Use a for loop to make the first set of rings that will start in the
 *    left half of the window (you can use your code from Bullseye).
 * 
 * 5. Make this set of rings move across the sketch to the right
 *    Hint: make two variables, one for x and another for the speed.
 *    Then increase x by the amount in speed.
 *
 * 6. When the rings reach the right side of the sketch, reverse the direction
 *    so they move
 *    Hint: speed = -speed
      
 * 7. When the rings reach the left side of the sketch, reverse the direction
 *    again.
 * 
 * CHALLENGE - to finish the Amazing Rings
 * 8. Add another for loop to draw the second set of rings that will start in
 *    the right half of the window
 *
 * 9. Make this set of rings move in the opposite direction to the other rings
 *    These rings must also "bounce" off the sides of the window.
 */
public class AmazingRings extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    PImage waldo;
    int x=0;
    int x2=1000;
	int speed=5;
	int speed2 = -5;
    @Override
    public void settings() {
    	size(1000,1000);
    }

    @Override
    public void setup() {
    	noFill();
    }

    @Override
    public void draw() {
    	if (x>=1000) {
    		speed = -5;
    	}
    	else if (x<=0) {
    		speed = 5;
    	}
    	background(255,255,255);
    	int size = 625;;

    	  noFill();
    	  for (int i = 0; i <= 100; i+=1) {
    	  
    	  ellipse(x,500,size,size);
    	  size -= 6;
    	  }
    	  if (x2<=0) {
      		speed2 = 5;
      	}
      	else if (x2>=1000) {
      		speed2 = -5;
      	}
size = 625;  	 
x = x + speed;
for (int i = 0; i <= 100; i+=1) {
	  
	  ellipse(x2,500,size,size);
	  size -= 6;
	  }
x2 = x2 + speed2;
    }
    

    static public void main(String[] args) {
        PApplet.main(AmazingRings.class.getName());
    }
}