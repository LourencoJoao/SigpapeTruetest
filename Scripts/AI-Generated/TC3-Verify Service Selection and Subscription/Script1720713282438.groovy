import internal.GlobalVariable
import katalon.common.selectServiceSubscribeAndProceed
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Login into Application"

TrueTestScripts.login()

"Step 2: Navigate to admin/*"

TrueTestScripts.navigate("admin/${GlobalVariable.admin_id}")

"Step 3: Select a service, subscribe, and proceed to the next steps"

selectServiceSubscribeAndProceed.execute()

"Step 4: Click on item option -> Navigate to page 'auth/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/item_option', ['dynamicInternalRoleOptionNameVariable': GlobalVariable.item_option_dynamicInternalRoleOptionNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4: Click on item option - Navigate to page auth.png')

"Step 5: Click on button login -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth/button_login'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5: Click on button login - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Service Selection and Subscription_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}