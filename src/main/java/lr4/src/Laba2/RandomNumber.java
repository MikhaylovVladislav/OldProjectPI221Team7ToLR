package lr4.src.Laba2;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
	public int array1;
	public RandomNumber () {
		
	}
 public void generate() {
     
	 array1 = getIntFromRange(100, 500);

     

     System.out.println(Integer.toString(array1));
}
 static int getIntFromRange (int min, int max) {
     Random random = new Random();
     return random.nextInt(max - min + 1) + min;
 }
}