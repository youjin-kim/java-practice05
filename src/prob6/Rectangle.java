package prob6;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double s) {
		this.width *= s;
		this.height *= s;

	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return (width + height) * 2;
	}

}
