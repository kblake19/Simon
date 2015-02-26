import lejos.nxt.Button;
import java.util.*;
/*
 * @author Kellen Lake
 * @id kblake
 * @course CSIS 252 - Programming II
 * @project Simon Lab
 * @related Simon.java
 *	This class is the Simon class that will handle
 *  methods that continue that game and the main 
 *  method which will run the game
 */
public class Simon {
    private Object[] moves;
    static private boolean done;
    private Button buttonPressed;
    
    public static void main(String[] args) {
    	done = false;
        
        
    }
    
    public boolean isCorrect(Object input) {
        if(buttonPressed == input)
            return true;
        else
            return false;
    }
    
    public void endSequence() {
    	
    }
    
    public void displaySequence() {
        System.out.print(moves);
    }
}
