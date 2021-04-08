package Demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testcase {

	@BeforeClass
	  public static void beforeclassmethod()
	  {
	    System.out.println("Before Class");
	  }
	  @Before
	  public void beforetestcase()
	  {
	    System.out.println("Before Testcase");
	  }
	  

	  @Test
	  public void test() {
	    
	    
	    
	    assertEquals(4,FindResult.FindMaxNum(new int[] {1,2,3,4}));
	    System.out.println("Test cases Passed");
	    assertEquals(true,FindResult.evenOrodd(4));
	    System.out.println("Test cases Passed");
	    assertTrue(FindResult.evenOrodd(4));
	    //assertFalse(FindResult.evenOrodd(4));
	  }
	  @After
	  public void aftertestcase()
	  {
	    System.out.println("After Testcase");
	  }
	  @AfterClass
	  public static void afterclass()
	  {
	    System.out.println("After Testcase");
	  }
      	
	

}