import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.selectProgramOptionsAndProceed
import katalon.common.selectProgramAndSubProgramInputDetailsAndProceed
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to admin/home"

TrueTestScripts.navigate("admin/home")

"Step 2: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 2: Click on link serviceRequest.png')

"Step 3: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 4: Click on button ok -> Navigate to page '/admin/my-applications/government-program-application'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4: Click on button ok - Navigate to page adminmy-applicationsgovernment-program-application.png')

"Step 5: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5: Click on link serviceRequest.png')

"Step 6: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 7: Click on button ok -> Navigate to page '/admin/my-applications/government-program-application'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7: Click on button ok - Navigate to page adminmy-applicationsgovernment-program-application.png')

"Step 8: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 8: Click on link serviceRequest.png')

"Step 9: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 10: Click on button ok -> Navigate to page '/admin/my-applications/government-program-application'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 10: Click on button ok - Navigate to page adminmy-applicationsgovernment-program-application.png')

"Step 11: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 11: Click on link serviceRequest.png')

"Step 12: Select program and sub-program options, input details, and proceed"

selectProgramAndSubProgramInputDetailsAndProceed.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 13: Click on link serviceRequest.png')

"Step 14: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 15: Click on div dialog"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_dialog'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 15: Click on div dialog.png')

"Step 16: Click on button ok -> Navigate to page '/admin/my-applications/government-program-application'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 16: Click on button ok - Navigate to page adminmy-applicationsgovernment-program-application.png')

"Step 17: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 17: Click on link serviceRequest.png')

"Step 18: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 19: Click on body object"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 19: Click on body object.png')

"Step 20: Click on button ok -> Navigate to page '/admin/my-applications/government-program-application'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 20: Click on button ok - Navigate to page adminmy-applicationsgovernment-program-application.png')

"Step 21: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 21: Click on link serviceRequest.png')

"Step 22: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 23: Click on item mui74876Option0 -> Navigate to page 'auth/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/item_mui74876Option0'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 23: Click on item mui74876Option0 - Navigate to page authhome.png')

"Step 24: Click on button login"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_login'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 24: Click on button login.png')

"Step 25: Click on header object"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/header_object'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 25: Click on header object.png')

"Step 26: Click on span bannerButton"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/span_bannerButton'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 26: Click on span bannerButton.png')

"Step 27: Login into Application"

TrueTestScripts.login()

"Step 28: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 28: Click on link serviceRequest.png')

"Step 29: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 30: Click on link adminHome"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 30: Click on link adminHome.png')

"Step 31: Click on button save -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 31: Click on button save - Navigate to page adminhome.png')

"Step 32: Click on button ok"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 32: Click on button ok.png')

"Step 33: Click on button bannerButton"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_bannerButton'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 33: Click on button bannerButton.png')

"Step 34: Click on link adminApplicationCreate"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_adminApplicationCreate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 34: Click on link adminApplicationCreate.png')

"Step 35: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 36: Click on item mui74876Option0"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/item_mui74876Option0'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 36: Click on item mui74876Option0.png')

"Step 37: Click on span bannerButton"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/span_bannerButton'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 37: Click on span bannerButton.png')

"Step 38: Click on link adminApplicationCreate"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_adminApplicationCreate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 38: Click on link adminApplicationCreate.png')

"Step 39: Click on html object"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/html_object'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 39: Click on html object.png')

"Step 40: Click on div serviceRequest -> Navigate to page 'auth/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 40: Click on div serviceRequest - Navigate to page authhome.png')

"Step 41: Click on button login"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_login'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 41: Click on button login.png')

"Step 42: Click on button welcomeSignIn"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_welcomeSignIn'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 42: Click on button welcomeSignIn.png')

"Step 43: Login into Application"

TrueTestScripts.login()

"Step 44: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 44: Click on link serviceRequest.png')

"Step 45: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 46: Click on button ok -> Navigate to page '/admin/my-applications/government-program-application'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 46: Click on button ok - Navigate to page adminmy-applicationsgovernment-program-application.png')

"Step 47: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 47: Click on link serviceRequest.png')

"Step 48: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 49: Click on button ok -> Navigate to page '/admin/my-applications/government-program-application'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 49: Click on button ok - Navigate to page adminmy-applicationsgovernment-program-application.png')

"Step 50: Click on link adminHome -> Navigate to page 'auth/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 50: Click on link adminHome - Navigate to page authhome.png')

"Step 51: Click on button login"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_login'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 51: Click on button login.png')

"Step 52: Click on span bannerButton"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/span_bannerButton'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 52: Click on span bannerButton.png')

"Step 53: Login into Application"

TrueTestScripts.login()

"Step 54: Click on button notificationsDropdownIconButton"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_notificationsDropdownIconButton'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 54: Click on button notificationsDropdownIconButton.png')

"Step 55: Click on button seeAll -> Navigate to page 'admin/notifications'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_seeAll'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 55: Click on button seeAll - Navigate to page adminnotifications.png')

"Step 56: Click on button notificationsDropdownIconButton"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/notifications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_notifications/button_notificationsDropdownIconButton'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 56: Click on button notificationsDropdownIconButton.png')

"Step 57: Click on list object"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/notifications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_notifications/list_object'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 57: Click on list object.png')

"Step 58: Click on button seeAll"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/notifications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_notifications/button_seeAll'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 58: Click on button seeAll.png')

"Step 59: Click on input formSelectOriginLabel"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/notifications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_notifications/input_formSelectOriginLabel'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 59: Click on input formSelectOriginLabel.png')

"Step 60: Click on div formSvg"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/notifications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_notifications/div_formSvg'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 60: Click on div formSvg.png')

"Step 61: Click on input search -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/notifications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_notifications/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 61: Click on input search - Navigate to page .png')

"Step 62: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Verify Notifications and Search Functionality_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
