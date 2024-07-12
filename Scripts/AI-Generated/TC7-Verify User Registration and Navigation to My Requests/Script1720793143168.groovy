import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import katalon.common.selectServiceAndSubservice
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

"Step 3: Click on button signIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3: Click on button signIn.png')

"Step 4: Click on link registerHere -> Navigate to page 'auth/register'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/link_registerHere'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4: Click on link registerHere - Navigate to page authregister.png')

"Step 5: Click on button register -> Navigate to page 'auth/individual-user-registration'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/register?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_register/button_register'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5: Click on button register - Navigate to page authindividual-user-registration.png')

"Step 6: Click on button welcomeSignIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/individual-user-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_individual_user_registration/button_welcomeSignIn'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6: Click on button welcomeSignIn.png')

"Step 7: Click on button signIn -> Navigate to page 'admin/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/individual-user-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_individual_user_registration/button_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7: Click on button signIn - Navigate to page adminhome.png')

"Step 8: Click on button userDropdownButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_userDropdownButton'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8: Click on button userDropdownButton.png')

"Step 9: Click on span myComplaints -> Navigate to page 'admin/my-complaints'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/span_myComplaints'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9: Click on span myComplaints - Navigate to page adminmy-complaints.png')

"Step 10: Click on button userDropdownButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-complaints?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_complaints/button_userDropdownButton'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10: Click on button userDropdownButton.png')

"Step 11: Click on span myRequests -> Navigate to page 'admin/my-applications'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-complaints?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_complaints/span_myRequests'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11: Click on span myRequests - Navigate to page adminmy-applications.png')

"Step 12: Click on link adminHome -> Navigate to page 'admin/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12: Click on link adminHome - Navigate to page adminhome.png')

"Step 13: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13: Click on link serviceRequest.png')

"Step 14: Select service and subservice"

selectServiceAndSubservice.execute()

"Step 15: Click on div serviceRequestPostsContacts74MaryJaneUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_serviceRequestPostsContacts74MaryJaneUser'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15: Click on div serviceRequestPostsContacts74MaryJaneUser.png')

"Step 16: Click on link adminHome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16: Click on link adminHome.png')

"Step 17: Click on button leave -> Navigate to page 'admin/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_leave'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 17: Click on button leave - Navigate to page adminhome.png')

"Step 18: Click on button seeMore -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_seeMore'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 18: Click on button seeMore - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify User Registration and Navigation to My Requests_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}