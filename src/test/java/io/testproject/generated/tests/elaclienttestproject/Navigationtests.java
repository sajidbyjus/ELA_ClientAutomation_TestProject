package io.testproject.generated.tests.elaclienttestproject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;


/**
 * This class was automatically generated by TestProject
 * Project: ELA
 * Test: Navigation_Tests
 * Generated by: ankur vishwakarma (ankur.vishwakarma@byjus.com)
 * Generated on Mon Sep 27 04:38:24 GMT 2021.
 */
@DisplayName("Navigation_Tests")
public class Navigationtests implements ExceptionsReporter {
  public static AndroidDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new AndroidDriver<>("20babRpkoMKKPF3XgH7Lf5kNNj30iavd2KiId-blPKk", getCapabilities(), "ankur vishwakarma");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("Navigation_Tests")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String mobilenumber) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;

    // 1. Reset App
    //    Clear application data and restart (Auto-generated)
    GeneratedUtils.sleep(500);
    driver.resetApp();

    // 2. Click 'Got it'
    GeneratedUtils.sleep(500);
    by = By.id("android:id/ok");
    driver.findElement(by).click();

    // 3. Click 'Got it'
    GeneratedUtils.sleep(500);
    by = By.id("android:id/ok");
    driver.findElement(by).click();

    // 4. Click 'com.android.permissioncontroller:id/g...'
    GeneratedUtils.sleep(500);
    by = By.id("com.android.permissioncontroller:id/grant_singleton");
    driver.findElement(by).click();

    // 5. Click 'Mobile number'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.EditText[@text = 'Mobile number']");
    driver.findElement(by).click();

    // 6. Type '{{mobilenumber}}' in 'Mobile number'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.EditText[@text = 'Mobile number']");
    driver.findElement(by).sendKeys(mobilenumber);

    // 7. Click 'Send OTP'
    GeneratedUtils.sleep(500);
    by = By.id("com.byjus.tle.staging:id/btnSendOtp");
    driver.findElement(by).click();

    // 8. Click 'com.byjus.tle.staging:id/otpInputEdit...'
    GeneratedUtils.sleep(500);
    by = By.id("com.byjus.tle.staging:id/otpInputEditText");
    driver.findElement(by).click();

    // 9. Type '8438' in 'com.byjus.tle.staging:id/otpInputEdit...'
    GeneratedUtils.sleep(500);
    by = By.id("com.byjus.tle.staging:id/otpInputEditText");
    driver.findElement(by).sendKeys("8438");

    // 10. Click 'com.byjus.tle.staging:id/profileSelec...'
    GeneratedUtils.sleep(500);
    by = By.id("com.byjus.tle.staging:id/profileSelectionItem");
    driver.findElement(by).click();

    // 11. Click 'Grade'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.FrameLayout[4]//android.widget.TextView[@text = 'Grade']");
    driver.findElement(by).click();

    // 12. Click '4th'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = '4th']");
    driver.findElement(by).click();

    // 13. Click 'com.byjus.tle.staging:id/selectionBac...'
    GeneratedUtils.sleep(500);
    by = By.id("com.byjus.tle.staging:id/selectionBackground");
    driver.findElement(by).click();

    // 14. Click 'com.byjus.tle.staging:id/selectionBac...'
    GeneratedUtils.sleep(500);
    by = By.id("com.byjus.tle.staging:id/selectionBackground");
    driver.findElement(by).click();

    // 15. Click 'Start Learning'
    GeneratedUtils.sleep(500);
    by = By.id("com.byjus.tle.staging:id/startLearningButton");
    driver.findElement(by).click();

    // 16. Click 'Student'
    GeneratedUtils.sleep(500);
    by = By.id("com.byjus.tle.staging:id/buttonStudent");
    driver.findElement(by).click();

    // 17. Click 'com.byjus.tle.staging:id/imgHamburger...'
    GeneratedUtils.sleep(500);
    by = By.id("com.byjus.tle.staging:id/imgHamburgerMenu");
    driver.findElement(by).click();

    // 18. Click 'com.byjus.tle.staging:id/imgHamburger...'
    GeneratedUtils.sleep(500);
    by = By.id("com.byjus.tle.staging:id/imgHamburgerMenu");
    driver.findElement(by).click();

    // 19. Click 'com.byjus.tle.staging:id/imgHamburger...'
    GeneratedUtils.sleep(500);
    by = By.id("com.byjus.tle.staging:id/imgHamburgerMenu");
    driver.findElement(by).click();

    // 20. Click 'Library'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'Library']");
    driver.findElement(by).click();

    // 21. Tap at ('536','2023') with '1' fingers for '100'ms
    GeneratedUtils.sleep(500);
    MultiTouchAction multiTouch = new MultiTouchAction((driver));
        for (int i = 0; i < 1; i++) {
        	multiTouch.add((new TouchAction(((AppiumDriver<WebElement>) driver))).press(PointOption.point(536, 2023))
        			.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100))).release());
        }
        multiTouch.perform();

    // 22. Click 'ANDROIDX.APPCOMPAT.WIDGET.LINEARLAYOU...'
    GeneratedUtils.sleep(500);
    by = By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[7]");
    driver.findElement(by).click();

    // 23. Click 'com.byjus.tle.staging:id/libraryThumb...'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]//android.widget.ImageView[1]");
    driver.findElement(by).click();

    // 24. Click 'oval-regular.f573c8d4'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.Image[@text = 'oval-regular.f573c8d4']");
    driver.findElement(by).click();

    // 25. Click 'ANDROID.WIDGET.IMAGE'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.view.View[2]/android.widget.Image");
    driver.findElement(by).click();

    // 26. Click 'com.byjus.tle.staging:id/libraryItemI...'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]//android.widget.ImageView[2]");
    driver.findElement(by).click();

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of("9108538438"));
  }

  public static DesiredCapabilities getCapabilities() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
    capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.byjus.tle.staging");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.byjus.ela.splash.activity.SplashActivity");
    return capabilities;
  }
}
