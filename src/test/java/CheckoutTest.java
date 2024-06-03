import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners(ExtentTestNGITestListener.class)

public class CheckoutTest extends Hooks {

    public CheckoutPage checkoutPage;
    public WebDriverWait wait;

    @BeforeMethod
    public void SetupPageObject() {
        checkoutPage = new CheckoutPage(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @Test(description = "Testing functionality and checkoutTest for Awesome Granite Chips ")
    public void checkoutAwesomeGraniteChipsTest() throws InterruptedException {
        checkoutPage.clickAwesomeGraniteChipsLink();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickSvgShoppingCart();
        checkoutPage.clickCheckoutButton();
        checkoutPage.enterFirstName("Manu");
        checkoutPage.enterLastName("Tom");
        checkoutPage.enterAddress("234 London st");
        checkoutPage.clickContinueCheckoutButton();
        checkoutPage.clickCompleteOrderLink();
        assertEquals(checkoutPage.getOrderConfirmationMessage().getText(), "Thank you for your order!");
    }

    @Test(description = "Testing functionality and checkoutTest for Awesome Metal Chair product ")
    public void checkoutAwesomeMetalChairTest() throws InterruptedException {
        checkoutPage.clickAwesomeMetalChair();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickSvgShoppingCart();
        checkoutPage.clickCheckoutButton();
        checkoutPage.enterFirstName("Manu");
        checkoutPage.enterLastName("Tom");
        checkoutPage.enterAddress("234 London st");
        checkoutPage.clickContinueCheckoutButton();
        checkoutPage.clickCompleteOrderLink();
        assertEquals(checkoutPage.getOrderConfirmationMessage().getText(), "Thank you for your order!");
    }

    @Test(description = "Testing functionality and checkoutTest for Awesome Soft Shirt product ")
    public void checkoutAwesomeSoftShirtTest() throws InterruptedException {
        checkoutPage.clickAwesomeSoftShirt();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickSvgShoppingCart();
        checkoutPage.clickCheckoutButton();
        checkoutPage.enterFirstName("Manu");
        checkoutPage.enterLastName("Tom");
        checkoutPage.enterAddress("234 London st");
        checkoutPage.clickContinueCheckoutButton();
        checkoutPage.clickCompleteOrderLink();
        assertEquals(checkoutPage.getOrderConfirmationMessage().getText(), "Thank you for your order!");
    }

    @Test(description = "Testing functionality and checkoutTest for Gorgeous Soft Pizza product ")
    public void checkoutGorgeousSoftPizzaTest() throws InterruptedException {
        checkoutPage.clickGorgeousSoftPizza();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickSvgShoppingCart();
        checkoutPage.clickCheckoutButton();
        checkoutPage.enterFirstName("Manu");
        checkoutPage.enterLastName("Tom");
        checkoutPage.enterAddress("234 London st");
        checkoutPage.clickContinueCheckoutButton();
        checkoutPage.clickCompleteOrderLink();
        assertEquals(checkoutPage.getOrderConfirmationMessage().getText(), "Thank you for your order!");
    }

    @Test(description = "Testing functionality and checkoutTest for Incredible Concrete Hat product ")
    public void checkoutIncredibleConcreteHatTest() throws InterruptedException {
        checkoutPage.clickIncredibleConcreteHat();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickSvgShoppingCart();
        checkoutPage.clickCheckoutButton();
        checkoutPage.enterFirstName("Manu");
        checkoutPage.enterLastName("Tom");
        checkoutPage.enterAddress("234 London st");
        checkoutPage.clickContinueCheckoutButton();
        checkoutPage.clickCompleteOrderLink();
        assertEquals(checkoutPage.getOrderConfirmationMessage().getText(), "Thank you for your order!");
    }

    @Test(description = "Testing functionality and checkoutTest for Licensed Steel Gloves product ")
    public void checkoutLicensedSteelGlovesTest() throws InterruptedException {
        checkoutPage.clickLicensedSteelGloves();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickSvgShoppingCart();
        checkoutPage.clickCheckoutButton();
        checkoutPage.enterFirstName("Manu");
        checkoutPage.enterLastName("Tom");
        checkoutPage.enterAddress("234 London st");
        checkoutPage.clickContinueCheckoutButton();
        checkoutPage.clickCompleteOrderLink();
        assertEquals(checkoutPage.getOrderConfirmationMessage().getText(), "Thank you for your order!");
    }

    @Test(description = "Testing functionality and checkoutTest for Practical Metal Mouse product ")
    public void checkoutPracticalMetalMouseTest() throws InterruptedException {
        checkoutPage.clickPracticalMetalMouse();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickSvgShoppingCart();
        checkoutPage.clickCheckoutButton();
        checkoutPage.enterFirstName("Manu");
        checkoutPage.enterLastName("Tom");
        checkoutPage.enterAddress("234 London st");
        checkoutPage.clickContinueCheckoutButton();
        checkoutPage.clickCompleteOrderLink();
        assertEquals(checkoutPage.getOrderConfirmationMessage().getText(), "Thank you for your order!");
    }

    @Test(description = "Testing functionality and checkoutTest for Practical Wooden Bacon product ")
    public void checkoutPracticalWoodenBaconTest() throws InterruptedException {
        checkoutPage.clickPracticalWoodenBacon();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickSvgShoppingCart();
        checkoutPage.clickCheckoutButton();
        checkoutPage.enterFirstName("Manu");
        checkoutPage.enterLastName("Tom");
        checkoutPage.enterAddress("234 London st");
        checkoutPage.clickContinueCheckoutButton();
        checkoutPage.clickCompleteOrderLink();
        assertEquals(checkoutPage.getOrderConfirmationMessage().getText(), "Thank you for your order!");
    }

    @Test(description = "Testing functionality and checkoutTest for second  Practical Wooden Bacon product ")
    public void checkoutPracticalWoodenBacon1Test() throws InterruptedException {
        checkoutPage.clickPracticalWoodenBacon1();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickSvgShoppingCart();
        checkoutPage.clickCheckoutButton();
        checkoutPage.enterFirstName("Manu");
        checkoutPage.enterLastName("Tom");
        checkoutPage.enterAddress("234 London st");
        checkoutPage.clickContinueCheckoutButton();
        checkoutPage.clickCompleteOrderLink();
        assertEquals(checkoutPage.getOrderConfirmationMessage().getText(), "Thank you for your order!");
    }

    @Test(description = "Testing functionality and checkoutTest for Refined Frozen Mouse product ")
    public void checkoutRefinedFrozenMouseTest() throws InterruptedException {
        checkoutPage.clickRefinedFrozenMouse();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickSvgShoppingCart();
        checkoutPage.clickCheckoutButton();
        checkoutPage.enterFirstName("Manu");
        checkoutPage.enterLastName("Tom");
        checkoutPage.enterAddress("234 London st");
        checkoutPage.clickContinueCheckoutButton();
        checkoutPage.clickCompleteOrderLink();
        assertEquals(checkoutPage.getOrderConfirmationMessage().getText(), "Thank you for your order!");
    }

    @Test(description = "Testing functionality and checkoutTest for two product to cart ")
    public void checkoutTwoProductTest() throws InterruptedException {
        checkoutPage.clickAwesomeSoftShirt();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickShoppingBagIcon();
        checkoutPage.clickPracticalMetalMouse();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickSvgShoppingCart();
        checkoutPage.clickCheckoutButton();
        checkoutPage.enterFirstName("Manu");
        checkoutPage.enterLastName("Tom");
        checkoutPage.enterAddress("234 London st");
        checkoutPage.clickContinueCheckoutButton();
        checkoutPage.clickCompleteOrderLink();
        assertEquals(checkoutPage.getOrderConfirmationMessage().getText(), "Thank you for your order!");
    }

    @Test(description = "Testing functionality and checkoutTest for all product to cart ")
    public void checkoutAllProductTest() throws InterruptedException {
        checkoutPage.clickAwesomeGraniteChipsLink();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickShoppingBagIcon();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The product Awesome Granite Chips it is in cart");

        checkoutPage.clickAwesomeMetalChair();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickShoppingBagIcon();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The product Awesome MetalC hair it is in cart");

        checkoutPage.clickAwesomeSoftShirt();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickShoppingBagIcon();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The product Awesome Soft Shirt it is in cart");

        checkoutPage.clickGorgeousSoftPizza();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickShoppingBagIcon();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The product Gorgeous Soft Pizza it is in cart");

        checkoutPage.clickIncredibleConcreteHat();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickShoppingBagIcon();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The product Incredible Concrete Hat it is in cart");

        checkoutPage.clickLicensedSteelGloves();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickShoppingBagIcon();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The product Licensed Steel Gloves it is in cart");

        checkoutPage.clickPracticalMetalMouse();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickShoppingBagIcon();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The product PracticalMetalMouse it is in cart");

        checkoutPage.clickPracticalWoodenBacon();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickShoppingBagIcon();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The product Practical Wooden Bacon it is in cart");

        checkoutPage.clickPracticalWoodenBacon1();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickShoppingBagIcon();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The product Practical Wooden Bacon 1 it is in cart");

        checkoutPage.clickRefinedFrozenMouse();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickSvgShoppingCart();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The product Refined Frozen Mouse it is in cart");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "All products are in the cart");

        checkoutPage.clickCheckoutButton();
        checkoutPage.enterFirstName("Manu");
        checkoutPage.enterLastName("Tom");
        checkoutPage.enterAddress("234 London st");
        checkoutPage.clickContinueCheckoutButton();
        checkoutPage.clickCompleteOrderLink();
        assertEquals(checkoutPage.getOrderConfirmationMessage().getText(), "Thank you for your order!");
    }

    @Test(description = "Changing quantity test.Asserting that the price is updated correctly. ")
    public void quantityTest()  {
        checkoutPage.clickAwesomeGraniteChipsLink();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickSvgShoppingCart();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is: " + checkoutPage.productPrice());
        double expectedTotal = checkoutPage.productPrice() * 2;
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product after updating should be: " + expectedTotal);
        checkoutPage.clickPlusQuantity();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product after update is: " + checkoutPage.productPrice());
        assertEquals(checkoutPage.productPrice(),expectedTotal);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is matching the expected price");

    }

    @Test(description = "Calculating the price of a product with taxes ")
    public void totalPriceCalculationTest() {
        checkoutPage.clickAwesomeGraniteChipsLink();
        checkoutPage.clickSvgCartPlus();
        checkoutPage.clickSvgShoppingCart();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is: " + checkoutPage.productPrice());
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The tax of the product is: " + checkoutPage.taxPrice());
        double expectedTotal = checkoutPage.productPrice() + checkoutPage.taxPrice();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The expected total should be : " + expectedTotal);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The actual total is  : " + checkoutPage.totalPrice());
        assertEquals(checkoutPage.totalPrice(), expectedTotal);


    }



}
