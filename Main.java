import java.util.*;
import java.io.*;
import java.util.logging.*;

public class Main {
private static final Logger logr = Logger.getLogger(Main.class.getName());
   public static Scanner console = new Scanner(System.in);
   public static Random rand = new Random();

    /**
    * The program as a whole should let the user play as the main character as
    * represented as:
    * 
    * <pre>
    *  {
    *    &#64;code
    *    Protag pc = new Protag();
    * }
    * </pre>
    * 
    * The new object of pc is now passable to different methods of the Main.java
    * class.
    * 
    * @throws InterruptedException Most likely is thrown when an outside command
    *                              from the users computer ends the
    *                              Thread.sleep(millis) method
    * @author Jaime Ramirez
    * 
    * @version 1.0 ---> 5/26/2020
    * @throws IOException
    * @see ath
    */
    public static void main(String[] args){
        try{
            
            } catch (Exception e){ 
               logr.log(Level.SEVERE, "There was an exception", e);
      
               try {
                  File f = new File("ErrorLog.txt");
                  if (f.exists()) {
                     FileWriter log = new FileWriter(f, true);
                     e.printStackTrace();
                     log.write("\n\nFile has encountered an exception: \n" + e.fillInStackTrace() );
                     log.close();
                  } else {
                     FileWriter log = new FileWriter(new File("ErrorLog.txt"));
                     log.write("File has encountered an exception: \n" + e);
                     log.close();
                  }
               } catch (Exception ex){
                  System.out.println("Something went wrong with the game. Now exiting.");
               }
            }
    }
}