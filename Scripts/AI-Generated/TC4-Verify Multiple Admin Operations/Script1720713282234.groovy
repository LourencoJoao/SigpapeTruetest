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

"Step 1: Navigate to admin/*"

TrueTestScripts.navigate("admin/${GlobalVariable.admin_id}")

"Step 2: Click on link adminHome -> Navigate to page 'auth/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2: Click on link adminHome - Navigate to page auth.png')

"Step 3: Click on button login"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth/button_login'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3: Click on button login.png')

"Step 4: Click on button welcomeSignIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth/button_welcomeSignIn'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4: Click on button welcomeSignIn.png')

"Step 5: Login into Application"

TrueTestScripts.login()

"Step 6: Click on link contacts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6: Click on link contacts.png')

"Step 7: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7: Click on link serviceRequest.png')

"Step 8: Select a service, subscribe, and proceed to the next steps"

selectServiceSubscribeAndProceed.execute()

"Step 9: Click on button ok -> Navigate to page 'admin/my-applications/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9: Click on button ok - Navigate to page adminmy-applications.png')

"Step 10: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10: Click on link serviceRequest.png')

"Step 11: Select a service, subscribe, and proceed to the next steps"

selectServiceSubscribeAndProceed.execute()

"Step 12: Click on link adminHome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12: Click on link adminHome.png')

"Step 13: Click on button leave -> Navigate to page 'auth/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_leave'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13: Click on button leave - Navigate to page auth.png')

"Step 14: Click on div expiredSessionPleaseTry"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth/div_expiredSessionPleaseTry'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14: Click on div expiredSessionPleaseTry.png')

"Step 15: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15: Click on button close.png')

"Step 16: Click on span bannerButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth/span_bannerButton'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16: Click on span bannerButton.png')

"Step 17: Login into Application"

TrueTestScripts.login()

"Step 18: Click on link contacts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 18: Click on link contacts.png')

"Step 19: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 19: Click on link serviceRequest.png')

"Step 20: Select a service, subscribe, and proceed to the next steps"

selectServiceSubscribeAndProceed.execute()

"Step 21: Click on button ok -> Navigate to page 'admin/my-applications/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 21: Click on button ok - Navigate to page adminmy-applications.png')

"Step 22: Click on div muiGridRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications/div_muiGridRoot'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 22: Click on div muiGridRoot.png')

"Step 23: Click on link serviceRequest -> Navigate to page 'admin/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 23: Click on link serviceRequest - Navigate to page admin.png')

"Step 24: Click on div serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/div_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 24: Click on div serviceRequest.png')

"Step 25: Click on link contacts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 25: Click on link contacts.png')

"Step 26: Click on link adminHome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 26: Click on link adminHome.png')

"Step 27: Click on div welcomeToOneStop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/div_welcomeToOneStop'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 27: Click on div welcomeToOneStop.png')

"Step 28: Click on link contacts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 28: Click on link contacts.png')

"Step 29: Click on item posts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/item_posts'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 29: Click on item posts.png')

"Step 30: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 30: Click on link serviceRequest.png')

"Step 31: Select a service, subscribe, and proceed to the next steps"

selectServiceSubscribeAndProceed.execute()

"Step 32: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify Multiple Admin Operations_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}