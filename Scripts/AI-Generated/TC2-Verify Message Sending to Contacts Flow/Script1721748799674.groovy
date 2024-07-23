import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import katalon.common.enterUserDetailsAndSendMessage

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to auth/home"

TrueTestScripts.navigate("auth/home")

"Step 2: Click on button welcomeSignIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_welcomeSignIn'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2: Click on button welcomeSignIn.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link contacts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4: Click on link contacts.png')

"Step 5: Enter user details and send a message"

enterUserDetailsAndSendMessage.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on span close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_close'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6: Click on span close - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Message Sending to Contacts Flow_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}