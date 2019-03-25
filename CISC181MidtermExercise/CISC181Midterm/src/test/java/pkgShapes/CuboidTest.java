package pkgShapes;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShapes.Cuboid;

public class CuboidTest {
	@Test
	public void Cuboid_Test1() {
		try {
			Cuboid r1 = new Cuboid(1, 2, 3);
		} catch (Exception e) {
			fail("Test failed to build a Cuboid");
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Cuboid_Test2() {
		Cuboid r1 = new Cuboid(-1, 2, 3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Cuboid_Test3() {
		Cuboid r1 = new Cuboid(1, -2, 3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Cuboid_Test4() {
		Cuboid r1 = new Cuboid(1, 2, -3);
	}
	
	@Test
	public void getDepth_Test() {
		Cuboid r1 = new Cuboid(1, 2, 3);
		assertEquals(3, r1.getDepth());
	}
	
	@Test
	public void setDepth_Test1() {
		Cuboid r1 = new Cuboid(1, 2, 3);
		r1.setDepth(2);
		assertEquals(2, r1.getDepth());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setDepth_Test2() {
		Cuboid r1 = new Cuboid(1, 2, 3);
		r1.setDepth(-2);
	}
	
	@Test
	public void area_Test() {
		Cuboid r1 = new Cuboid(2, 2, 2);
		assertTrue(r1.area() == 24.0);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void perimeter_Test() {
		Cuboid r1 = new Cuboid(2, 2, 2);
		r1.perimeter();
	}
	
	@Test
	public void volume_Test() {
		Cuboid r1 = new Cuboid(2, 2, 2);
		assertTrue(r1.volume() == 8.0);
	}
	
}
