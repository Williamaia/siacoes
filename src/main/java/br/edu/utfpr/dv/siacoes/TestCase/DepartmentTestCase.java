package br.edu.utfpr.dv.siacoes.TestCase;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.utfpr.dv.siacoes.model.Department;

public class DepartmentTestCase {
	
	private final Department d = new Department();
	
	@Test
	public void test() {
		d.setIdDepartment(1);
		assertEquals(1, d.getIdDepartment());
	}

}