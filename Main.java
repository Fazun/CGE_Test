package core;
import org.lwjgl.LWJGLException;
import org.lwjgl.openal.AL;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Main 
{
	public static void main(String[] argv) 
	{
		float relVersion = 0.67f;
		String strVersion = Float.toString(relVersion);
		System.out.println("Creating display ...");
		try 
		{
			Display.setDisplayMode(new DisplayMode(1440,900));
			Display.setLocation((Display.getDesktopDisplayMode().getWidth() - 1440) / 2, (Display.getDesktopDisplayMode().getHeight() - 1000) / 2);
			//DisplayMode desktopDisplay = Display.getDesktopDisplayMode();
			//Display.setDisplayModeAndFullscreen(desktopDisplay);
			Display.create();
			Display.setTitle("Casual Galaxy Explorer " + strVersion + ", detected Java " + System.getProperty("java.version") + " / Display Version: " + Display.getVersion());
		} 
		catch (LWJGLException e) 
		{
			e.printStackTrace();
			System.exit(0);
		}   	

		System.out.println("Cleaning up memory ...");
		System.gc();
		
		System.out.println("Creating CGE Instance, Version " + strVersion + " ...");
		CasualGalaxyExplorer CasualGalaxyExplorer = new CasualGalaxyExplorer(relVersion);
		System.out.println("Running CGE Instance ...");
		CasualGalaxyExplorer.Run();
		
		System.out.println("Killing Display ...");
		Display.destroy();
		System.out.println("Killing AL ...");
		AL.destroy();
		
		System.out.println("Cleaning up memory ...");
		System.gc();
	}
}
