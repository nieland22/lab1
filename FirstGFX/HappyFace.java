/**
 * A class to draw a Happy Face using JavaFX
 * 
 * @source Textbook:Java An Introduction to Problem Solving & Programming, section 1.4
 *         modified by Radana Dvorak
 * 
 * ------------------------------
 * last updated:  Spring 2019
 * ------------------------------ 
 */
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.event.EventHandler; 
import javafx.stage.WindowEvent;


public class HappyFace extends Application
{
   public static void main(String[] args)
   {
     // launching the JavaFx program and the start method
     launch(args);
   }

   @Override
   public void start(Stage primaryStage) throws Exception
   {
    //set up a canvas on a scene to draw something - change the size
    //after the first run to see what happens - get use to pixel changes
    Group root = new Group();
    Scene scene = new Scene(root);

    Canvas canvas = new Canvas(400, 300);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    
            
    //draw a circle face - change the size
    gc.strokeOval(100, 50, 200, 200);
    
    //draw two eyes 
    gc.fillOval(155, 100, 10, 20);
    gc.fillOval(230, 100, 10, 20);
    
    //draw a mouth - see if you can make a sad face
    gc.strokeArc(150, 160, 100, 50, 180, 180, ArcType.OPEN);

    
    //setup an event and a handler for the close button. this will exit the application when the window is closed
    primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
    @Override
        public void handle(WindowEvent event) {
            System.exit(0);
        }
    });
      
    // set up the title and display the window
    root.getChildren().add(canvas);
    primaryStage.setTitle("HappyFace in JavaFX");//change title; play have fun!
    primaryStage.setScene(scene);
    primaryStage.show();
   }
}