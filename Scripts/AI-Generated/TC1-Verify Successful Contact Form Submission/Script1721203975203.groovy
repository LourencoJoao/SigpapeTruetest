import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to auth/*"

TrueTestScripts.navigate("auth/${GlobalVariable.auth_id}")

"Step 2: Click on button welcomeSignIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth/button_welcomeSignIn'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2: Click on button welcomeSignIn.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link contacts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4: Click on link contacts.png')

"Step 5: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin/input_email'), var_1_input_email)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5: Enter input value in input email.png')

"Step 6: Enter input value in input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin/input_name'), var_2_input_name)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6: Enter input value in input name.png')

"Step 7: Enter input value in input phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin/input_phone'), var_3_input_phone)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7: Enter input value in input phone.png')

"Step 8: Enter input value in input surname"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin/input_surname'), var_4_input_surname)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8: Enter input value in input surname.png')

"Step 9: Enter input value in textarea message"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin/textarea_message'), var_5_textarea_message)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9: Enter input value in textarea message.png')

"Step 10: Click on button send"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_send'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10: Click on button send.png')

"Step 11: Click on span close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/span_close'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11: Click on span close - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Contact Form Submission_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}