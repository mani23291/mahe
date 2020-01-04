package seleniumm;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class framewowk {
	
  @ DataProvider (name="VerifyLogin1")
		  
  public Object[][]	getdata(){
	  
	  Object[][] data=new Object[3][2];
		

		data [0][0]	    =" Admin";
		data [0][1]     ="admin123";
		
		data [1][0]	    =" Admin";
		data [1][1]     ="admin123";  
		
	    data [2][0] 	=" Admin";
		data [2][1]     ="admin123";
		
	     return data;
	  }
}
  //@Test(dataProvider="VerifyLogin")
   //public void verifylogin1