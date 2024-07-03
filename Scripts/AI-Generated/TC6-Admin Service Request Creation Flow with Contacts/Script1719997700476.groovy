import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
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

"Step 1: Navigate to https://sigpape-dev.northeurope.cloudapp.azure.com:460/auth/home"

TrueTestScripts.navigate("/auth/home")

"Step 2: Click on button welcomeSignIn"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_welcomeSignIn'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2: Click on button welcomeSignIn.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link serviceRequest -> Navigate to page 'admin/application-create'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4: Click on link serviceRequest - Navigate to page adminapplication-create.png')

"Step 5: Click on input selectAservice"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/input_selectAservice'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5: Click on input selectAservice.png')

"Step 6: Click on div serviceRequestPostsContacts17KbkatalonBeta"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_serviceRequestPostsContacts17KbkatalonBeta'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6: Click on div serviceRequestPostsContacts17KbkatalonBeta.png')

"Step 7: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7: Click on link serviceRequest.png')

"Step 8: Click on button save -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8: Click on button save - Navigate to page adminhome.png')

"Step 9: Click on button ok"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9: Click on button ok.png')

"Step 10: Click on link serviceRequest -> Navigate to page 'admin/application-create'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10: Click on link serviceRequest - Navigate to page adminapplication-create.png')

"Step 11: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11: Click on link serviceRequest.png')

"Step 12: Click on input selectAservice"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/input_selectAservice'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12: Click on input selectAservice.png')

"Step 13: Click on button ok -> Navigate to page 'admin/my-applications/*'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13: Click on button ok - Navigate to page adminmy-applications.png')

"Step 14: Click on link serviceRequest -> Navigate to page 'admin/application-create'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14: Click on link serviceRequest - Navigate to page adminapplication-create.png')

"Step 15: Click on input selectAservice -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/input_selectAservice'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15: Click on input selectAservice - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Admin Service Request Creation Flow with Contacts_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
