package lr4;

import static org.junit.Assert.*;

import org.junit.Test;


import lr4.src.Laba2.RandomNumber;

public class RNTest{


	@Test
	public void testAssertEquals() {
		RandomNumber VEVO = new RandomNumber ();
		VEVO.generate();
		 
			 assertTrue ((VEVO.array1)>100 & (VEVO.array1<500));
	     }
	}

	

