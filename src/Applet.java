package ProcessingNewProject.src;

import processing.core.*;

/**
 * A simple program that shows an orange screen.
 */
public class Applet extends PApplet {

	public void settings() {
		fullScreen();
		size(640, 480);
	}

	public void draw() {
		background(255,127,0);
	}

}
