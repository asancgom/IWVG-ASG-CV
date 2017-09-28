package es.upm.cv.asancgom;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.upm.cv.asancgom.C11;


public class C11Test {
	
	private C11 c;
	
	@Test
	public void testM1() {
		assertEquals("m1", c.m1());
	}
	
	@Test
	public void testM2() {
		assertEquals("m2", c.m2());
	}
}