package Ethos.com.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
        	     {"1,2",3}
                
              };
    }

    @Test(dataProvider = "AdditionData")
    public void TestAddition(String Actual_no, int ExpectedSum) 
    {
    	StringCal_logic_page calculator = new StringCal_logic_page();
        assertEquals(calculator.add(Actual_no), ExpectedSum);
     
        
    }
}
