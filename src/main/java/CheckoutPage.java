import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Double.parseDouble;


public class CheckoutPage extends BasePage {

    public WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {

        super(driver);
        wait = new WebDriverWait(driver, 30);
    }

    @FindBy(linkText = "Awesome Granite Chips")
    private WebElement linkAwesomeGraniteChips;

    public void clickAwesomeGraniteChipsLink() {
        linkAwesomeGraniteChips.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement svgCartPlus;

    public void clickSvgCartPlus() {
        svgCartPlus.click();
    }

    @FindBy(css = "svg.svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement svgShoppingCart;

    public void clickSvgShoppingCart() {
        svgShoppingCart.click();
    }

    @FindBy(css = "a.btn.btn-success")
    private WebElement checkoutButton;

    public void clickCheckoutButton() {
        checkoutButton.click();
    }

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    public void enterFirstName(String firstName) {
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);
    }

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    public void enterLastName(String lastName) {
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);
    }

    @FindBy(id = "address")
    private WebElement addressTextarea;

    public void enterAddress(String address) {
        addressTextarea.clear();
        addressTextarea.sendKeys(address);
    }

    @FindBy(css = "button.btn.btn-success")
    private WebElement continueCheckoutButton;

    public void clickContinueCheckoutButton() {
        continueCheckoutButton.click();
    }

    @FindBy(css = "a.btn.btn-success")
    private WebElement completeOrderLink;

    public void clickCompleteOrderLink() {
        completeOrderLink.click();
    }

    @FindBy(css = "div.text-center")
    private WebElement orderConfirmationMessage;

    public WebElement getOrderConfirmationMessage() {
        return orderConfirmationMessage;
    }

    @FindBy(linkText = "Awesome Metal Chair")
    private WebElement awesomeMetalChair;

    public void clickAwesomeMetalChair() {
        awesomeMetalChair.click();
    }

    @FindBy(linkText = "Awesome Soft Shirt")
    private WebElement awesomeSoftShirt;

    public void clickAwesomeSoftShirt() {
        awesomeSoftShirt.click();
    }

    @FindBy(linkText = "Gorgeous Soft Pizza")
    private WebElement gorgeousSoftPizza;

    public void clickGorgeousSoftPizza() {
        gorgeousSoftPizza.click();
    }

    @FindBy(linkText = "Incredible Concrete Hat")
    private WebElement incredibleConcreteHat;

    public void clickIncredibleConcreteHat() {
        incredibleConcreteHat.click();
    }

    @FindBy(linkText = "Licensed Steel Gloves")
    private WebElement licensedSteelGloves;

    public void clickLicensedSteelGloves() {
        licensedSteelGloves.click();
    }

    @FindBy(linkText = "Practical Metal Mouse")
    private WebElement practicalMetalMouse;

    public void clickPracticalMetalMouse() {
        practicalMetalMouse.click();
    }

    @FindBy(linkText = "Practical Wooden Bacon")
    private WebElement practicalWoodenBacon;

    public void clickPracticalWoodenBacon() {
        practicalWoodenBacon.click();
    }

    @FindBy(css = "a.card-link[href='#/product/6']")
    private WebElement practicalWoodenBacon1;

    public void clickPracticalWoodenBacon1() {
        practicalWoodenBacon1.click();
    }

    @FindBy(linkText = "Refined Frozen Mouse")
    private WebElement refinedFrozenMouse;

    public void clickRefinedFrozenMouse() {
        refinedFrozenMouse.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement shoppingBagIcon;

    public void clickShoppingBagIcon() {
        shoppingBagIcon.click();
    }

    @FindBy(xpath = "(//td[@class='amount'])[1]")
    private WebElement itemPrice;

    @FindBy(xpath = "(//td[@class='amount'])[2]")
    private WebElement taxPrice;

    @FindBy(xpath = "(//td[@class='amount'])[3]")
    private WebElement totalPrice;

    public double productPrice() {
        String amountValue = itemPrice.getText();
        String cleanAmountValue = amountValue.replace("$", "");
        return parseDouble(cleanAmountValue);
    }

    public double taxPrice() {
        String taxValue = taxPrice.getText();
        String cleanTaxValue = taxValue.replace("$", "");
        return parseDouble(cleanTaxValue);
    }

    public double totalPrice() {
        String totalValue = totalPrice.getText();
        String cleanTotalValue = totalValue.replace("$", "");
        return parseDouble(cleanTotalValue);
    }

    @FindBy(css = ".svg-inline--fa.fa-plus-circle.fa-w-16")
    private WebElement plusQuantity;

    public void clickPlusQuantity() {
        plusQuantity.click();
    }


    public void selectOption(WebElement element, String option) {
        Select optionSelect = new Select(element);
        optionSelect.selectByVisibleText(option);
    }

}
