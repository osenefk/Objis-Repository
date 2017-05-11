package sn.objis.monprojet.domain;

import junit.framework.TestCase;

public class CalculTest extends TestCase {
	private Calcul calcul;

	protected void setUp() throws Exception {
		super.setUp();
		calcul=new Calcul();
	}
	
	public void somme(){
		assertTrue(calcul.somme(5, 4)==9);
	}
	
	public void produit(){
		assertTrue(calcul.produit(5, 4)==20);
	}

}
