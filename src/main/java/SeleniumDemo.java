
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.junit.jupiter.api.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SeleniumDemo {

    WebDriver driver;
    WebDriverWait wait;


    //constants
    static final String BASE_URL = "https://the-internet.herokuapp.com";


    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }


    @Test
    @DisplayName("first test")
    public void navigateTo() {
        driver.navigate().to(BASE_URL);
        WebElement pageSubTitle = driver.findElement(MainPage.PAGE_TITLE);
        assertTrue(pageSubTitle.isDisplayed(), "page subtitle is not displayed");

        WebElement addRemoveElements = driver.findElement(MainPage.ADD_REMOVE_ELEMENTS);
        addRemoveElements.click();

        WebElement addRemovePageTitle = driver.findElement(MainPage.ADD_REMOVE_TITLE);
        assertTrue(addRemovePageTitle.isDisplayed(), "add-remove page subtitle is not displayed");

        WebElement addElementButton = driver.findElement(MainPage.ADD_ELEMENT_BUTTON);
        addElementButton.click();

        WebElement deleteButton = driver.findElement(MainPage.DELETE_BUTTON);
        assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(MainPage.DELETE_BUTTON)).isDisplayed());

        driver.navigate().back();
        assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(MainPage.PAGE_TITLE)).isDisplayed(), "page subtitle is not displayed");

        WebElement checkboxesButton = driver.findElement(MainPage.CHECKBOXES_BUTTON);
        checkboxesButton.click();

        List<WebElement> checkboxes = driver.findElements(MainPage.CHECKBOXES_LIST);
        assertFalse(wait.until(ExpectedConditions.visibilityOf(checkboxes.get(0))).isSelected());
        assertTrue(wait.until(ExpectedConditions.visibilityOf(checkboxes.get(1))).isSelected());

        driver.navigate().back();
        assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(MainPage.PAGE_TITLE)).isDisplayed(), "page subtitle is not displayed");
        WebElement dropdownPage = driver.findElement(MainPage.DROPDOWN_PAGE);
        dropdownPage.click();
        WebElement dropdown = driver.findElement(MainPage.DROPDOWN);
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 2");
        assertTrue(select.getFirstSelectedOption().isDisplayed());
    }

    @Test
    @DisplayName("second test")
    public void navigateToDragAndDrop() {
        Actions actions = new Actions(driver);

        driver.navigate().to(BASE_URL);

        WebElement pageSubTitle = driver.findElement(MainPage.PAGE_TITLE);
        assertTrue(pageSubTitle.isDisplayed(), "page subtitle is not displayed");

        WebElement dragAndDropPage = driver.findElement(MainPage.DRAG_AND_DROP_PAGE);
        dragAndDropPage.click();

        WebElement source = driver.findElement(MainPage.DRAG_AND_DROP_SOURCE);
        WebElement target = driver.findElement(MainPage.DRAG_AND_DROP_TARGET);

        actions.dragAndDrop(source, target).perform();
    }

    @Test
    @DisplayName("third test")
    public void navigateToContextMenu() {
        Actions actions = new Actions(driver);
        driver.navigate().to(BASE_URL);
        WebElement pageSubTitle = driver.findElement(MainPage.PAGE_TITLE);
        assertTrue(pageSubTitle.isDisplayed(), "page subtitle is not displayed");

        WebElement contextMenuPage = driver.findElement(MainPage.CONTEXT_MENU_PAGE);
        contextMenuPage.click();

        WebElement hotSpot = driver.findElement(MainPage.HOTSPOT);
        actions.contextClick(hotSpot).perform();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        assertEquals("You selected a context menu", alert.getText());
        alert.accept();
    }

    @Test
    @DisplayName("fourth test")
    public void navigateToModal() {
       dasdsadsadasda

        Wasdasdasdads

        WebElementasdasdsa), "modal is not displayed");
        WebElement modalCloseButton = driver.findElement(MainPage.MODAL_CLOSE_BUTTON);
        modalCloseButton.click();

xcvxcvcx
asdfasdfasd
asdasd    }
    asdads

}
