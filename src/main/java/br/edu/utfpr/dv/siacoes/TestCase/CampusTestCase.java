package br.edu.utfpr.dv.siacoes.TestCase;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.utfpr.dv.siacoes.model.Campus;

public class CampusTestCase {
	
	private final Campus c = new Campus();
	
	@Test
	public void test() {
		c.setIdCampus(1);
		assertEquals(1, c.getIdCampus());
	}

}
