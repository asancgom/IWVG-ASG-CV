package es.upm.miw.cv.asancgom.test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.upm.miw.cv.asancgom.C31;

public class C31Test {
	private C31 c;
	
	@Test
	public void testM1() {
		assertEquals("m1", c.m1());
	}
	
	@Test
	public void testM2() {
		assertEquals("m2", c.m2());
	}
}
