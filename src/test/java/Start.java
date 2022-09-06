import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Start {

    WebDriver wd;

    @Test
    public void goToPhoneBook() {
        //open browser
        wd = new ChromeDriver();
        //go to phoneBook
        // wd.get("https://contacts-app.tobbymarshall815.vercel.app/");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        //close browser
        // wd.close();
        wd.quit();

    }
        @Test
        public void loinTest() {

            wd = new ChromeDriver();
            //wd=new FirefoxDriver();
            wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
            // open loginPage :find loginTab + click
            //fill email  : find ElementEmail + type "email"
            //fill password :find ElementPassword + type "password"
            // login submit : find login button _ click
            // Assert (ex res=ac res)


         WebElement element = wd.findElement(By.tagName("h1"));
         element.click();

         List<WebElement> list = wd.findElements(By.tagName("h1"));
         WebElement element1= list.get(1);


        //By id
        wd.findElement(By.id("root"));

        //By class
             wd.findElement(By.className("container"));


           //
            //By.ccSelector

            wd.findElement(By.cssSelector("h1"));
            //by id
           wd.findElement(By.cssSelector("#root")) ;
//by class
            wd.findElement(By.cssSelector(".container")) ;

            wd.findElement(By.cssSelector("[href='/home']")) ;






         wd.quit();

    }
@Test
    public void homework(){
        wd = new ChromeDriver();
        wd.navigate().to("file:///Users/yanarieznik/Downloads/index%20(1).html");

        WebElement item1 = wd.findElement(By.cssSelector("a[href='#item1']"));
    WebElement item2 = wd.findElement(By.cssSelector("a[href='#item2']"));
    WebElement item3 = wd.findElement(By.cssSelector("a[href='#item3']"));
    WebElement item4 = wd.findElement(By.cssSelector("a[href='#item4']"));
    WebElement name = wd.findElement(By.cssSelector("[name=name]"));
    WebElement serename = wd.findElement(By.cssSelector("[name=surename]"));
    WebElement send = wd.findElement(By.cssSelector(".btn"));

    WebElement poland = wd.findElement(By.cssSelector("tr:nth-child(2)"));




}


}
