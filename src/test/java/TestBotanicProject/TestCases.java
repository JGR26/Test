package TestBotanicProject;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.Cactus;
import models.Ornamental;

public class TestCases {

	Ornamental orna;
	Cactus cactus;
	
	@Before
	public void setUp() {
		orna=new Ornamental();
		cactus=new Cactus();
	}
	
	
	
	@After
	public void tearDown() {
		orna=null;
		cactus=null;
	}
	
	/**
	 * Esto son los unicos metodos testeados ya que el controllador tiene funciones directas a las views
	 */
	@Test
	public void metodoCrianzaOrna() {
		String method=orna.metodoDeCrianza();
		assertEquals("uso de macetas con tierra y luz indirecta", method);
	}
	
	@Test
	public void metodoCrianzaCactus() {
		String method=orna.metodoDeCrianza();
		assertEquals("uso de sustrato y luz directa",method);
	}

	@Test
	public void colorDeFlorOrna() {
		orna.colorDeFlor("Roja");
		assertEquals("Roja",orna.getColor());
	}
	
	@Test
	public void colorDeFlorCactus() {
		String color= cactus.colorDeFlor("Roja");
		assertEquals("No tienen Flor.",color);
	}
}
