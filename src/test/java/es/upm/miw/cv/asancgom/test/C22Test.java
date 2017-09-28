package es.upm.miw.cv.asancgom.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.upm.miw.cv.asancgom.C22;

public class C22Test {
	private C22 c;
	
	@Test
	public void testMA() {
		assertEquals("mA", c.mA());
	}
}
