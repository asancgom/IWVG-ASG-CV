package es.upm.miw.cv.asancgom.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.upm.miw.cv.asancgom.C21;

public class C21Test {
	private C21 c;
	
	@Test 
	public void testM1() {
        assertEquals("m1", c.m1());
    }
	
	@Test 
	public void testM2() {
        assertEquals("m2", c.m2());
   }
	
}