import org.openqa.selenium.By;

public class MainPage {
    //By locators
     static final By PAGE_TITLE = By.xpath("//*[@id=\"content\"]/h2");
     static final By ADD_REMOVE_ELEMENTS = By.xpath("//a[normalize-space()='Add/Remove Elements']");
     static final By ADD_REMOVE_TITLE = By.xpath("//h3[normalize-space()='Add/Remove Elements']");
     static final By ADD_ELEMENT_BUTTON = By.xpath("//button[@onclick='addElement()']");
     static final By DELETE_BUTTON = By.xpath("//button[@class='added-manually']");
     static final By CHECKBOXES_BUTTON = By.xpath("//a[normalize-space()='Checkboxes']");
     static final By CHECKBOXES_LIST = By.cssSelector("#checkboxes input[type='checkbox']");
     static final By DROPDOWN_PAGE = By.xpath("//a[normalize-space()='Dropdown']");
     static final By DROPDOWN = By.id("dropdown");
     static final By DRAG_AND_DROP_PAGE = By.xpath("//a[normalize-space()='Drag and Drop']");
     static final By DRAG_AND_DROP_SOURCE = By.xpath("//div[@id='column-a']");
     static final By DRAG_AND_DROP_TARGET = By.xpath("//div[@id='column-b']");
     static final By CONTEXT_MENU_PAGE = By.xpath("//a[normalize-space()='Context Menu']");
     static final By HOTSPOT = By.id("hot-spot");
     static final By ENTRY_AD_PAGE = By.xpath("//a[normalize-space()='Entry Ad']");
     static final By AD_MODAL = By.cssSelector("#modal");
     static final By MODAL_CLOSE_BUTTON = By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p");


}
