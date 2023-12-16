import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main{

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://Selenium jars and drivers//drivers//chromedriver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("https://www.makemytrip.com/flights/");
        Thread.sleep(2000);

        driver.manage().window().maximize();

        WebElement clickRoundTrip = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[1]/ul/li[2]"));
        clickRoundTrip.click();
        Thread.sleep(2000);

        WebElement toCity = driver.findElement(By.id("toCity"));
        toCity.sendKeys("Mumbai");
        toCity.sendKeys(Keys.DOWN);
        Thread.sleep(2000);

        WebElement toCityClick = driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]"));
        toCityClick.click();
        Thread.sleep(2000);



        WebElement element = driver.findElement(By.tagName("body"));
        element.sendKeys("\uE015"); // Arrow Down key


        WebElement traveller = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[5]"));
        traveller.click();

        WebElement businessClass = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[2]/li[3]"));
        businessClass.click();
        Thread.sleep(2000);

        WebElement apply = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[5]/div[2]/div[2]/button"));
        apply.click();
        Thread.sleep(2000);

        WebElement doctor = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/ul/li[5]"));
        doctor.click();
        Thread.sleep(2000);

        driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-15/12/2023_BOM-DEL-16/12/2023&tripType=R&paxType=A-1_C-0_I-0&intl=false&cabinClass=B&ccde=IN&lang=eng&pft=DOCTOR");
        Thread.sleep(15000);

        WebElement closeButton = driver.findElement(By.xpath("//button[@class='button buttonSecondry buttonBig fontSize12 relative']"));
        closeButton.click(); // Close the ad by clicking the close button
        Thread.sleep(2000);

        WebElement nonStop = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div[1]/label/span"));
        nonStop.click();
        Thread.sleep(10000);

    	      driver.quit();
    }
}