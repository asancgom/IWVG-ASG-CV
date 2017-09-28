package es.upm.miw.cv.asancgom.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.upm.miw.cv.asancgom.C32;


public class C32Test {
	private C32 c;
	
	@Test
	public void testMA() {
		assertEquals("mA", c.mA());
	}
}
