package lr4.src.Laba2;

public class Massiv  {
	public int[] Array;
	public Massiv(){

	Array = new int[11];
	 RandomNumber Rand = new RandomNumber();
	 for (int b=0; b<11 ; b++) {
		 Array[b]=Rand.getIntFromRange (100, 500);
		 
	   }
	
}
}