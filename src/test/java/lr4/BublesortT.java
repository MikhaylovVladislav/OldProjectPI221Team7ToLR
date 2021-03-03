package lr4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import lr4.src.Laba2.Bublesort;



public class BublesortT {
static Bublesort R;
@BeforeClass
public static void setUpBeforeClass() throws Exception {
R = new Bublesort(5);
R.bubbleSorter();
}

@AfterClass
public static void tearDownAfterClass() throws Exception {
R=null;
}
@Test
public void test() {
for(int i=0; i<R.s.length - 1; i++)
{
assertTrue(R.s[i]<=R.s[i+1]);
}
}

}
