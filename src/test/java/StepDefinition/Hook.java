package StepDefinition;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
//	public WebDriver driver;
//	
//	@Before
//    public void beforeScenario(){
//		WebDriverManager.chromedriver().setup();
//	    driver = new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    driver.manage().window().maximize();
//        System.out.println("This will run before the Scenario");
//    }
//    @After
//    public void afterScenario(){
//    	driver.close();
//        System.out.println("This will run after the Scenario");
//    }
	
	
	
	
//	public int pass = 0 ;
//	public int fail = 0 ;
//	public int skip = 0 ;
//	
// 	@After
// 	public void endCase(ITestResult result) throws IOException  {
//
// 	    System.out.println("endcase-->"+result.getStatus());
// 	    switch (result.getStatus()) {
// 	    case ITestResult.SUCCESS:
// 	        System.out.println("======PASS=====");
// 	        pass++;
// 	       XLUtils.setCellData(xlFile,xlSheet, rinc++,getCellCount(xlFile, xlSheet, 0)-1, "PASS");
// 	        break;
//
// 	    case ITestResult.FAILURE:
// 	        System.out.println("======FAIL=====");
// 	        fail++;
// 	       XLUtils.setCellData(xlFile,xlSheet, rinc++,getCellCount(xlFile, xlSheet, 0)-1, "FAIL");
// 	        break;
//
// 	    case ITestResult.SKIP:
// 	        System.out.println("======SKIP BLOCKED=====");
// 	        skip++;
//	       XLUtils.setCellData(xlFile,xlSheet, rinc++,getCellCount(xlFile, xlSheet, 0)-1, "SKIP");
// 	        break;
//
// 	    default:
// 	        throw new RuntimeException("Invalid status");   
// 	    }
// 	    
// 	   System.out.println(pass);
// 	  System.out.println(fail);
// 	 System.out.println(skip);
// 	    
 	  }
