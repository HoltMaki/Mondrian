package piet;

import java.awt.Color;

public enum PietColor {
	LIGHT_RED(new Color(255, 192, 192), Hue.RED, Lightness.LIGHT),
	LIGHT_YELLOW(new Color(255, 255, 192), Hue.YELLOW, Lightness.LIGHT),
	LIGHT_GREEN(new Color(192, 255, 192), Hue.GREEN, Lightness.LIGHT),
	LIGHT_CYAN(new Color(192, 255, 255), Hue.CYAN, Lightness.LIGHT),
	LIGHT_BLUE(new Color(192, 192, 255), Hue.BLUE, Lightness.LIGHT),
	LIGHT_MAGENTA(new Color(255, 192, 255), Hue.MAGENTA, Lightness.LIGHT),
	RED(new Color(255, 0, 0), Hue.RED, Lightness.NORMAL),
	YELLOW(new Color(255, 255, 0), Hue.YELLOW, Lightness.NORMAL),
	GREEN(new Color(0, 255, 255), Hue.GREEN, Lightness.NORMAL),
	CYAN(new Color(0, 255, 255), Hue.CYAN, Lightness.NORMAL),
	BLUE(new Color(0, 0, 255), Hue.BLUE, Lightness.NORMAL),
	MAGENTA(new Color(255, 0, 255), Hue.MAGENTA, Lightness.NORMAL),
	DARK_RED(new Color(192, 0, 0), Hue.RED, Lightness.DARK),
	DARK_YELLOW(new Color(192, 192, 0), Hue.YELLOW, Lightness.DARK),
	DARK_GREEN(new Color(0, 192, 0), Hue.GREEN, Lightness.DARK),
	DARK_CYAN(new Color(0, 192, 192), Hue.CYAN, Lightness.DARK),
	DARK_BLUE(new Color(0, 0, 192), Hue.BLUE, Lightness.DARK),
	DARK_MAGENTA(new Color(192, 0, 192), Hue.MAGENTA, Lightness.DARK),
	BLACK(new Color(0, 0, 0), Hue.NONE, Lightness.NONE),
	WHITE(new Color(255, 255, 255), Hue.NONE, Lightness.NONE);
	
	public final Color color;
	public final Hue hue;
	public final Lightness lightness;
	public final int hueOrder;
	public final int lightnessOrder;
	
	PietColor(Color color, Hue hue, Lightness lightness)
	{
		this.color = color;
		this.hue = hue;
		this.lightness = lightness;
		hueOrder = hue.order;
		lightnessOrder = lightness.order;
	}
	
	public static int hueChange(PietColor oldColor, PietColor newColor) throws ColorException
	{
		if(oldColor.hueOrder >= 0 && newColor.hueOrder >= 0)
		{
			return Math.abs(oldColor.hueOrder - newColor.hueOrder);
		}
		else
		{
			throw new ColorException();
		}
	}
	
	public static int lightnessChange(PietColor oldColor, PietColor newColor) throws ColorException
	{
		if(oldColor.lightnessOrder >= 0 && newColor.lightnessOrder >= 0)
		{
			return ((oldColor.lightnessOrder - newColor.lightnessOrder) % 3);
		}
		else
		{
			throw new ColorException();
		}
	}
	
	public static enum Hue
	{
		RED(0),
		YELLOW(1),
		GREEN(2),
		CYAN(3),
		BLUE(4),
		MAGENTA(5),
		NONE(-1);
		
		public final int order;
		
		Hue(int order)
		{
			this.order = order;
		}
	}
	
	public static enum Lightness
	{
		LIGHT(2),
		NORMAL(1),
		DARK(0),
		NONE(-1);
		
		public final int order;
		
		Lightness(int order)
		{
			this.order = order;
		}
		
	}
	
	/**
	 * An exception that has to do with {@linkplain PietColor}
	 * @author Holt Maki
	 *
	 */
	public static class ColorException extends Exception
	{

		/**
		 * Generated Serial Version UID.
		 */
		private static final long serialVersionUID = 8176602531796052728L;
		
	}
	
	/**
	 * An exception that is thrown when white is used as a normal color.
	 * @author Holt Maki
	 *
	 */
	public static class WhiteColorException extends ColorException
	{

		/**
		 * Generated Serial Version UID.
		 */
		private static final long serialVersionUID = -8620431952942228802L;
		
	}
	
	/**
	 * An exception that is thrown when black is used as a normal color.
	 * @author Holt Maki
	 *
	 */
	public static class BlackColorException extends ColorException
	{

		/**
		 * Generated Serial Version UID.
		 */
		private static final long serialVersionUID = 2898887894302738892L;
		
	}
	
}
