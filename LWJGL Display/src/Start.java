import org.lwjgl.opengl.Display;

import Display.DisplayManager;

public class Start {
	public static void main(String[] arsg){
		
		DisplayManager.createDisplay();
		
		while(!Display.isCloseRequested()){
			//game logic
			//render
			DisplayManager.updateDisplay();
		}
		
		DisplayManager.closeDisplay();
		
	}
}
