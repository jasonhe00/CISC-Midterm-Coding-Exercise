package pkgShapes;

class Rectangle extends Shape {
	private int iWidth;
	private int iLength;
	
	public Rectangle(int w, int l) {
		if ((w > 0) && (l > 0)) {
			iWidth = w;
			iLength = l;
		} else {
			throw new IllegalArgumentException("Invalid number");
		}
	}
	
	public int getWidth() {
		return iWidth;
	}
	
	public void setWidth(int w) { 
		if (w > 0) {
			iWidth = w;
		} else {
			throw new IllegalArgumentException("Invalid number");
		}
	}
	
	public int getLength() {
		return iLength;
	}
	
	public void setLength(int l) {
		if (l > 0) {
			iLength = l;
		} else {
			throw new IllegalArgumentException("Invalid number");
		}
	}
	
	double area() {
		return iWidth * iLength;
	}
	
	double perimeter() {
		return (2 * iWidth) + (2 * iLength);
	}
	
	public int compareTo(Rectangle o) {
		int value = 0;
		if (area() > o.area()) {
			value = 1;
		} else if (o.area() > area()) {
			value = -1;
		}
		return value;
	}
}

