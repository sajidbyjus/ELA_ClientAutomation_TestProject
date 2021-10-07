package io.testproject.generated.tests.elaclienttestproject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * This class was automatically generated by TestProject
 * Project: ELA
 * Test: Library_Comprehension_Test
 * Generated by: ankur vishwakarma (ankur.vishwakarma@byjus.com)
 * Generated on Mon Sep 27 04:39:59 GMT 2021.
 */
@DisplayName("Library_Comprehension_Test")
public class Librarycomprehensiontest implements ExceptionsReporter {
  public static AndroidDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new AndroidDriver<>("20babRpkoMKKPF3XgH7Lf5kNNj30iavd2KiId-blPKk", getCapabilities(), "ankur vishwakarma");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("Library_Comprehension_Test")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ContainsAll) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    Login login;

    // 1. Re-Usable: Base Test can be used with different Test.
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    login = new Login();
    login.execute(driver);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 2. Click 'com.byjus.tle.staging:id/imgHamburger...'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.id("com.byjus.tle.staging:id/imgHamburgerMenu");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 3. Click 'Library2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'Library']");
    driver.findElement(by).click();

    // 4. Does 'All' contain '{{ContainsAll}}'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'All']");
    Assertions.assertTrue(driver.findElement(by).getText().contains(ContainsAll));

    // 5. Is 'ANDROID.VIEW.VIEWGROUP' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//androidx.viewpager.widget.ViewPager/android.view.ViewGroup");
    driver.findElement(by);

    // 6. Is 'Comprehensions' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'Comprehensions']");
    driver.findElement(by);

    // 7. Click 'Comprehensions'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'Comprehensions']");
    driver.findElement(by).click();

    // 8. Click 'ANDROID.VIEW.VIEWGROUP1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.view.ViewGroup[2]//android.view.ViewGroup[1]");
    driver.findElement(by).click();

    // 9. Is 'The Hungry Bunnies' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.view.View[@text = 'The Hungry Bunnies']");
    driver.findElement(by);

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
    return Stream.of(Arguments.of("All"));
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
