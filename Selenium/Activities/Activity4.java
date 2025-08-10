import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/target-practice");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the 3rd header and print its text
        String thirdHeaderText = driver.findElement(By.xpath("//h3[contains(text(), '#3')]")).getText();
        System.out.println(thirdHeaderText);
        // Find the 5th header and print its color
        Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
        System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
        System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());

        // Find the violet button and print its classes
        String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
        System.out.println(purpleButtonClass);
        // Find the grey button and print its text
        String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
        System.out.println(slateButtonText);

        // Close the browser
        driver.quit();
    }
}

Activity 4
Python Solution:

# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.color import Color

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/target-practice")

    # Print the title of the page
    print("Page title is: ", driver.title)

    # Find the 3rd header element on the page using XPath
    third_heading = driver.find_element(By.XPATH, "//h3[contains(text(), '#3')]")
    print("Third heading text is: ", third_heading.text)

    # Find the 5th header element on the page using XPath
    fifth_heading_color = Color.from_string(driver.find_element(By.XPATH, "//h5[contains(text(), '#5')]").value_of_css_property("color"))
    print("Fifth heading colour as Hexcode: ", fifth_heading_color.hex)
    print("Fifth heading colour as RGB: ", fifth_heading_color.rgb)

    # Find the Purple button element on the page
    purple_button = driver.find_element(By.XPATH, "//button[text()='Purple']")
    print("Purple button's classes are: ", purple_button.get_attribute("class"))

    # Find the Slate button element on the page
    slate_button = driver.find_element(By.XPATH, "//button[contains(@class, 'slate')]")
    print("Text in slate button is: ", slate_button.text)

Verifying WebElements
isDisplayed() / is_displayed()

This method is used to check whether an element is displayed on a web page or not.
Returns true if the target element is displayed otherwise returns false.
driver.findElement(By.name("username")).isDisplayed();
driver.find_element(By.NAME, "username").is_displayed()


Verifying WebElements
isEnabled() / is_enabled()

It is used to check if the web element is enabled or disabled within the web page.
Returns “true” value if the specified web element is enabled on the web page
Returns “false” value if the web element is disabled on the web page.
driver.findElement(By.name("username")).isEnabled();
driver.find_element(By.NAME, "username").is_enabled()


Verifying WebElements
isSelected() / is_selected()

This method checks that if an element is selected on the web page or not.
Returns true if the element is selected.
Returns false if the element is not selected.
It can be executed only on a  radio button, checkboxes, etc.
driver.findElement(By.id("opt-in-checkbox")).isSelected();
driver.find_element(By.ID, "opt-in-checkbox").is_selected()


Activity 5
Python Solution:

# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/dynamic-controls")

    # Print the title of the page
    print("Page title is: ", driver.title)
    
	# Find the checkbox
    checkbox = driver.find_element(By.ID, "checkbox")
    # Find the checkbox toggle button
    checkbox_toggle = driver.find_element(By.XPATH, "//button[text()='Toggle Checkbox']")
    # Verify if the checkbox is displayed or not
    print("Checkbox is visible: ", checkbox.is_displayed())

    # Click the checkbox_toggle button to hide checkbox
    checkbox_toggle.click()
    # Verify again if the checkbox is displayed or not
    print("Checkbox is visible: ", checkbox.is_displayed())

22 . 2



