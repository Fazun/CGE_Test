package core;

import org.lwjgl.opengl.Display;

public class CasualGalaxyExplorer 
{
	public float m_Version;
	long m_LastCheckRandomEnemy = 0;
	
	CasualGalaxyExplorer(float version)
	{
	}
	void Run()
	{
		Display.setTitle("Test");

		while (!Display.isCloseRequested()) 
		{
			Display.update();
			Display.sync(120);
		}
	}
}
