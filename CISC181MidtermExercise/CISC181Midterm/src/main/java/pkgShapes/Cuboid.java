package pkgShapes;

import java.util.Comparator;

class Cuboid extends Rectangle {
	int iDepth;
	
	public Cuboid(int w, int l, int d) {
		super (w, l);
		if (d > 0) {
			iDepth = d;
		} else {
			throw new IllegalArgumentException("Invalid number");
		}
	}
	
	public int getDepth() {
		return iDepth;
	}
	
	public void setDepth(int d) {
		if (d > 0) {
			iDepth = d;
		} else {
			throw new IllegalArgumentException("Invalid number");
		}
	}
	
	public double volume() {
		return (iDepth * getWidth() * getLength());
	}
	
	@Override
	double area() {
		return (2 * iDepth * getWidth()) + (2 * getWidth() * getLength()) + (2 * iDepth * getLength());
	}
	
	@Override
	double perimeter() {
		throw new UnsupportedOperationException("Unsupported Operation");
	}
	
	public class SortByArea implements Comparator<Cuboid> {
		
		public int compare(Cuboid a, Cuboid b) {
			int value = 0;
			if (a.area() > b.area()) {
				value = 1;
			} else if (b.area() > a.area()) {
				value = -1;
			}
			return value;
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid> {
		
		public int compare(Cuboid a, Cuboid b) {
			int value = 0;
			if (a.volume() > b.volume()) {
				value = 1;
			} else if (b.volume() > a.volume()) {
				value = -1;
			}
			return value;
		}
	}
}
