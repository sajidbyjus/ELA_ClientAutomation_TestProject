package io.testproject.generated.tests.elaclienttestproject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
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
 * Test: LearningAnalysis_Launch_Chat_Screen
 * Generated by: ankur vishwakarma (ankur.vishwakarma@byjus.com)
 * Generated on Mon Sep 27 04:39:17 GMT 2021.
 */
@DisplayName("LearningAnalysis_Launch_Chat_Screen")
public class Learninganalysislaunchchatscreen implements ExceptionsReporter {
  public static AndroidDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new AndroidDriver<>("20babRpkoMKKPF3XgH7Lf5kNNj30iavd2KiId-blPKk", getCapabilities(), "ankur vishwakarma");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("LearningAnalysis_Launch_Chat_Screen")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute() throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    Login login;

    // 1. Re-Usable: Base Test can be used with different Test.
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    login = new Login();
    login.execute(driver);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 2. Click 'com.byjus.tle.staging:id/reports'
    GeneratedUtils.sleep(500);
    by = By.id("com.byjus.tle.staging:id/reports");
    driver.findElement(by).click();

    // 3. Is 'ELA User Progress' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.webkit.WebView[@text = 'ELA User Progress']");
    driver.findElement(by);

    // 4. Send key event '4'
    GeneratedUtils.sleep(500);
    driver.pressKey(new KeyEvent(Arrays.stream(AndroidKey.values()).filter(k -> k.getCode() == 4).findFirst().get()));

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
    return Stream.of(Arguments.of());
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
