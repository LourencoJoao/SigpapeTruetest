import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Login into Application"

TrueTestScripts.login()

"Step 2: Navigate to auth/home"

TrueTestScripts.navigate("auth/home")

"Step 3: Click on span bannerButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/span_bannerButton'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3: Click on span bannerButton.png')

"Step 4: Enter input value in input email -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_auth_home/input_email'), var_1_input_email)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4: Enter input value in input email - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-User Login and Verification Flow_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}