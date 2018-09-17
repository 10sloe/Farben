import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Skizze
{
  
    void draw(GraphicsContext gc){

        gc.setFill(Color.RED); //Füllfarbe setzen
        
        gc.fillRect(100,50,100,100); 
        
        gc.setFill(Color.BLUE); //Füllfarbe setzen
        
        gc.fillRect(150,200,100,50);

    }

}
