import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.enterContactDetailsSendMessageAndClose
import katalon.common.selectProgramOptionsAndProceed
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

"Step 1: Navigate to auth/home"

TrueTestScripts.navigate("auth/home")

"Step 2: Click on button welcomeSignIn"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_welcomeSignIn'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2: Click on button welcomeSignIn.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4: Click on link serviceRequest.png')

"Step 5: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 6: Click on div serviceRequestPostsContacts17KbkatalonBeta"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_serviceRequestPostsContacts17KbkatalonBeta'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6: Click on div serviceRequestPostsContacts17KbkatalonBeta.png')

"Step 7: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7: Click on link serviceRequest.png')

"Step 8: Click on button save -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8: Click on button save - Navigate to page adminhome.png')

"Step 9: Click on button ok"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9: Click on button ok.png')

"Step 10: Click on link serviceRequest -> Navigate to page 'admin/application-create'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10: Click on link serviceRequest - Navigate to page adminapplication-create.png')

"Step 11: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11: Click on link serviceRequest.png')

"Step 12: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 13: Click on button ok -> Navigate to page '/admin/my-applications/government-program-application'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13: Click on button ok - Navigate to page adminmy-applicationsgovernment-program-application.png')

"Step 14: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14: Click on link serviceRequest.png')

"Step 15: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 16: Click on button save -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16: Click on button save - Navigate to page adminhome.png')

"Step 17: Click on button ok"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 17: Click on button ok.png')

"Step 18: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 18: Click on link serviceRequest.png')

"Step 19: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 20: Click on button save -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 20: Click on button save - Navigate to page adminhome.png')

"Step 21: Click on div yourRequestWasSaved"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/div_yourRequestWasSaved'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 21: Click on div yourRequestWasSaved.png')

"Step 22: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 22: Click on link serviceRequest.png')

"Step 23: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 24: Click on button save -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 24: Click on button save - Navigate to page adminhome.png')

"Step 25: Click on button ok"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 25: Click on button ok.png')

"Step 26: Click on div serviceRequestPosts"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/div_serviceRequestPosts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 26: Click on div serviceRequestPosts.png')

"Step 27: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 27: Click on link serviceRequest.png')

"Step 28: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 29: Click on div object"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 29: Click on div object.png')

"Step 30: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 30: Click on link serviceRequest.png')

"Step 31: Click on button leave -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_leave'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 31: Click on button leave - Navigate to page adminhome.png')

"Step 32: Click on item posts"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/item_posts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 32: Click on item posts.png')

"Step 33: Enter contact details, send a message, and close confirmation"

enterContactDetailsSendMessageAndClose.execute(data_path_0, Integer.valueOf(index_0))

"Step 34: Click on button close"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 34: Click on button close.png')

"Step 35: Click on link serviceRequest -> Navigate to page 'admin/application-create'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 35: Click on link serviceRequest - Navigate to page adminapplication-create.png')

"Step 36: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 36: Click on link contacts - Navigate to page admincontacts.png')

"Step 37: Click on link serviceRequest -> Navigate to page 'admin/application-create'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 37: Click on link serviceRequest - Navigate to page adminapplication-create.png')

"Step 38: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 38: Click on link contacts - Navigate to page admincontacts.png')

"Step 39: Click on link serviceRequest -> Navigate to page 'admin/application-create'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 39: Click on link serviceRequest - Navigate to page adminapplication-create.png')

"Step 40: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 40: Click on link contacts - Navigate to page admincontacts.png')

"Step 41: Click on link serviceRequest -> Navigate to page 'admin/application-create'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 41: Click on link serviceRequest - Navigate to page adminapplication-create.png')

"Step 42: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 42: Click on link contacts - Navigate to page admincontacts.png')

"Step 43: Click on link serviceRequest -> Navigate to page 'admin/application-create'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 43: Click on link serviceRequest - Navigate to page adminapplication-create.png')

"Step 44: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 44: Click on link contacts - Navigate to page admincontacts.png')

"Step 45: Click on link serviceRequest -> Navigate to page 'admin/application-create'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 45: Click on link serviceRequest - Navigate to page adminapplication-create.png')

"Step 46: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 46: Click on link contacts - Navigate to page admincontacts.png')

"Step 47: Click on div serviceRequestPostsContacts"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/div_serviceRequestPostsContacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 47: Click on div serviceRequestPostsContacts.png')

"Step 48: Click on span contactsContactsBasedInLisbon -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_contactsContactsBasedInLisbon'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 48: Click on span contactsContactsBasedInLisbon - Navigate to page adminhome.png')

"Step 49: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 49: Click on link contacts - Navigate to page admincontacts.png')

"Step 50: Click on span contactsContactsBasedInLisbon -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_contactsContactsBasedInLisbon'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 50: Click on span contactsContactsBasedInLisbon - Navigate to page adminhome.png')

"Step 51: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 51: Click on link contacts - Navigate to page admincontacts.png')

"Step 52: Click on span contactsContactsBasedInLisbon -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_contactsContactsBasedInLisbon'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 52: Click on span contactsContactsBasedInLisbon - Navigate to page adminhome.png')

"Step 53: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 53: Click on link contacts - Navigate to page admincontacts.png')

"Step 54: Click on span contactsContactsBasedInLisbon -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_contactsContactsBasedInLisbon'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 54: Click on span contactsContactsBasedInLisbon - Navigate to page adminhome.png')

"Step 55: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 55: Click on link contacts - Navigate to page admincontacts.png')

"Step 56: Click on span contactsContactsBasedInLisbon -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_contactsContactsBasedInLisbon'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 56: Click on span contactsContactsBasedInLisbon - Navigate to page adminhome.png')

"Step 57: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 57: Click on link contacts - Navigate to page admincontacts.png')

"Step 58: Click on span contactsContactsBasedInLisbon -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_contactsContactsBasedInLisbon'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 58: Click on span contactsContactsBasedInLisbon - Navigate to page adminhome.png')

"Step 59: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 59: Click on link contacts - Navigate to page admincontacts.png')

"Step 60: Click on span contactsContactsBasedInLisbon -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_contactsContactsBasedInLisbon'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 60: Click on span contactsContactsBasedInLisbon - Navigate to page adminhome.png')

"Step 61: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 61: Click on link contacts - Navigate to page admincontacts.png')

"Step 62: Click on span contactsContactsBasedInLisbon -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_contactsContactsBasedInLisbon'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 62: Click on span contactsContactsBasedInLisbon - Navigate to page adminhome.png')

"Step 63: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 63: Click on link contacts - Navigate to page admincontacts.png')

"Step 64: Click on span contactsContactsBasedInLisbon -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_contactsContactsBasedInLisbon'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 64: Click on span contactsContactsBasedInLisbon - Navigate to page adminhome.png')

"Step 65: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 65: Click on link contacts - Navigate to page admincontacts.png')

"Step 66: Click on span contactsContactsBasedInLisbon -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_contactsContactsBasedInLisbon'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 66: Click on span contactsContactsBasedInLisbon - Navigate to page adminhome.png')

"Step 67: Click on link contacts -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 67: Click on link contacts - Navigate to page .png')

"Step 68: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Verify Service Request Handling and Contact Management_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
