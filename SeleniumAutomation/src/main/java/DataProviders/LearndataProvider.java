package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearndataProvider {
	@Test(dataProvider="data1")
public void mytest(String name1,String name2) {
	System.out.println("First name is " + name1+" Second name is "+name2);
	
}
	@Test(dataProvider="data2")
	public void numberPrinting(Integer one,Integer two) {
		System.out.println(one+":"+two);
	}
	
    @DataProvider
   public String [][]data1() {
	String [][]data=new String [2][2];
	data[0][0]="Nitheesha";
	data[0][1]="Gopal";
    data[1][0]="Sreekanth";	
    data[1][1]="Das";
    return data;
}
    @DataProvider
    public Integer[][]data2() {
    	Integer[][]num=new Integer[2][2];
    	num[0][0]=10;
    	num[0][1]=20;
    	num[1][0]=30;
    	num[1][1]=40;
    	return num;
    }
}
