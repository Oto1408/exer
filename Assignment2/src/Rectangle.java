//excercise #2
public class Rectangle {
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int newWidth) {
		width=newWidth;
	}
	
	public void setHeight(int newHeight) {
		height=newHeight;
	}
	
	public int getPremieter() {
		return (height+width)*2;
	}
	
	public int getArea() {
		return height*width;
	}

}
