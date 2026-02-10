import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://siakad.umj.ac.id/gate/login', FailureHandling.OPTIONAL)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('konten dashboard login/Page_Sistem Informasi Akademik/h4_Selamat Datang'), 'SELAMAT DATANG')

WebUI.verifyElementText(findTestObject('konten dashboard login/Page_Sistem Informasi Akademik/h2_Sistem Informasi Akademik'), 
    'Sistem Informasi Akademik')

WebUI.verifyElementText(findTestObject('konten dashboard login/Page_Sistem Informasi Akademik/b_Universitas Muhammadiyah Jakarta'), 
    'Universitas Muhammadiyah Jakarta')

WebUI.verifyElementVisible(findTestObject('konten dashboard login/Page_Sistem Informasi Akademik/img_logo'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('konten dashboard login/Page_Sistem Informasi Akademik/span_Masuk dan Verifikasi'), 
    'Masuk dan Verifikasi')

WebUI.verifyElementText(findTestObject('konten dashboard login/Page_Sistem Informasi Akademik/p_Baru Nikmati kemudahan sistem autentikasi tun'), 
    'Baru! Nikmati kemudahan sistem autentikasi tunggal untuk mengakses semua layanan dengan satu akun.')

WebUI.verifyElementText(findTestObject('konten dashboard login/Page_Sistem Informasi Akademik/strong_Email_akun pengguna'), 
    'Email/akun pengguna')

WebUI.verifyElementText(findTestObject('konten dashboard login/Page_Sistem Informasi Akademik/strong_Password'), 'Password')

WebUI.verifyElementText(findTestObject('konten dashboard login/Page_Sistem Informasi Akademik/span_Powered By'), 'Powered By')

WebUI.verifyElementVisible(findTestObject('konten dashboard login/Page_Sistem Informasi Akademik/img_img'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

