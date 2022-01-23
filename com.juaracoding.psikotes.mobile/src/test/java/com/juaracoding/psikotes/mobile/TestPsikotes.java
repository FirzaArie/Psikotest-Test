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
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

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
//	@Test
//	public void HomePage() {
//		ExtentTest test1 = extentReports.createTest("Step 1", "Home Page");
//		test1.log(Status.INFO, "Home Page");
//		test1.log(Status.PASS, "Membuka aplikasi");
//		System.out.println("Test HomePage");
//		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
//		MobileElement emailBox 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[1]"));
//		MobileElement passwordBox 	= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[2]"));
//		MobileElement btnLogin 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]"));
//		MobileElement btnDaftar 	= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]"));
//		emailBox.sendKeys("Test 1");
//		test1.log(Status.PASS, "Memasukkan email");
//		passwordBox.sendKeys("Test 1");
//		test1.log(Status.PASS, "Memasukkan password");
//		driver.hideKeyboard();
//		btnDaftar.click();
//		test1.log(Status.PASS, "Menekan tombol daftar");
//		System.out.println("Test HomePage Selesai");
//		test1.log(Status.PASS, "Home Berhasil");
//	}
//	@Test
//	public void daftarPage() {
//		ExtentTest test2 = extentReports.createTest("Step 2", "Daftar Page");
//		test2.log(Status.INFO, "Daftar Page");
//		test2.log(Status.PASS, "Masuk ke halaman daftar");
//		System.out.println("Test DaftarPage");
////		MobileElement btnPage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
//		MobileElement btnDaftar 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]"));
//		MobileElement txtboxName 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[1]"));
//		MobileElement txtboxKtp 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[2]"));
//		MobileElement txtboxEmail 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[3]"));
//		MobileElement txtboxPassword 	= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[4]"));	
//		MobileElement txtboxPassword2 	= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[5]"));
//		MobileElement btnBuatAkun 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]"));
//		MobileElement btnBack 			= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView"));
//		MobileElement btnLogin 			= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView"));
//		
////		btnPage.click();
////		WebDriverWait wait = new WebDriverWait(driver, 10);
////		System.out.println("Test Sebelum klik");
////		btnDaftar.click();
////		System.out.println("Test Sesudah klik");
////		wait.until(ExpectedConditions.elementToBeClickable(btnDaftar));
////		System.out.println("Test Sebelum klik login");
////		btnLogin.click();
////		System.out.println("Test Sesudah klik login");
//		
////		System.out.println("Test Sebelum klik back");
////		btnBack.click();
////		System.out.println("Test Sesudah klik back");
//		
////		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
////		btnDaftar.click();
//		
//		txtboxName.sendKeys("Test 1");
//		test2.log(Status.PASS, "Memasukkan FullName");
//		txtboxKtp.sendKeys("11111");
//		test2.log(Status.PASS, "Memasukkan KTP");
//		txtboxEmail.sendKeys("Test1@gmail.com");
//		test2.log(Status.PASS, "Memasukkan Email");
//		txtboxPassword.sendKeys("Test123");
//		test2.log(Status.PASS, "Memasukkan Password");
//		driver.hideKeyboard();
//		txtboxPassword2.sendKeys("Test1");
//		test2.log(Status.PASS, "Memasukkan Confirm Password ");
//		driver.hideKeyboard();
//		btnBuatAkun.click();
//		test2.log(Status.PASS, "Mengetuk tombol daftar");
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.hideKeyboard();
//		btnBuatAkun.click();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		test2.log(Status.PASS, "Error ketika KTP kurang dari 7 angka");
//		txtboxName.sendKeys("Test 1");
//		txtboxKtp.sendKeys("1111116");
//		driver.hideKeyboard();
//		btnBuatAkun.click();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		test2.log(Status.PASS, "Error Email telah terdaftar");
//		txtboxEmail.sendKeys("Test12");
//		driver.hideKeyboard();
//		btnBuatAkun.click();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		test2.log(Status.PASS, "Error Email tidak memiliki @ didalamnya");
//		txtboxEmail.sendKeys("Test16@gmail.com");
//		driver.hideKeyboard();
//		btnBuatAkun.click();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		test2.log(Status.PASS, "Memasukkan Confirm Password ");
//		txtboxPassword2.sendKeys("Test123");
//		driver.hideKeyboard();
//		btnBuatAkun.click();
//		
//		
//		test2.log(Status.PASS, "Daftar Berhasil");
//	}	
	@Test
	public void signInPage() {
		ExtentTest test3 = extentReports.createTest("Step 3", "Sign In");
		test3.log(Status.INFO, "Sign In");
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		MobileElement emailBox 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[1]"));
		MobileElement passwordBox 	= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[2]"));
		MobileElement btnLogin 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]"));
		emailBox.sendKeys("Test12@gmail.com");
		passwordBox.sendKeys("Test123");
		btnLogin.click();
		test3.log(Status.PASS, "Error akun belum terdaftar");
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		emailBox.sendKeys("Tes@gmail.com");
		passwordBox.sendKeys("Test123");
		driver.hideKeyboard();
		btnLogin.click();
		test3.log(Status.PASS, "Error akun belum diaktifkan ");
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		emailBox.sendKeys("testing3@gmail.com");
		passwordBox.sendKeys("firzaarie");
		driver.hideKeyboard();
		btnLogin.click();
		test3.log(Status.PASS, "Akun yang telah terdaftar dan diaktifkan");
		
		test3.log(Status.PASS, "Sign In Berhasil");
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
	}
	@Test
	public void testPage() {
		ExtentTest test4 = extentReports.createTest("Step 4", "Test Page");
		test4.log(Status.INFO, "Test Page");
		MobileElement btnCognitif 			= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[1]"));
		MobileElement btnAccurate	 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[1]"));
		MobileElement btnProactive			= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
		MobileElement btnLogout 			= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
//		MobileElement btnBatalTest 			= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"));
//		MobileElement btnMulaiUjian 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"));
//		MobileElement btnAkhiriTest 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"));		
		MobileElement btnAkhiriTestIya 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]"));	
//		MobileElement btnAkhiriTestTidak	= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]"));	
	
		btnCognitif.click();
//		test4.log(Status.INFO, "Cognitif");
		MobileElement btnBatalTest 			= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"));
		
//		x500 y500 cognitif
//		x500 y1000 Accurate
//		x500 y1600 Procative
//		x525 y1685 Akhiri Test
//		Akhiri Test
		
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		btnBatalTest.click();
//		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
//		btnCognitif.click();
//		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
//		MobileElement btnMulaiUjian 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"));
//		btnMulaiUjian.click();
		test4.log(Status.PASS, "Tombol Pilihan Test Cognitif berhasil");
//		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//		
		TouchAction touchAction = new TouchAction(driver);
		int x = 525;
		int y = 1660;
		int count = 1;
//		touchAction.tap(TapOptions.tapOptions()
//		.withPosition(PointOption.point(x, y)).withTapsCount(count));
//		touchAction.perform();
		
//		MobileElement btnAkhiriTestIya 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]"));	
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		btnAkhiriTestIya.click();
//		test4.log(Status.PASS, "Menghentikan test cognitif berhasil");
//		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
//		
		btnAccurate.click();
		test4.log(Status.INFO, "Accurate");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		btnBatalTest.click();
//		test4.log(Status.PASS, "Tombol Batal Test Accurate berhasil");
//		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
//		btnAccurate.click();
//		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
//		btnMulaiUjian.click();
//		test4.log(Status.PASS, "Tombol Pilihan Test Accurate berhasil");
//		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
//		touchAction.tap(TapOptions.tapOptions()
//		.withPosition(PointOption.point(x, y)).withTapsCount(count));
//		touchAction.perform();
//		btnAkhiriTestIya.click();
//		test4.log(Status.PASS, "Menghentikan test Accurate berhasil");
		
//		MobileElement btnProactive			= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
		btnProactive.click();
		test4.log(Status.INFO, "Proactive");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		MobileElement btnBatalTest 			= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"));
		btnBatalTest.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		test4.log(Status.PASS, "Tombol Batal Test Proactive berhasil");
//		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
//		btnProactive.click();
//		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
//		MobileElement btnMulaiUjian 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"));
//		btnMulaiUjian.click();
		test4.log(Status.PASS, "Tombol Pilihan Test Proactive berhasil");
		
//		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
//		touchAction.tap(TapOptions.tapOptions()
//		.withPosition(PointOption.point(x, y)).withTapsCount(count));
//		touchAction.perform();
//		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
//		btnAkhiriTestIya.click();
//		test4.log(Status.PASS, "Menghentikan test Proactive berhasil");
		
//		MobileElement btnLogout 			= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));	
		btnLogout.click();
		MobileElement btnLogoutIya 			= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"));
//		MobileElement btnLogoutTidak 		= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"));		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		btnLogoutIya.click();
		test4.log(Status.PASS, "Log out berhasil");
		
		test4.log(Status.PASS, "Test Page Berhasil");

	}
		
}

