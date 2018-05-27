package cn.mycloudx.readinglist;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,properties ="application.yml")
@ActiveProfiles("development")
public class ReadinglistApplicationTests {

    @Value("${local.server.port}")
    private int port;

    private static SafariDriver browser;


    @BeforeClass
    public static void openBrowser() {
        browser = new SafariDriver();
        browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }


    @AfterClass
    public static void closeBrowser() {

    }


    @Test
    public void contextLoads() {

    }


    @Test
    public void addBookToEmptyList() {
        String baseUrl = "http://localhost:" + port+"/reader";
        browser.get(baseUrl);
        assertEquals("You have no books in your book list".trim(), browser.findElementByTagName("div").getText().trim());
        browser.findElementByName("title").sendKeys("BOOK TITLE");
        browser.findElementByName("author").sendKeys("BOOK AUTHOR");
        browser.findElementByName("isbn").sendKeys("1234567890");
        browser.findElementByName("description").sendKeys("DESCRIPTION");
        browser.findElementByTagName("form").submit();

        WebElement dl = browser.findElementByCssSelector("dt.bookHeadline");
        assertEquals("BOOK TITLE by BOOK AUTHOR (ISBN: 1234567890)", dl.getText());
        WebElement dt = browser.findElementByCssSelector("dd.bookDescription");
        assertEquals("DESCRIPTION", dt.getText());
    }
}
