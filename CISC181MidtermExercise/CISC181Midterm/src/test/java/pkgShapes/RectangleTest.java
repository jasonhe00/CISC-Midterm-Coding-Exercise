package pkgShapes;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShapes.Rectangle;

public class RectangleTest {
	
	@Test
	public void Rectangle_Test1() {
		try {
			Rectangle r1 = new Rectangle(1, 2);
		} catch (Exception e) {
			fail("Test failed to build a Rectangle");
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Rectangle_Test2() {
		Rectangle r1 = new Rectangle(-1, 2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Rectangle_Test3() {
		Rectangle r1 = new Rectangle(1, -2);
	}
	
	@Test
	public void getWidth_Test() {
		Rectangle r1 = new Rectangle(1, 2);
		assertEquals(1, r1.getWidth());
	}
	
	@Test
	public void setWidth_Test1() {
		Rectangle r1 = new Rectangle(1, 2);
		r1.setWidth(2);
		assertEquals(2, r1.getWidth());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setWidth_Test2() {
		Rectangle r1 = new Rectangle(1, 2);
		r1.setWidth(-2);
	}
	
	@Test
	public void getLength_Test() {
		Rectangle r1 = new Rectangle(1, 2);
		assertEquals(2, r1.getLength());
	}
	
	@Test
	public void setLength_Test1() {
		Rectangle r1 = new Rectangle(1, 2);
		r1.setLength(1);
		assertEquals(1, r1.getLength());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setLength_Test2() {
		Rectangle r1 = new Rectangle(1, 2);
		r1.setLength(-2);
	}
	
	@Test
	public void area_Test() {
		Rectangle r1 = new Rectangle(2, 2);
		assertTrue(r1.area() == 4.0);
	}
	
	@Test
	public void perimeter_Test() {
		Rectangle r1 = new Rectangle(2, 2);
		assertTrue(r1.perimeter() == 8);
	}
	
	public void compareTo_Test1() {
		Rectangle r1 = new Rectangle(2, 2);
		Rectangle r2 = new Rectangle(4, 6);
		assertTrue(r1.compareTo(r2) == -1);
	}
	
	public void compareTo_Test2() {
		Rectangle r1 = new Rectangle(2, 2);
		Rectangle r2 = new Rectangle(4, 6);
		assertTrue(r2.compareTo(r1) == 1);
	}
	
	public void compareTo_Test3() {
		Rectangle r1 = new Rectangle(2, 2);
		Rectangle r2 = new Rectangle(2, 2);
		assertTrue(r1.compareTo(r2) == 0);
	}
}

