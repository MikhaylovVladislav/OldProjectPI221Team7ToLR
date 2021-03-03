package lr4;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import lr4.src.Laba2.Massiv;

public class BogolyubovT {

    Massiv mass1 = new Massiv();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}


	@Test
	public void MassArray() {
		assertEquals(11,mass1.Array.length); //проверка длины массива
		for(int i=0; i<mass1.Array.length; i++)
		{
		assertNotNull(mass1.Array[i]);//проверка элементов на Null
		}
	}
}