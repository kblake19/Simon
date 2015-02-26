import lejos.nxt.Button;
import java.util.*;;
/*
 * 
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
        else {
            return false;
            System.exit(0);
        }
    }
    
    public void nextMove() {
        if(buttonPressed == input)
        	
    	    
    }
}
