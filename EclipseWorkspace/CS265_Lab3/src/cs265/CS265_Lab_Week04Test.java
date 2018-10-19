package cs265;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CS265_Lab_Week04Test {
	
	@Test
	  public void CT_test1() {
		   int expectedValue = 5;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.equipmentInsurance(false,false));
	  }
	  @Test
	  public void CT_test2() {
		  int expectedValue = 10;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.equipmentInsurance(false,true));
	  }
	  @Test
	  public void CT_test3() {
		  int expectedValue = 10;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.equipmentInsurance(true,false));
	  }
	  @Test
	  public void CT_test4() {
		  int expectedValue = 20;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.equipmentInsurance(true,true));
	  }
}
