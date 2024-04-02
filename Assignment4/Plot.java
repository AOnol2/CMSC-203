/*
 * Class: CMSC203 CRN 32689
 * Instructor: Dr. Grinberg
 * Description: (Write an application that lets the user create a management company and add the properties managed by the company to its list)
 * Due: 04/01/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ata Onol
*/


public class Plot{
	private int x, y, width, depth;
	
	/**
	 * Default, no-arg constructor
	 */
	public Plot(){
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
	
	/**
	 * Constructor that takes x, y, width, and depth as parameters
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Plot(int x, int y, int width, int depth){
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	/**
	 * Constructor that copies values from another given plot
	 * @param otherPlot
	 */
	public Plot(Plot otherPlot){
		x = otherPlot.getX();
		y = otherPlot.getY();
		width = otherPlot.getWidth();
		depth = otherPlot.getDepth();
	}

	/**
	 * Returns the x position of the plot
	 * @return x
	 */
	public int getX(){
		return x;
	}

	/**
	 * Sets the x position of the plot
	 * @param x
	 */
	public void setX(int x){
		this.x = x;
	}

	/**
	 * Returns the y position of the plot
	 * @return y
	 */
	public int getY(){
		return y;
	}

	/**
	 * Sets the y position of the plot
	 * @param y
	 */
	public void setY(int y){
		this.y = y;
	}

	/**
	 * Returns the width of the plot
	 * @return width
	 */
	public int getWidth(){
		return width;
	}

	/**
	 * Sets the width of the plot
	 * @param width
	 */
	public void setWidth(int width){
		this.width = width;
	}

	/**
	 * Returns the depth of the plot
	 * @return depth
	 */
	public int getDepth(){
		return depth;
	}

	/**
	 * Sets the depth of the plot
	 * @param depth
	 */
	public void setDepth(int depth){
		this.depth = depth;
	}
	
	/**
	 * Checks to see if another given plot is inside of this plot
	 * @param plot
	 * @return true if the given plot is inside this plot, false if not
	 */
	public boolean encompasses(Plot plot){
		if ((plot.getX() >= x) && (plot.getY() >= y) && ((plot.getX() + plot.getWidth()) <= (x + width)) && ((plot.getY() +  plot.getDepth()) <= (y + depth))){
			return true;
		}
		return false;
	}
	
	/**
	 * Checks to see if another given plot overlaps with this plot
	 * @param plot
	 * @return true if the given plot overlaps this plot, false if not
	 */
	public boolean overlaps(Plot plot){
		if(x < (plot.getX() + plot.getWidth()) &&
				(x + width) > plot.getX() &&
				y < (plot.getY() + plot.getDepth()) &&
				(y + depth) > plot.getY()){
			return true;
		}
		return false;
	}
	
	/**
	 * Returns the plot information as a string
	 * @return plot information
	 */
	public String toString(){
		return x + "," + y + "," + width + "," + depth;
	}
}