import java.util.logging.Handler;

public class Rectangle {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
		this.width = 0;
		this.height = 0;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width < 0) {
			this.width = 0;
		} else
			this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height < 0) {
			this.height = 0;
		} else
			this.height = height;
	}

	public double getArea() {
		return this.width * this.height;
	}

	public double getCircumference() {
		return 2 * (this.width + this.height);
	}

}
