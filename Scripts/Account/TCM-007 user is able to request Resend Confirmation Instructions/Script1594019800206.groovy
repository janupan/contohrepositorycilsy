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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.urlHomepage)

WebUI.delay(5)

WebUI.click(findTestObject('Login/Page_Sample Store/a_SIGN UP'))

WebUI.switchToWindowUrl(GlobalVariable.urlRegister)

WebUI.verifyElementVisible(findTestObject('Register/Page_MAP  Registration/element_Registration'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Login/Page_MAP  Registration/button_Back to Login'), 1)

WebUI.delay(2)

WebUI.click(findTestObject('Login/Page_MAP  Registration/button_Back to Login'))

WebUI.verifyElementVisible(findTestObject('Account/Page_MAP  Midtrans/box_LOGOUT'))

WebUI.delay(2)

WebUI.click(findTestObject('Account/Page_MAP  Midtrans/button_Resend Confirmation Instructions'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Account/Page_MAP  Midtrans/box_Resend Confirmation Instructions'))

WebUI.verifyElementVisible(findTestObject('Account/Page_MAP  Midtrans/text_typeEmailResendConf'))

WebUI.delay(2)

WebUI.setText(findTestObject('Account/Page_MAP  Midtrans/inputField_emailResendConfirmationInstructions'), 'mail123@mail.com')

WebUI.delay(2)

WebUI.click(findTestObject('Account/Page_MAP  Midtrans/button_Send'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Account/Page_MAP  Midtrans/box_LOGIN'))

WebUI.verifyElementVisible(findTestObject('Account/Page_MAP  Midtrans/box_successReqResendConfirmation'), FailureHandling.STOP_ON_FAILURE)

