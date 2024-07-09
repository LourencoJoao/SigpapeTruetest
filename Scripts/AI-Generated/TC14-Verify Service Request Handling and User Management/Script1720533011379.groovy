import katalon.common.selectProgramOptionsAndProceed
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2: Click on button welcomeSignIn.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4: Click on link serviceRequest.png')

"Step 5: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 6: Click on div serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6: Click on div serviceRequest.png')

"Step 7: Click on div serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7: Click on div serviceRequest.png')

"Step 8: Click on div serviceRequestPostsContacts17KbkatalonBeta"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_serviceRequestPostsContacts17KbkatalonBeta'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8: Click on div serviceRequestPostsContacts17KbkatalonBeta.png')

"Step 9: Click on div complementaryDataNth0"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_complementaryDataNth0'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9: Click on div complementaryDataNth0.png')

"Step 10: Click on div complementaryDataNth0"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_complementaryDataNth0'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 10: Click on div complementaryDataNth0.png')

"Step 11: Click on div complementaryDataNth1"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_complementaryDataNth1'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 11: Click on div complementaryDataNth1.png')

"Step 12: Click on button userDropdownButton"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_userDropdownButton'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 12: Click on button userDropdownButton.png')

"Step 13: Click on span myRequests -> Navigate to page '/admin/my-applications'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/span_myRequests'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 13: Click on span myRequests - Navigate to page adminmy-applications.png')

"Step 14: Click on button genericButtonUndefined"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications/button_genericButtonUndefined'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 14: Click on button genericButtonUndefined.png')

"Step 15: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 15: Click on link serviceRequest.png')

"Step 16: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 17: Click on button ok -> Navigate to page '/admin/my-applications/government-program-application'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 17: Click on button ok - Navigate to page adminmy-applicationsgovernment-program-application.png')

"Step 18: Click on button seeDetails"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/button_seeDetails'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 18: Click on button seeDetails.png')

"Step 19: Click on div cesprEas202454286Nth2"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/div_cesprEas202454286Nth2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 19: Click on div cesprEas202454286Nth2.png')

"Step 20: Click on span close"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/span_close'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 20: Click on span close.png')

"Step 21: Click on button seePaymentInformation"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/button_seePaymentInformation'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 21: Click on button seePaymentInformation.png')

"Step 22: Click on span close"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/span_close'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 22: Click on span close.png')

"Step 23: Click on div serviceRequestPostsContactsHelderFigueiredo"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/div_serviceRequestPostsContactsHelderFigueiredo'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 23: Click on div serviceRequestPostsContactsHelderFigueiredo.png')

"Step 24: Click on button seePaymentInformation -> Navigate to page '/admin/edit-application/CESPR EAS202454286'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/button_seePaymentInformation'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 24: Click on button seePaymentInformation - Navigate to page adminedit-applicationCESPR EAS202454286.png')

"Step 25: Click on div serviceRequestPostsContactsHelderFigueiredo -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/edit-application/CESPR_EAS202454286?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_edit_application_CESPR_EAS202454286/div_serviceRequestPostsContactsHelderFigueiredo'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 25: Click on div serviceRequestPostsContactsHelderFigueiredo - Navigate to page .png')

"Step 26: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Verify Service Request Handling and User Management_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
