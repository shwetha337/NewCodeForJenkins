package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;


public class sikuli {
	static WebDriver driver;
	public static void main(String[] args) throws FindFailed{
		
		   Screen screen=new Screen();
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\pal\\Downloads\\DailyHealthCheckCode-master\\TestScreenShotDemo\\drivers\\chromedriver.exe");
			// Initialize browser
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://tutorialsninja.com/demo/");
			
			ScreenImage scrImgFile2 = screen.userCapture();
		    String path2 = scrImgFile2.getFile(".");
		    System.out.println("Please note down the file Path: ");
		    System.out.println(path2);
		    Pattern pattern2 = null;
		    pattern2=new Pattern(path2);
		    
		    try {
		    	screen.click(pattern2);
		    } catch (FindFailed e) {
		       
		        e.printStackTrace();
		    }
			
			Pattern pattern=new Pattern(path2);
			
			screen.click(pattern);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*// Maximize browser

			System.setProperty("webdriver.gecko.driver","C:\\Users\\pal\\Downloads\\DailyHealthCheckCode-master\\TestScreenShotDemo\\drivers\\geckodriver.exe" );  
	        DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
	        capabilities.setCapability("marionette",true);  
	        WebDriver driver= new FirefoxDriver(); 
	        driver.get("https://104.211.163.127:8080/nifi/");
			driver.manage().window().maximize();
			

			driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Open nifi
			
			
			Thread.sleep(1000);
			WebElement advancedBtn = driver.findElement(By.xpath("//button[@id='details-button']"));
			advancedBtn.click();
		
			Screen scr=new Screen();
		    ScreenImage scrImgFile = scr.userCapture();
		    String path = scrImgFile.getFile(".");
		    System.out.println("Please note down the file Path: ");
		    System.out.println(path);
		    Pattern pattern = null;
		    pattern=new Pattern(path);
		    
		    try {
		    	 scr.click(pattern);
		    } catch (FindFailed e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		    
		    
		    ScreenImage scrImgFile3 = scr.userCapture();
		    String path3 = scrImgFile3.getFile(".");
		    System.out.println("Please note down the file Path: ");
		    System.out.println(path3);
		    Pattern pattern3 = null;
		    pattern3=new Pattern(path3);
		    
		    try {
		    	 scr.click(pattern3);
		    } catch (FindFailed e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
			
		   
		
			
			
			
			//System.out.println("clicked on proceed link............");
			//driver.findElement(By.xpath("//p//a[.='Proceed to 104.211.163.127 (unsafe)']")).click();
			
			Thread.sleep(2000);
		    ScreenImage scrImgFile = scr.userCapture();
		    Pattern pattern1 = null;
		  //THis method will save the file to the current directory
		    String path = scrImgFile.getFile(".");
		    

		    //This will print the full path of the save file
		    System.out.println("Please note down the file Path: ");
		    System.out.println(path);
	        
			
			Robot robot = new Robot();
			System.out.println("About to zoom in");
			for (int i = 0; i < 3; i++) {			
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_ADD);
				robot.keyRelease(KeyEvent.VK_ADD);
				robot.keyRelease(KeyEvent.VK_CONTROL);
			}
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//Find element by link text and store in variable "Element"        		
	        WebElement Element = driver.findElement(By.xpath("//p[@id='final-paragraph']//a[@id='proceed-link']"));

	        //This will scroll the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	        driver.findElement(By.xpath("//p[@id='final-paragraph']//a[@id='proceed-link']")).click();
			Screen scr=new Screen();
		
		    ScreenImage scrImgFile1 = scr.userCapture();
		    String path1 = scrImgFile1.getFile(".");
		    System.out.println("Please note down the file Path: ");
		    System.out.println(path1);
		    Pattern pattern1 = null;
		    pattern1=new Pattern(path1);
		    
		    try {
		    	Thread.sleep(1000);
		    	 scr.click(pattern1);
		    } catch (FindFailed e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		    
			
		    ScreenImage scrImgFile2 = scr.userCapture();
		    String path2 = scrImgFile2.getFile(".");
		    System.out.println("Please note down the file Path: ");
		    System.out.println(path2);
		    Pattern pattern2 = null;
		    pattern2=new Pattern(path2);
		    
		    try {
		    	 scr.click(pattern2);
		    } catch (FindFailed e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		    
		    
		    ScreenImage scrImgFile4 = scr.userCapture();
		    String path4 = scrImgFile4.getFile(".");
		    System.out.println("Please note down the file Path: ");
		    System.out.println(path4);
		    Pattern pattern4 = null;
		    pattern3=new Pattern(path3);
		    
		    try {
		    	 scr.click(pattern4);
		    } catch (FindFailed e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }*/
			
		   
		}
		

}
