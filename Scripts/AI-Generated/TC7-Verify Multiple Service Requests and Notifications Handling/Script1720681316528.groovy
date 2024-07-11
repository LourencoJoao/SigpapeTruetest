import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.selectServiceAndSubServiceOptions
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

"Step 1: Navigate to auth/home"

TrueTestScripts.navigate("auth/home")

"Step 2: Click on button login"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_login'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2: Click on button login.png')

"Step 3: Click on button welcomeSignIn"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_welcomeSignIn'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3: Click on button welcomeSignIn.png')

"Step 4: Login into Application"

TrueTestScripts.login()

"Step 5: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5: Click on link serviceRequest.png')

"Step 6: Select service and sub-service options"

selectServiceAndSubServiceOptions.execute()

"Step 7: Click on button ok -> Navigate to page '/admin/my-applications/government-program-application'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7: Click on button ok - Navigate to page adminmy-applicationsgovernment-program-application.png')

"Step 8: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8: Click on link serviceRequest.png')

"Step 9: Select service and sub-service options"

selectServiceAndSubServiceOptions.execute()

"Step 10: Click on button ok -> Navigate to page '/admin/my-applications/government-program-application'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10: Click on button ok - Navigate to page adminmy-applicationsgovernment-program-application.png')

"Step 11: Click on link adminHome -> Navigate to page 'auth/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11: Click on link adminHome - Navigate to page authhome.png')

"Step 12: Click on button login"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_login'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12: Click on button login.png')

"Step 13: Click on span bannerButton"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/span_bannerButton'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13: Click on span bannerButton.png')

"Step 14: Login into Application"

TrueTestScripts.login()

"Step 15: Click on button notificationsDropdownIconButton"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_notificationsDropdownIconButton'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15: Click on button notificationsDropdownIconButton.png')

"Step 16: Click on button seeAll -> Navigate to page 'admin/notifications'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_seeAll'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16: Click on button seeAll - Navigate to page adminnotifications.png')

"Step 17: Click on button notificationsDropdownIconButton"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/notifications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_notifications/button_notificationsDropdownIconButton'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 17: Click on button notificationsDropdownIconButton.png')

"Step 18: Click on list object"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/notifications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_notifications/list_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 18: Click on list object.png')

"Step 19: Click on button seeAll"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/notifications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_notifications/button_seeAll'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 19: Click on button seeAll.png')

"Step 20: Click on input formSelectOriginLabel"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/notifications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_notifications/input_formSelectOriginLabel'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 20: Click on input formSelectOriginLabel.png')

"Step 21: Click on div formSvg"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/notifications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_notifications/div_formSvg'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 21: Click on div formSvg.png')

"Step 22: Click on input search -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/notifications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_notifications/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 22: Click on input search - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify Multiple Service Requests and Notifications Handling_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
