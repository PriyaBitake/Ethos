package Ethos.com.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Ethos.com.Class.Negtive_Number_Exception;
import Ethos.com.Class.StringCal_logic_page;

import static org.testng.Assert.assertEquals;

public class StringCal_Test
{

    @DataProvider
    public Object[][] AdditionData() 
    {
        return new Object[][]
        		{
        	     {"", 0},
        	    {"1,2",3},
        	     {"1\n4,2",7},
        	     {"-5",5},
                
              };
    }

    @Test(dataProvider = "AdditionData")
    public void TestAddition(String Actual_no, int ExpectedSum) throws Negtive_Number_Exception 
    {
    	StringCal_logic_page calculator = new StringCal_logic_page();
        assertEquals(calculator.add(Actual_no), ExpectedSum);
     
        
    }
}
