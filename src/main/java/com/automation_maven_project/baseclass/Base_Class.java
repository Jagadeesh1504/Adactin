package com.automation_maven_project.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
//Class Variables:	
	public static WebDriver driver;
	public static WebElement element;
	public static String attributevalue;
	public static int size;
		
//   Methods:
//  --------	
	
//1. Browser Launch and maximize
	public static WebDriver getBrowser(String type) {
		if(type.equalsIgnoreCase("chrome")||type.equalsIgnoreCase("Chrome Browser")||type.equalsIgnoreCase("ChromeBrowser")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			}
		else if (type.equalsIgnoreCase("firefox")) {
			try {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			} catch(Exception e) {
				System.out.println("Firefox Driver Not Downloaded Please Download.\n ");
				}
		}
		else if (type.equalsIgnoreCase("IE")||type.equalsIgnoreCase("internet explorer")) {
			try {
			System.setProperty("webdriver.ie.driver", 
					System.getProperty("user.dir")+"\\Driver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		       }	catch(Exception e) {
				System.out.println("IE Driver Not Downloaded Please Download. \n");
			}
		}
		driver.manage().window().maximize();
		return driver;
	}
//2. Close
	public static void close() {
			driver.close();
	}
//3.Quit
	public static void quit() {
		    driver.quit();
	}
//4.getURL
	public static void getUrl(String s) {
			driver.get(s);
		}
//5.refresh
	public static void refresh() {
		    driver.navigate().refresh();
	}
//6.Navigate to
	public static void navigateTo(String s) {
		   driver.navigate().to(s);
	}
//7.back
	public static void back() {
		driver.navigate().back();
	}
//8.Forward
	public static void forward() {
		driver.navigate().forward();
	}
//9.Wait
		public static void sleep(long m) throws InterruptedException {
			Thread.sleep(m);
   }	
//10.getTitle
		public static void getTitle() {
			String title = driver.getTitle();
		    System.out.println("\nTitle:" +title);
	}
//11.getCurrentUrl
		public static void getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
		    System.out.println("\nCurrent Url: " + currentUrl);
		}
//12.FindElementbyxpath		
		public static WebElement findElementbyxpath(String s) {
			WebElement element = driver.findElement(By.xpath(s));
			return element;
		}
//13.FindElementbyid	
		public static WebElement findElementbyid(String s) {
			WebElement element = driver.findElement(By.id(s));
			return element;
		}
//14.FindElementbyname
		public static WebElement findElementbyname(String s) {
			WebElement element = driver.findElement(By.name(s));
			return element;
		}
//15.Click On Element	
	public static void clickOnElement(WebElement element)	{
		element.click();
	}
//16.Input Value Element
	public static void inputValueElement(WebElement i,String s) 	{
	   i.sendKeys(s);
	}
//17.Clear
	public static void clear(WebElement e) {
		e.clear();
	}	
//18.screenshot
	public static void screenshot(String name) throws IOException {
		 TakesScreenshot ts= (TakesScreenshot)driver;
		    File source=ts.getScreenshotAs(OutputType.FILE);
		    File destination=new File("C:\\Users\\Admin\\eclipse-workspace\\Automation_Maven_Project\\Screenshot"+"\\"+ name+".png");
		    FileUtils.copyFile(source, destination);
			}
//19.attributebyvalue
	public static String getattributebyvalue(WebElement e) {
		attributevalue = e.getAttribute("value");
		System.out.println("\nAttribute Value(Passed Input) : "+ attributevalue);
		return attributevalue;
	}
//20.AttributebyName
	public static String getattributebyname(WebElement e,String s) {
		attributevalue = e.getAttribute(s);
		System.out.println("\nAttribute Value for given Attribute Name "+ s +" is "+attributevalue);
		return attributevalue;
	}
//21.getText		
		public static void getText(WebElement E) {
			String textreturned=E.getText();
			System.out.println("Text Returned from Web Element : "+textreturned);
	}
//22. Is Selected
		public static void isSelected(WebElement e) {
			boolean selected = e.isSelected();
			System.out.println("\nIs Selected: "+ selected);
		}
//23.Is Displayed
		public static void isDisplayed(WebElement e) {
			boolean displayed = e.isDisplayed();
			System.out.println("\nIs Displayed: "+displayed);
		}
//24.Is Enabled
		public static void isEnabled(WebElement e) {
			boolean enabled = e.isDisplayed();
			System.out.println("\nIs Enabled: "+ enabled);
		}
//25.SelectByValue
		public static void selectByValue(WebElement e,String s) {
			Select s1=new Select(e);
		    s1.selectByValue(s);
		    
		}
//26.deselectByValue
		public static void deselectByValue(WebElement e,String s) {
			Select s1=new Select(e);
		    s1.deselectByValue(s);
		}
//27.selectByVisibleText		    
		    public static void selectByVisibleText(WebElement e,String s) {
				Select s1=new Select(e);
			    s1.selectByVisibleText(s);
		}
//28.deselectByVisibleText
		    public static void deselectByVisibleText(WebElement e,String s) {
				Select s1=new Select(e);
			    s1.deselectByVisibleText(s);
			}    
//29.selectByIndex
		    public static void selectByIndex(WebElement e,int i) {
				Select s1=new Select(e);
			    s1.selectByIndex(i);
		    }
//30.deselectByindex
			public static void deselectByIndex(WebElement e,int i) {
				Select s1=new Select(e);
			    s1.deselectByIndex(i);
			}
//31.isMultiple			 
		    public static void isMultiple(WebElement e) {
		    	Select s1=new Select(e);
			    boolean multiple = s1.isMultiple();
			    System.out.println("Is Multiple : "+multiple);
			}
//32.getOptions
		    public static void getoptions(WebElement e) {
		    	Select s1=new Select(e);
		        List<WebElement> options = s1.getOptions();
		        System.out.println("\nElements in the box are:");
		        for (WebElement webElement : options) {
		    	String text2 = webElement.getText();
		    	System.out.println(text2);
		        }
		    }
//33.sizeof list
		    public static int size(WebElement e) {
		    	Select s1=new Select(e);
		    	 List<WebElement> options = s1.getOptions();
		    	 int size = options.size();
		    	 return size;
			}
//34.AllSelectedOptions
		    public static void allSelectedOptions(WebElement e) {
		    	Select s1=new Select(e);
		    	 List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		 	    int sizeof = allSelectedOptions.size();
		 	    for(int i=0;i<sizeof;i++) {
		 	    	int j=i+1;
		 	       	String text3 = allSelectedOptions.get(i).getText();
		 	    	System.out.println(j+". "+text3);
		 	    }
		    }
//35.selectbyodd
		 	 public static void selectbyodd(WebElement e) {
		 	     Select s1=new Select(e);	
		 	    List<WebElement> options = s1.getOptions();
		 	   	 int size=options.size();
		 		      for(int i=0;i<size;i++) {
		 		    	   	if(i%2==1) {
		 		    		s1.selectByIndex(i);
		 		      	}
		 		}
		 	 }
//36.selectbyeven	
		    public static void selectbyeven(WebElement e) {
				 Select s1=new Select(e);	
				 List<WebElement> options = s1.getOptions();
				 int size=options.size();
				 for(int i=0;i<size;i++) {
				   if(i%2==0) {
				 	s1.selectByIndex(i);
				     	}
					}
		    }
//37.firstSelectOption
		    public static void firstSelectOption(WebElement e) {
		    	Select s1=new Select(e);
		    	WebElement firstSelectedOption = s1.getFirstSelectedOption();
		 	    String text4 = firstSelectedOption.getText();
		 	    System.out.println("\nFirst Selected Option:"+text4);
			}
//38.deselectAll
		    public static void deselectAll(WebElement e) {
		    	Select s1=new Select(e);
		    	s1.deselectAll();
		    }
//39.Alertaccept
		    	public static void  alertAccept() throws InterruptedException {
		    		Alert alert = driver.switchTo().alert();
		     		alert.accept();
		     		Thread.sleep(5000);
		     		System.out.println("\nSimple Alert Box accepted Successfully.\n");
				}
//40.AlertDismiss
		    	public static void alertDismiss() {
		    		Alert confirm_alert_cancel = driver.switchTo().alert();
		     		confirm_alert_cancel.dismiss();
				}
		    	
//41.AlertGetText		    	
		    	public static String alertGetText() {
		    		
		    		Alert confirm_alert_ok = driver.switchTo().alert();
		     		String text = confirm_alert_ok.getText();
		     		System.out.println("Text in the Alert Box: "+text);
		     		return text;
				}
//42.AlertSendKeys
		    	public static void alertSendKeys(String s) {
		    		Alert alert2 = driver.switchTo().alert();
		     		alert2.sendKeys(s);
				}
//43.Framebyindex
		    	public static void frameByIndex(int i) {
					driver.switchTo().frame(i);
				}
//44.Framebyname
		    	public static void frameByName(String s) {
					driver.switchTo().frame(s);		    	
		    	}
//45.Framebywebelement
		    	public static void frameByWebElement(WebElement s) {
					driver.switchTo().frame(s);
		    	}
//46.defaultContent
		    	public static void defaultContent() {
					driver.switchTo().defaultContent();

				}
//47.parentFrame
		    	public static void parentFrame() {
					driver.switchTo().parentFrame();

				}
//48.ActionsContextClick
		    	public static void actionsContextClick(WebElement we) {
		    		Actions a = new Actions(driver);
		    		a.contextClick(we).build().perform();
					
				}
//49.ActionsClick
		    	public static void actionsClick(WebElement we) {
		    		Actions a = new Actions(driver);
		    		a.click(we).build().perform();
					
				}
//50.Actionsdoubleclick
		    	public static void actionsDoubleClick(WebElement we) {
		    		Actions a = new Actions(driver);
		    		a.doubleClick(we).build().perform();
					
				}
//51.ActionsMovetoElement
		    	public static void actionsMovetoElement(WebElement we) {
		    		Actions a = new Actions(driver);
		    		a.moveToElement(we).build().perform();
					
				}
		    	
//52.ActionsDragAndDrop
		    	public static void actionsDragAndDrop(WebElement we,WebElement we1) {
		    		Actions a = new Actions(driver);
		    		a.dragAndDrop(we, we1).build().perform();
					
				}
		    	
//53.DownKey	
		    	public static void downKey() throws AWTException {
		    		Robot r = new Robot();
		    		r.keyPress(KeyEvent.VK_DOWN);
		    		r.keyRelease(KeyEvent.VK_DOWN);
		    		
				}
//54.DownKey	
		    	public static void upKey() throws AWTException {
		    		Robot r = new Robot();
		    		r.keyPress(KeyEvent.VK_UP);
		    		r.keyRelease(KeyEvent.VK_UP);
		    		
				}
//55.EnterKey	
		    	public static void enterKey() throws AWTException {
		    		Robot r = new Robot();
		    		r.keyPress(KeyEvent.VK_ENTER);
		    		r.keyRelease(KeyEvent.VK_ENTER);
				}	
//56.ScrollIntoViewJs
		    	public static void scrollIntoViewJs(WebElement e) {
		    		JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].scrollIntoView();", e);
				}
//57.clickbyJavaScript
		    	public static void clickbyJavaScript(WebElement e) {
		    		JavascriptExecutor js=(JavascriptExecutor)driver;
		    		js.executeScript("arguments[0].click();", e);
				}
//58.Implicit Wait
		    	public static void implicitWait(long i) {
		    		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
				}
//59.Explicit Wait
		    	public static void explicitWait(WebElement e,long i) {
		    		WebDriverWait wait=new WebDriverWait(driver, i);
		    		wait.until(ExpectedConditions.visibilityOf(e));
				}
//60.FluentWait
		    	public static void fluentWait(long i,long j) {
		    		Wait wait= new FluentWait(driver).withTimeout(i, TimeUnit.SECONDS)
		    				.pollingEvery(j,TimeUnit.SECONDS)
		    				.ignoring(Exception.class);
				}
//61.getAllWindowId	
		    	public static void getAllWindowId() {
		    		Set<String> all_id = driver.getWindowHandles();
					
					for (String id : all_id) {
						String title = driver.switchTo().window(id).getTitle();
						System.out.println(title);
										      }
					}
//62.switchToWindow
		    	public static void switchToWindow(String Actual) {
		    		Set<String> all_id = driver.getWindowHandles();
		    	 		for (String id : all_id) {
		    			if(driver.switchTo().window(id).getTitle().equals(Actual)) {
		      				break;
		    			}
				    }
		    	}	
//63.Esc key Robot
		    	public static void escKey() throws AWTException {
		    		Robot r = new Robot();
		    		r.keyPress(KeyEvent.VK_ESCAPE);
		    		r.keyRelease(KeyEvent.VK_ESCAPE);
				}
//64.delete key Robot	    	
		    	public static void deleteKey() throws AWTException {
		    		Robot r = new Robot();
		    		r.keyPress(KeyEvent.VK_DELETE);
		    		r.keyRelease(KeyEvent.VK_DELETE);
				}	
				
				
		    	
}




