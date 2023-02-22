package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class base_class1 {

	public static WebDriver driver;
    //Browser Launch
	
	public static WebDriver Browser_Launch(String name) {
		if(name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\ECLIPSE WORKSPACE\\Selenium_Project\\DRIVER\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("incognito");
			
		    driver = new ChromeDriver(options);
		}
		
		else if (name.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\ECLIPSE WORKSPACE\\Selenium_Project\\DRIVER\\msedgedriver.exe");		
			
			EdgeOptions options = new EdgeOptions();
			options.addArguments("inprivate");
			
			driver = new EdgeDriver(options);
		}
		return driver;
	}
	
	//WebDriver Methods
	
	public static void title(WebDriver d) {
    String title = d.getTitle();
   
    System.out.println(title);
		
	}
	
	public static void url(WebDriver d, String url) {
	     
		 d.get(url);
	}
	
	     
    public static void current_url(WebDriver d) {
    	
    	String currentUrl = d.getCurrentUrl();
    	
    	System.out.println(currentUrl);

	}
	
     public static void page_source(WebDriver d) {

    	 String pageSource = d.getPageSource();
    	 System.out.println(pageSource);
    	 
	}	
	
	public static void close(WebDriver d) {

		d.close();
	}
	
	public static void quitpage(WebDriver d) {
		
		d.quit();
	}
	
	//WebDriver.Navigation Commands
	
	public static void back(WebDriver d) {

		d.navigate().back();
	}
	
	public static void forward(WebDriver d) {

		d.navigate().forward();
		
	}
	
	public static void refresh(WebDriver d) {

		d.navigate().refresh();
	}
	
//WebDriver.Managae Commands
	
	public static void maximize(WebDriver d) {
		d.manage().window().maximize();
		
	}
	
	public static void full_screen(WebDriver d) {

		 d.manage().window().fullscreen();
	}
	
	public static void pagesize(WebDriver d) {

		 d.manage().window().getSize();
	}
	
	public static void page_dimension(WebDriver d, String dimension) {
 
		 d.manage().window().setSize(null);
		
	}
	
	public static void delete_cookies(WebDriver d) {

		d.manage().deleteAllCookies();
	}

//WebElements Methods
    
	public static void input(WebElement Web, String value) {

    	Web.sendKeys(value);
    	
	}

     public static void click(WebElement Web) {

    	  Web.click();
	}
    
     public static void clear(WebElement Web) {

   	  Web.clear();
	}
     
     public static void gettext(WebElement Web) {

   	  String text = Web.getText();
   	  System.out.println(text);
	}
     
     public static void isenabled(WebElement Web) {

   	  boolean enabled = Web.isEnabled();
   	  System.out.println(enabled);
   	  
	}
     
     public static void isdisplayed(WebElement Web) {

    	 boolean displayed = Web.isDisplayed();
    	 
    	 System.out.println(displayed);
    	 
	}
     
     public static void isselected(WebElement Web) {

    	 boolean selected = Web.isSelected();
    	 
    	 System.out.println(selected);
    	 
	}
     
     public static void getattributename(WebElement Web, String value) {

           String attribute = Web.getAttribute(value);
           
           System.out.println(attribute);
     }

     public static void gettagname(WebElement Web) {

    	 String tagName = Web.getTagName();
    	 
    	 System.out.println(tagName);
	}
     
     public static void getlocation(WebElement Web) {

    	 Point location = Web.getLocation();
    	 
    	 System.out.println(location);
	}
     
     public static void CssValue(WebElement Web, String Value) {

    	 Web.getCssValue(Value);
	}
     
// Drop Down Commands
     
      public static void selectfromindex(WebElement Web , int i) {

           Select s = new Select (Web);
           s.selectByIndex(i);
	}
      
      public static void selectfromvalue(WebElement Web , String value) {
 
    	   Select s = new Select(Web);
    	   s.selectByValue(value);
	}
     
      public static void selectfromvisibletext(WebElement Web , String value) {
 
    	  Select s = new Select(Web);
    	  s.selectByVisibleText(value);
    	  
	}
      
      public static void ismultiple(WebElement Web) {
    	  
         Select s = new Select(Web);
         boolean multiple = s.isMultiple();
         System.out.println(multiple);
    	  
	}
      
      public static void getoptions(WebElement Web) {

    	  Select s = new Select(Web);
    	  List<WebElement> options = s.getOptions();
    	  
    	  for (WebElement webElement : options) {
			
    		  System.out.println(webElement.getText());
		}
	}
      
      public static void deselectbyindex(WebElement Web , int index) {
    	  
          Select s = new Select(Web);
          s.deselectByIndex(0);
      }
      
      public static void deselectbyvalue(WebElement Web, String value) {
    	  
          Select s = new Select(Web);
          s.deselectByValue(null);
      }
      
       public static void deselectbyvisibletext(WebElement Web, String value) {
    	  
          Select s = new Select(Web);
          s.deselectByVisibleText(null);
      }
          
       public static void deselectall(WebElement Web) {
     	  
           Select s = new Select(Web);
           s.deselectAll();
       }
       
       public static void getallselectedoptions(WebElement Web) {

     	  Select s = new Select(Web);
     	  List<WebElement> options = s.getAllSelectedOptions();
     	  
     	  for (WebElement webElement : options) {
 			
     		  System.out.println(webElement.getText());
 		}
 	}
       
       public static void getfirstselectedoption(WebElement Web) {
     	  
           Select s = new Select(Web);
           WebElement firstSelectedOption = s.getFirstSelectedOption();
           System.out.println(firstSelectedOption);
       }
       
// Alert Methods
       
       public static void accept(WebDriver d) {

    	   Alert alert = d.switchTo().alert();
    	   alert.accept();
    	   
	}
        public static void dismiss(WebDriver d) {

           Alert alert = d.switchTo().alert();
           alert.dismiss();
        }
        
        public static void alert_gettext_accept(WebDriver d) {

        	Alert alert = d.switchTo().alert();
        	
        	String text = alert.getText();
        	
        	System.out.println(text);
        	
        	alert.accept();
        	
		}
        
        public static void alert_gettext_dismiss(WebDriver d) {

        	Alert alert = d.switchTo().alert();
        	
        	String text = alert.getText();
        	
        	System.out.println(text);
        	
        	alert.dismiss();
        }
       
        public static void alert_sentkey(WebDriver d , String value) {

        	Alert alert = d.switchTo().alert();
        	
        	alert.sendKeys(value);
        	
		}
//Actions Commands
      
      public static void Mouse_Click(WebDriver d, WebElement Web) {

    	 Actions act = new Actions(d);
    	 act.click(Web).build().perform();;
	}
      
      public static void rightclick(WebDriver d , WebElement Web) {

    	  Actions act = new Actions(d);
    	  act.contextClick(Web).build().perform();
    	  
	}
      public static void doubleclick(WebDriver d , WebElement Web) {

    	  Actions act = new Actions(d);
    	  act.doubleClick(Web).build().perform();
      }
      
      public static void clickandhold(WebDriver d , WebElement Web) {

    	  Actions act = new Actions(d);
    	  act.clickAndHold(Web).build().perform();
      }
      
      public static void movetoelement(WebDriver d , WebElement Web) {

    	  Actions act = new Actions(d);
    	  act.moveToElement(Web).build().perform();
      }
     
      public static void release(WebDriver d, WebElement Web) {

    	  Actions act = new Actions(d);
    	  act.release(Web).build().perform();
    	  
	}
      
      public static void draganddrop(WebDriver d, WebElement Src, WebElement tar) {
       
    	  Actions act = new Actions(d);
    	  act.dragAndDrop(Src, tar);
	}
//Robot Class Commands
     public static void keydown() throws AWTException {

    	  Robot rob = new Robot();
    	  
    	  rob.keyPress(KeyEvent.VK_DOWN);
    	  rob.keyRelease(KeyEvent.VK_DOWN);
    	  
    	 	}
     
     public static void keyup() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_UP);
   	  rob.keyRelease(KeyEvent.VK_UP);
   	  
   	 	}
     
     public static void keyleft() throws AWTException {

      	  Robot rob = new Robot();
      	  
      	  rob.keyPress(KeyEvent.VK_LEFT);
      	  rob.keyRelease(KeyEvent.VK_LEFT);
      	  
      	 	}
     
     public static void keyright() throws AWTException {

     	  Robot rob = new Robot();
     	  
     	  rob.keyPress(KeyEvent.VK_RIGHT);
     	  rob.keyRelease(KeyEvent.VK_RIGHT);
     	  
     	 	}
     
     public static void key0() throws AWTException {

    	  Robot rob = new Robot();
    	  
    	  rob.keyPress(KeyEvent.VK_0);
    	  rob.keyRelease(KeyEvent.VK_0);
    	  
    	 	}
     public static void key1() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_1);
   	  rob.keyRelease(KeyEvent.VK_1);
   	  
   	 	}
     
     public static void key2() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_2);
   	  rob.keyRelease(KeyEvent.VK_2);
   	  
   	 }
     
     public static void key3() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_3);
   	  rob.keyRelease(KeyEvent.VK_3);
   	  
   	 	}
     
     public static void key4() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_4);
   	  rob.keyRelease(KeyEvent.VK_4);
   	  
   	 	}
     
     public static void key5() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_5);
   	  rob.keyRelease(KeyEvent.VK_5);
   	  
   	 	}
     
     public static void key6() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_6);
   	  rob.keyRelease(KeyEvent.VK_6);
   	  
   	 	}
     
     public static void key7() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_7);
   	  rob.keyRelease(KeyEvent.VK_7);
   	  
   	 	}
     
     public static void key8() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_8);
   	  rob.keyRelease(KeyEvent.VK_8);
   	  
   	 	}

     public static void key9() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_9);
   	  rob.keyRelease(KeyEvent.VK_9);
   	  
   	 	}
     
     public static void keyA() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_A);
   	  rob.keyRelease(KeyEvent.VK_A);
   	  
   	 	}
     
     public static void keyB() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_B);
   	  rob.keyRelease(KeyEvent.VK_B);
   	  
   	 	}
     
     public static void keyC() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_C);
   	  rob.keyRelease(KeyEvent.VK_C);
   	  
   	 	}
     
     public static void keyD() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_D);
   	  rob.keyRelease(KeyEvent.VK_D);
   	  
   	 	}
     
     public static void keyE() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_E);
   	  rob.keyRelease(KeyEvent.VK_E);
   	  
   	 	}
     
     public static void keyF() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_F);
   	  rob.keyRelease(KeyEvent.VK_F);
   	  
   	 	}
     
     public static void keyG() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_G);
   	  rob.keyRelease(KeyEvent.VK_G);
   	  
   	 	}
     
     public static void keyH() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_H);
   	  rob.keyRelease(KeyEvent.VK_H);
   	  
   	 	}
     
     public static void keyI() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_I);
   	  rob.keyRelease(KeyEvent.VK_I);
   	  
   	 	}
     
     public static void keyJ() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_J);
   	  rob.keyRelease(KeyEvent.VK_J);
   	  
   	 	}
     
     public static void keyK() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_K);
   	  rob.keyRelease(KeyEvent.VK_K);
   	  
   	 	}
     
     public static void keyL() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_L);
   	  rob.keyRelease(KeyEvent.VK_L);
   	  
   	 	}
     
     public static void keyM() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_M);
   	  rob.keyRelease(KeyEvent.VK_M);
   	  
   	 	}
     
     public static void keyN() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_N);
   	  rob.keyRelease(KeyEvent.VK_N);
   	  
   	 	}
     
     public static void keyO() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_O);
   	  rob.keyRelease(KeyEvent.VK_O);
   	  
   	 	}
     
     public static void keyP() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_P);
   	  rob.keyRelease(KeyEvent.VK_P);
   	  
   	 	}
     
     public static void keyQ() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_Q);
   	  rob.keyRelease(KeyEvent.VK_Q);
   	  
   	 	}
     
     public static void keyR() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_R);
   	  rob.keyRelease(KeyEvent.VK_R);
   	  
   	 	}
     
     public static void keyS() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_S);
   	  rob.keyRelease(KeyEvent.VK_S);
   	  
   	 	}
     
     public static void keyT() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_T);
   	  rob.keyRelease(KeyEvent.VK_T);
   	  
   	 	}
     
     public static void keyU() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_U);
   	  rob.keyRelease(KeyEvent.VK_U);
   	  
   	 	}
     
     public static void keyV() throws AWTException {

   	  Robot rob = new Robot();
   	  
   	  rob.keyPress(KeyEvent.VK_V);
   	  rob.keyRelease(KeyEvent.VK_V);
   	  
   	 	}
     
     public static void keyW() throws AWTException {

      	  Robot rob = new Robot();
      	  
      	  rob.keyPress(KeyEvent.VK_W);
      	  rob.keyRelease(KeyEvent.VK_W);
      	  
      	 	}
     
     public static void keyX() throws AWTException {

      	  Robot rob = new Robot();
      	  
      	  rob.keyPress(KeyEvent.VK_X);
      	  rob.keyRelease(KeyEvent.VK_X);
      	  
      	 	}
     
     public static void keyY() throws AWTException {

      	  Robot rob = new Robot();
      	  
      	  rob.keyPress(KeyEvent.VK_Y);
      	  rob.keyRelease(KeyEvent.VK_Y);
      	  
      	 	}
     
     public static void keyZ() throws AWTException {

      	  Robot rob = new Robot();
      	  
      	  rob.keyPress(KeyEvent.VK_Z);
      	  rob.keyRelease(KeyEvent.VK_Z);
      	  
      	 	}
     
     public static void keyat() throws AWTException {

      	  Robot rob = new Robot();
      	  
      	  rob.keyPress(KeyEvent.VK_AT);
      	  rob.keyRelease(KeyEvent.VK_AT);
      	  
      	 	}
     
     public static void keycomma() throws AWTException {

      	  Robot rob = new Robot();
      	  
      	  rob.keyPress(KeyEvent.VK_COMMA);
      	  rob.keyRelease(KeyEvent.VK_COMMA);
      	  
      	 	}
     
     public static void keycapslock() throws AWTException {

      	  Robot rob = new Robot();
      	  
      	  rob.keyPress(KeyEvent.VK_CAPS_LOCK);
      	  rob.keyRelease(KeyEvent.VK_CAPS_LOCK);
      	  
      	 	}
  //JAVASCRIPT METHODS
     
        public static void javascript_Click(WebDriver d, WebElement Web) {

        	JavascriptExecutor js = (JavascriptExecutor) d;
        	
        	js.executeScript("arguments[0].click()", Web);
        	
        	
		}
        
        public static void javascript_value(WebDriver d, WebElement Web, String value) {

        	JavascriptExecutor js = (JavascriptExecutor) d;
        	
        	js.executeScript(value, Web);
        	
        	
		}

        public static void javascript_Scroll(WebDriver d, WebElement Web) {

        	JavascriptExecutor js = (JavascriptExecutor) d;
        	
        	js.executeScript("arguments[0].scrollIntoView()", Web);
        	
        	
		}

//TakesScreenshot Method        
        
        public static void screenshot(WebDriver d , String path) throws IOException {
       
        	TakesScreenshot ts = (TakesScreenshot) d;
        	File source = ts.getScreenshotAs(OutputType.FILE);
        	File destination = new File(path);
        	FileUtils.copyFile(source, destination);
}




}
