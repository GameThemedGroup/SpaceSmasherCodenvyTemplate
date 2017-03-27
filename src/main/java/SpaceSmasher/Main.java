package SpaceSmasher;
import Engine.GameWindow;
import SpaceSmasher.SpaceSmasher;

@SuppressWarnings("serial")
public class Main
{
  

  public static void main(String[] args)throws Exception
  {
	   SpaceSmasher.SetShowFlashScreen(false);  
	  		// switch off the initial showing of Flash Screen
	  		// quicker debugging cycle: advised for during debugging
	  
	  (new Run()).startProgram();
    
  }
}
