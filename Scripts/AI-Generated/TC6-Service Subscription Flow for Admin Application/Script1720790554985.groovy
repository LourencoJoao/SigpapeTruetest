import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.selectServiceAndSubservice

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to auth/home"

TrueTestScripts.navigate("auth/home")

"Step 2: Click on div welcomeToOneStop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/div_welcomeToOneStop'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2: Click on div welcomeToOneStop.png')

"Step 3: Click on button welcomeSignIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_welcomeSignIn'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3: Click on button welcomeSignIn.png')

"Step 4: Login into Application"

TrueTestScripts.login()

"Step 5: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5: Click on link serviceRequest.png')

"Step 6: Select a service and subservice by navigating through options"

selectServiceAndSubservice.execute()

"Step 7: Click on button subscribe -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_subscribe'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7: Click on button subscribe - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Service Subscription Flow for Admin Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}