import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.navigateServiceRequestForm
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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2: Click on button welcomeSignIn.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Navigate through service request form"

navigateServiceRequestForm.execute()

"Step 5: Click on button ok -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5: Click on button ok - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Service Request Form Submission_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}