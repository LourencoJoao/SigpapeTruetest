import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.selectProgramAndSubProgramAndProceed

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

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_welcomeSignIn'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2: Click on button welcomeSignIn.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4: Click on link serviceRequest.png')

"Step 5: Select program and sub-program, then proceed to next steps"

selectProgramAndSubProgramAndProceed.execute()

"Step 6: Click on button ok -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6: Click on button ok - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Service Request Creation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
