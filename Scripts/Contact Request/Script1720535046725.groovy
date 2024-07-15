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

WebUI.click(findTestObject('Contact Details/a_Contacts'))

WebUI.setText(findTestObject('Contact Details/input_Email_email'), 'teste@teste.pt')

WebUI.setText(findTestObject('Contact Details/input_Name_name'), 'Nome')

WebUI.setText(findTestObject('Contact Details/input_Phone Number_phone'), '910000000')

WebUI.setText(findTestObject('Contact Details/input_Surname_surname'), 'Apelido')

WebUI.setText(findTestObject('Contact Details/textarea_Message_message'), 'This is a test message, disregard please.')

WebUI.click(findTestObject('Contact Details/button_Send'))

WebUI.click(findTestObject('Contact Details/svg_Sign Out_MuiSvgIcon-root'))

