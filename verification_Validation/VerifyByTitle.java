package verification_Validation;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByTitle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//open chrome
				ChromeDriver  driver=new ChromeDriver();
				//maximize chrome browser
				driver.manage().window().maximize();
				
				//stop execution for 2sec
				Thread.sleep(2000);
				
			   driver.get("https://demowebshop.tricentis.com/");
			   
			   String actual_Title=driver.getTitle();
			   
			   System.out.println(actual_Title);
			   
			  
			  String excepted_Title="Demo Web Shop";
			   
			   if(excepted_Title.equals(actual_Title)) {
				   System.out.println("I am in currect Page");
				   System.out.println("Test case Pass");
			   }
			   else {
				   System.out.println("I am in Wrong Page");
				   driver.close();
				   throw new Exception("test case is faild");
			   }
			   driver.close();
	}

}
