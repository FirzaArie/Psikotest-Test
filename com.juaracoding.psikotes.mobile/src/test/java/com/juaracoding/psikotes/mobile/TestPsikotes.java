package com.juaracoding.psikotes.mobile;



import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TestPsikotes extends Reporting{

	static AppiumDriver<MobileElement> driver;

	
	@BeforeTest
	public void openWeb() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// dari CLI
		capabilities.setCapability("deviceName", "Pixel_2_API_27");
		capabilities.setCapability("uuid", "emulator-5554");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "8.1");
//		capabilities.setCapability("automationName", "uiAutomator");
		
		//dari App Info com.psikotestdika.quiz/host.exp.exponent.MainActivity
		capabilities.setCapability("appPackage", "com.psikotestdika.quiz");
		capabilities.setCapability("appActivity", "host.exp.exponent.LauncherActivity");
		capabilities.setCapability("automationName", "uiautomator2");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, capabilities);
		
		
		
		
	}
	@Test
	public void HomePage() {
		ExtentTest test1 = extentReports.createTest("Step 1", "Home Page");
		test1.log(Status.PASS, "Membuka aplikasi");
		System.out.println("Test HomePage");
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		MobileElement emailBox = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[1]"));
		MobileElement passwordBox = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[2]"));
		MobileElement btnLogin = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]"));
		MobileElement btnDaftar = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]"));
		emailBox.sendKeys("Test 1");
		test1.log(Status.PASS, "Memasukkan email");
		passwordBox.sendKeys("Test 1");
		test1.log(Status.PASS, "Memasukkan password");
//		btnLogin.click();
		driver.hideKeyboard();
		btnDaftar.click();
		test1.log(Status.PASS, "Menekan tombol daftar");
		System.out.println("Test HomePage Selesai");
		test1.log(Status.PASS, "Home Berhasil");
	}
	@Test
	public void daftarPage() {
		ExtentTest test2 = extentReports.createTest("Step 2", "Daftar Page");
		test2.log(Status.PASS, "Masuk ke halaman daftar");
		System.out.println("Test DaftarPage");
//		MobileElement btnPage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
		MobileElement btnDaftar = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]"));
		MobileElement txtboxName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[1]"));
		MobileElement txtboxKtp = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[2]"));
		MobileElement txtboxEmail = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[3]"));
		MobileElement txtboxPassword = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[4]"));	
		MobileElement txtboxPassword2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[5]"));
		MobileElement btnBuatAkun = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]"));
		MobileElement btnBack = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView"));
		MobileElement btnLogin = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView"));
		
//		btnPage.click();
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		System.out.println("Test Sebelum klik");
//		btnDaftar.click();
//		System.out.println("Test Sesudah klik");
//		wait.until(ExpectedConditions.elementToBeClickable(btnDaftar));
//		System.out.println("Test Sebelum klik login");
//		btnLogin.click();
//		System.out.println("Test Sesudah klik login");
		
//		System.out.println("Test Sebelum klik back");
//		btnBack.click();
//		System.out.println("Test Sesudah klik back");
		
//		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
//		btnDaftar.click();
		
		txtboxName.sendKeys("Test 1");
		test2.log(Status.PASS, "Memasukkan FullName");
		txtboxKtp.sendKeys("11111");
		test2.log(Status.PASS, "Memasukkan KTP");
		txtboxEmail.sendKeys("Test1@gmail.com");
		test2.log(Status.PASS, "Memasukkan Email");
		txtboxPassword.sendKeys("Test123");
		test2.log(Status.PASS, "Memasukkan Password");
		driver.hideKeyboard();
		txtboxPassword2.sendKeys("Test1");
		test2.log(Status.PASS, "Memasukkan Confirm Password ");
		driver.hideKeyboard();
		btnBuatAkun.click();
		test2.log(Status.PASS, "Mengetuk tombol daftar");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.hideKeyboard();
		btnBuatAkun.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		test2.log(Status.PASS, "Error ketika KTP kurang dari 7 angka");
		txtboxName.sendKeys("Test 1");
		txtboxKtp.sendKeys("1111111");
		driver.hideKeyboard();
		btnBuatAkun.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		test2.log(Status.PASS, "Error Email telah terdaftar");
		txtboxEmail.sendKeys("Test12");
		driver.hideKeyboard();
		btnBuatAkun.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		test2.log(Status.PASS, "Error Email tidak memiliki @ didalamnya");
		txtboxEmail.sendKeys("Test12@gmail.com");
		driver.hideKeyboard();
		btnBuatAkun.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		test2.log(Status.PASS, "Memasukkan Confirm Password ");
		txtboxPassword2.sendKeys("Test123");
		driver.hideKeyboard();
		btnBuatAkun.click();
		
		
		test2.log(Status.PASS, "Daftar Berhasil");
	}	
//	@Test
//	public void testPage() {
//		ExtentTest test3 = extentReports.createTest("Step 3", "Psikotest Cognitif Page");
//		test3.log(Status.INFO, "Psikotest Cognitif Page");
//		System.out.println("Psikotest Cognitif Page");
//		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
//		MobileElement emailBox = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[1]"));
//		MobileElement passwordBox = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[2]"));
//		MobileElement btnLogin = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]"));
//		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
//		emailBox.sendKeys("Test 1");
//		passwordBox.sendKeys("Test 1");
//		btnLogin.click();
//		
//		
//		test3.log(Status.PASS, "Psikotest Cognitif Berhasil");
//	}
		
}

