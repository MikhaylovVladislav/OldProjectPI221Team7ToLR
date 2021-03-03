package lr4.src.Laba2;
    import java.util.Random;

	public class Bublesort{
	public int[] s; 

	public Bublesort(int max){ 
	s = new int[max]; 
	Random r = new Random();
	for(int i=0; i<s.length; i++)
	{
	s[i] = r.nextInt();
	}
	}

	private void toSwap(int first, int second){ 
	int sv = s[first]; 
	s[first] = s[second]; 
	s[second] = sv; 
	}

	public void bubbleSorter(){ 
	for (int j = s.length - 1; j >= 1; j--){ 
	for (int k = 0; k < j; k++){ 
	if(s[k] > s[k + 1]) 
	toSwap(k, k + 1); 
	}
	}
	}
	}
