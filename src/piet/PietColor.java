package piet;

import java.awt.Color;

public enum PietColor {
	LIGHT_RED(new Color(255, 192, 192)),
	LIGHT_YELLOW(new Color(255, 255, 192)),
	LIGHT_GREEN(new Color(192, 255, 192)),
	LIGHT_CYAN(new Color(192, 255, 255)),
	LIGHT_BLUE(new Color(192, 192, 255)),
	LIGHT_MAGENTA(new Color(255, 192, 255)),
	RED(new Color(255, 0, 0)),
	YELLOW(new Color(255, 255, 0)),
	GREEN(new Color(0, 255, 255)),
	CYAN(new Color(0, 255, 255)),
	BLUE(new Color(0, 0, 255)),
	MAGENTA(new Color(255, 0, 255)),
	DARK_RED(new Color(192, 0, 0)),
	DARK_YELLOW(new Color(192, 192, 0)),
	DARK_GREEN(new Color(0, 192, 0)),
	DARK_CYAN(new Color(0, 192, 192)),
	DARK_BLUE(new Color(0, 0, 192)),
	DARK_MAGENTA(new Color(192, 0, 192)),
	BLACK(new Color(0, 0, 0)),
	WHITE(new Color(255, 255, 255));
	
	public final Color color;
	
	PietColor(Color color)
	{
		this.color = color;
	}
}
