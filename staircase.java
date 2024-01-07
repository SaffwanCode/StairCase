import Media.*;
import static java.lang.Math.*;


    public class staircase {
        private Turtle yertle;
        private TurtleDisplayer display;
        public staircase(){
            yertle = new Turtle (2);
            display = new TurtleDisplayer ();
            display.placeTurtle(yertle);
            
            yertle.penDown(); 
            
            
            for (int k = 4; k > 0; k--){
            for (int j = 0; j < k; j++){
            for (int i = 0; i < 4; i++){
                yertle.forward(40);
                yertle.right(PI/2);
            }
            yertle.left(PI/2);
            yertle.backward(40);
            yertle.right(PI/2);
        }
          
           yertle.left(PI/2);
           yertle.forward((40*k)-40);
           yertle.right(PI/2);
           yertle.forward(40);
       
    }
}
    }