package cs265;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CS265_Lab_Week04Test2 {
	
	@Test
	  public void CT_test1() {
		   double expectedValue = 0.0;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.saleRate(10,false,false));
	  }
	  @Test
	  public void CT_test2() {
		  double expectedValue = 0.02;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.saleRate(10,false,true));
	  }
	  @Test
	  public void CT_test3() {
		  double expectedValue = 0.02;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.saleRate(10,true,false));
	  }
	  @Test
	  public void CT_test4() {
		  double expectedValue = 0.04;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.saleRate(10,true,true));
	  }
	  @Test
	  public void CT_test5() {
		  double expectedValue = 0.04;
		   
		   AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.saleRate(50,false,false));
	  }
	  @Test
	  public void CT_test6() {
		  double expectedValue = 0.06;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.saleRate(51,false,true));
	  }
	  @Test
	  public void CT_test7() {
		  double expectedValue = 0.06;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.saleRate(52,true,false));
	  }
	  @Test
	  public void CT_test8() {
		  double expectedValue = 0.06;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.saleRate(53,true,true));
	  }
}
