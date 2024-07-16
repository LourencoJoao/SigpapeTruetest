import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.fillContactDetailsAndSendMessage
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2: Click on button welcomeSignIn.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4: Click on link serviceRequest.png')

"Step 5: Click on input selectProgramId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/input_selectProgramId'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5: Click on input selectProgramId.png')

"Step 6: Click on item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6: Click on item object.png')

"Step 7: Click on input selectSubserviceId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/input_selectSubserviceId'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7: Click on input selectSubserviceId.png')

"Step 8: Click on item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8: Click on item object.png')

"Step 9: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9: Click on button next.png')

"Step 10: Click on button next2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_next2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10: Click on button next2.png')

"Step 11: Click on button next2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_next2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11: Click on button next2.png')

"Step 12: Fill contact details and send a message"

fillContactDetailsAndSendMessage.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Service Request Flow with Program and Subservice Selection_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}