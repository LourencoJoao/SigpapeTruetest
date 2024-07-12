import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration

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

WebUI.takeScreenshot(reportLocation + '/TC16/Step 2: Click on button welcomeSignIn.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on input selectAservice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/input_selectAservice'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 4: Click on input selectAservice.png')

"Step 5: Click on item mui63355Option1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/item_mui63355Option1', ['dynamicInternalRoleOptionNameVariable': GlobalVariable.item_mui63355Option1_dynamicInternalRoleOptionNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 5: Click on item mui63355Option1.png')

"Step 6: Click on input selectAsubservice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/input_selectAsubservice'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 6: Click on input selectAsubservice.png')

"Step 7: Click on item mui63355Option1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/item_mui63355Option1', ['dynamicInternalRoleOptionNameVariable': GlobalVariable.item_mui63355Option1_dynamicInternalRoleOptionNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 7: Click on item mui63355Option1.png')

"Step 8: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 8: Click on button next.png')

"Step 9: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_next_1'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 9: Click on button next.png')

"Step 10: Click on button subscribe"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_subscribe'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 10: Click on button subscribe.png')

"Step 11: Click on div goBackSubmit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_goBackSubmit'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 11: Click on div goBackSubmit.png')

"Step 12: Click on button next -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_next_1'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 12: Click on button next - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Verify Service Subscription and Navigation to Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}