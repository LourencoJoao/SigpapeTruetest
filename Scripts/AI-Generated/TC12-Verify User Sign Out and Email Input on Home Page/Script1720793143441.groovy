import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import katalon.common.selectServiceAndSubservice
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.fillContactDetailsAndSendMessage
import internal.GlobalVariable

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

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_login'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2: Click on button login.png')

"Step 3: Click on button welcomeSignIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_welcomeSignIn'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3: Click on button welcomeSignIn.png')

"Step 4: Login into Application"

TrueTestScripts.login()

"Step 5: Click on button seeAllRequests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_seeAllRequests'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5: Click on button seeAllRequests.png')

"Step 6: Fill contact details and send message"

fillContactDetailsAndSendMessage.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Click on span close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_close'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7: Click on span close.png')

"Step 8: Click on link adminHome -> Navigate to page 'admin/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8: Click on link adminHome - Navigate to page adminhome.png')

"Step 9: Click on link contacts -> Navigate to page 'admin/contacts'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9: Click on link contacts - Navigate to page admincontacts.png')

"Step 10: Click on link adminHome -> Navigate to page 'auth/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 10: Click on link adminHome - Navigate to page authhome.png')

"Step 11: Click on button login"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_login'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 11: Click on button login.png')

"Step 12: Click on button welcomeSignIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_welcomeSignIn'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 12: Click on button welcomeSignIn.png')

"Step 13: Login into Application"

TrueTestScripts.login()

"Step 14: Click on link contacts -> Navigate to page 'admin/contacts'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 14: Click on link contacts - Navigate to page admincontacts.png')

"Step 15: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 15: Click on link serviceRequest.png')

"Step 16: Select service and subservice"

selectServiceAndSubservice.execute()

"Step 17: Click on button ok -> Navigate to page '/admin/my-applications/government-program-application'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 17: Click on button ok - Navigate to page adminmy-applicationsgovernment-program-application.png')

"Step 18: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 18: Click on link serviceRequest.png')

"Step 19: Select service and subservice"

selectServiceAndSubservice.execute()

"Step 20: Click on link adminHome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 20: Click on link adminHome.png')

"Step 21: Click on button leave -> Navigate to page 'auth/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_leave'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 21: Click on button leave - Navigate to page authhome.png')

"Step 22: Click on div expiredSessionPleaseTry"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/div_expiredSessionPleaseTry'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 22: Click on div expiredSessionPleaseTry.png')

"Step 23: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 23: Click on button close.png')

"Step 24: Click on span bannerButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/span_bannerButton'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 24: Click on span bannerButton.png')

"Step 25: Login into Application"

TrueTestScripts.login()

"Step 26: Click on link contacts -> Navigate to page 'admin/contacts'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 26: Click on link contacts - Navigate to page admincontacts.png')

"Step 27: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 27: Click on link serviceRequest.png')

"Step 28: Select service and subservice"

selectServiceAndSubservice.execute()

"Step 29: Click on button ok -> Navigate to page '/admin/my-applications/government-program-application'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 29: Click on button ok - Navigate to page adminmy-applicationsgovernment-program-application.png')

"Step 30: Click on div muiGridRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/div_muiGridRoot'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 30: Click on div muiGridRoot.png')

"Step 31: Click on link serviceRequest -> Navigate to page 'admin/application-create'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 31: Click on link serviceRequest - Navigate to page adminapplication-create.png')

"Step 32: Click on div serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 32: Click on div serviceRequest.png')

"Step 33: Click on link contacts -> Navigate to page 'admin/contacts'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 33: Click on link contacts - Navigate to page admincontacts.png')

"Step 34: Click on link adminHome -> Navigate to page 'admin/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 34: Click on link adminHome - Navigate to page adminhome.png')

"Step 35: Click on div welcomeToOneStop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/div_welcomeToOneStop'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 35: Click on div welcomeToOneStop.png')

"Step 36: Click on link contacts -> Navigate to page 'admin/contacts'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 36: Click on link contacts - Navigate to page admincontacts.png')

"Step 37: Click on item posts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/item_posts'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 37: Click on item posts.png')

"Step 38: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 38: Click on link serviceRequest.png')

"Step 39: Select service and subservice"

selectServiceAndSubservice.execute()

"Step 40: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 40: Click on link serviceRequest.png')

"Step 41: Click on button leave -> Navigate to page 'admin/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_leave'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 41: Click on button leave - Navigate to page adminhome.png')

"Step 42: Click on div muiBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/div_muiBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 42: Click on div muiBackdrop.png')

"Step 43: Click on div muiBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/div_muiBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 43: Click on div muiBackdrop.png')

"Step 44: Click on div muiBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/div_muiBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 44: Click on div muiBackdrop.png')

"Step 45: Click on div muiBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/div_muiBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 45: Click on div muiBackdrop.png')

"Step 46: Click on link adminHome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 46: Click on link adminHome.png')

"Step 47: Click on button userDropdownButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_userDropdownButton'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 47: Click on button userDropdownButton.png')

"Step 48: Click on span signOut -> Navigate to page 'auth/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/span_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 48: Click on span signOut - Navigate to page authhome.png')

"Step 49: Click on span bannerButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/span_bannerButton'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 49: Click on span bannerButton.png')

"Step 50: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_auth_home/input_email'), var_1_input_email)

WebUI.takeScreenshot(reportLocation + '/TC12/Step 50: Enter input value in input email.png')

"Step 51: Click on div roleDialogDivHasTextSignInHereNoAccount -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/div_roleDialogDivHasTextSignInHereNoAccount'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 51: Click on div roleDialogDivHasTextSignInHereNoAccount - Navigate to page .png')

"Step 52: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Verify User Sign Out and Email Input on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}