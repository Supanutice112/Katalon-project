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

WebUI.navigateToUrl('http://54.83.90.78:8085/')

WebUI.click(findTestObject('Object Repository/Page_Homepage/a_HOME'))

WebUI.click(findTestObject('Object Repository/Page_Homepage/a_MENU'))

WebUI.click(findTestObject('Object Repository/Page_Bootstrap demo/a_SHIPPING'))

WebUI.click(findTestObject('Object Repository/Page_Shipping/a_LOCATION'))

WebUI.click(findTestObject('Object Repository/Page_LOCATION/a_MENU'))

WebUI.click(findTestObject('Object Repository/Page_Bootstrap demo/div_Specials Menu    Dessert    Sushi    Drinks'))

WebUI.click(findTestObject('Object Repository/Page_Bootstrap demo/a_Specials Menu'))

WebUI.click(findTestObject('Object Repository/Page_Bootstrap demo/a_Sushi'))

WebUI.click(findTestObject('Object Repository/Page_Bootstrap demo/a_Drinks'))

WebUI.closeBrowser()

