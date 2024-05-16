package PracticeSelenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderParactice {
	@Test(dataProvider="test1")
	public void printing(String name1,String name2) {
		System.out.println("Name is "+name1+" Another name is "+name2);
	}
	
	@DataProvider
	public  String[][] test1() {
		String [][]str=new String [2][2];
		str[0][0]="Nithi";
		str[0][1]="Gopal";
	    str[1][0]="Paru";
	    str[1][1]="Kuttos";
	    return str;
	}

}
