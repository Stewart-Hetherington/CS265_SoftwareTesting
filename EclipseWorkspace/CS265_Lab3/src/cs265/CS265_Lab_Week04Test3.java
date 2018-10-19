package cs265;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CS265_Lab_Week04Test3 {
	
	@Test
	  public void CT_test1() {
		   String expectedValue = "UNKNOWN";
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.doMoodleLogon(null,null,false));
	  }
	  @Test
	  public void CT_test2() {
		  String expectedValue = "UNKNOWN";
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.doMoodleLogon(null,null,true));
	  }
	  @Test
	  public void CT_test3() {
		  String expectedValue = "UNKNOWN";
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.doMoodleLogon(null,"billy@nuim.ie",false));
	  }
	  @Test
	  public void CT_test4() {
		  String expectedValue = "UNKNOWN";
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.doMoodleLogon(null,"Sarah@nuim.ie",true));
	  }
	  @Test
	  public void CT_test5() {
		  String expectedValue = "UNKNOWN";
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.doMoodleLogon("Password1",null,false));
	  }
	  @Test
	  public void CT_test6() {
		  String expectedValue = "UNKNOWN";
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.doMoodleLogon("Password2",null,true));
	  }
	  @Test
	  public void CT_test7() {
		  String expectedValue = "STAFF PAGE";
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.doMoodleLogon("Password3","sarah@nuim.ie",false));
	  }
	  @Test
	  public void CT_test8() {
		  String expectedValue = "STUDENT PAGE";
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.doMoodleLogon("Password4","billy@nuim.ie",true));
	  }
	  //Extra Branch Coverage Test to cover line 42 of CS265_Lab_Week04
	  @Test
	  public void BC_test1() {
		  String expectedValue = "UNKNOWN";
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.doMoodleLogon("","",false));
	  }
	//Extra Branch Coverage Test to cover line 57 of CS265_Lab_Week04
	  @Test
	  public void BC_test2() {
		  String expectedValue = "UNKNOWN";
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week04.doMoodleLogon("Fake","not an email address",true));
	  }
	  
}
