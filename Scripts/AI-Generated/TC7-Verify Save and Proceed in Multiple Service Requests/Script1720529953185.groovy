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

"Step 2: Click on span bannerButton"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/span_bannerButton'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2: Click on span bannerButton.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on button myDocuments -> Navigate to page '/admin/personal-profile/documents'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_myDocuments'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4: Click on button myDocuments - Navigate to page adminpersonal-profiledocuments.png')

"Step 5: Click on button myPassword"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/personal-profile/documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_personal_profile_documents/button_myPassword'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5: Click on button myPassword.png')

"Step 6: Click on button myProfile"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/personal-profile/documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_personal_profile_documents/button_myProfile'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6: Click on button myProfile.png')

"Step 7: Click on button myDocuments"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/personal-profile/documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_personal_profile_documents/button_myDocuments'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7: Click on button myDocuments.png')

"Step 8: Click on p uploadDocument"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/personal-profile/documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_personal_profile_documents/p_uploadDocument'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8: Click on p uploadDocument.png')

"Step 9: Click on input 1"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/personal-profile/documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_personal_profile_documents/input_1'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9: Click on input 1.png')

"Step 10: Click on p uploadDocument"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/personal-profile/documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_personal_profile_documents/p_uploadDocument_1'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10: Click on p uploadDocument.png')

"Step 11: Click on input 2"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/personal-profile/documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_personal_profile_documents/input_2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11: Click on input 2.png')

"Step 12: Click on div uploadDocument"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/personal-profile/documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_personal_profile_documents/div_uploadDocument'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12: Click on div uploadDocument.png')

"Step 13: Click on input 3"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/personal-profile/documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_personal_profile_documents/input_3'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13: Click on input 3.png')

"Step 14: Click on button saveChanges"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/personal-profile/documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_personal_profile_documents/button_saveChanges'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14: Click on button saveChanges.png')

"Step 15: Click on button ok -> Navigate to page 'admin/personal-profile'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/personal-profile/documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_personal_profile_documents/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15: Click on button ok - Navigate to page adminpersonal-profile.png')

"Step 16: Click on link serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/personal-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_personal_profile/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16: Click on link serviceRequest.png')

"Step 17: Select program options and proceed to next steps"

selectProgramOptionsAndProceed.execute()

"Step 18: Click on div dialog"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/div_dialog'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 18: Click on div dialog.png')

"Step 19: Click on button ok -> Navigate to page '/admin/my-applications/government-program-application'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 19: Click on button ok - Navigate to page adminmy-applicationsgovernment-program-application.png')

"Step 20: Click on link serviceRequest -> Navigate to page 'admin/application-create'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/my-applications/government-program-application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications_government_program_application/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 20: Click on link serviceRequest - Navigate to page adminapplication-create.png')

"Step 21: Click on item posts"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/item_posts'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 21: Click on item posts.png')

"Step 22: Click on link contacts -> Navigate to page 'admin/contacts'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_contacts'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 22: Click on link contacts - Navigate to page admincontacts.png')

"Step 23: Click on div serviceRequest"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/div_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 23: Click on div serviceRequest.png')

"Step 24: Click on link adminHome"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 24: Click on link adminHome.png')

"Step 25: Enter contact details, send a message, and close confirmation"

enterContactDetailsSendMessageAndClose.execute(data_path_0, Integer.valueOf(index_0))

"Step 26: Click on span close"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 26: Click on span close.png')

"Step 27: Click on link adminHome"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 27: Click on link adminHome.png')

"Step 28: Enter contact details, send a message, and close confirmation"

enterContactDetailsSendMessageAndClose.execute(data_path_1, Integer.valueOf(index_1))

"Step 29: Click on div dialog"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/div_dialog'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 29: Click on div dialog.png')

"Step 30: Click on span close"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 30: Click on span close.png')

"Step 31: Click on div serviceRequestPostsContacts"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/div_serviceRequestPostsContacts'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 31: Click on div serviceRequestPostsContacts.png')

"Step 32: Click on link adminHome -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 32: Click on link adminHome - Navigate to page adminhome.png')

"Step 33: Click on button accessHere -> Navigate to page 'admin/information-entity-registration'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_accessHere'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 33: Click on button accessHere - Navigate to page admininformation-entity-registration.png')

"Step 34: Click on button registerEntity -> Navigate to page '/admin/application-create/business-registration/entity-registration'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/information-entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_information_entity_registration/button_registerEntity'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 34: Click on button registerEntity - Navigate to page adminapplication-createbusiness-registrationentity-registration.png')

"Step 35: Click on input selectService"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_selectService'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 35: Click on input selectService.png')

"Step 36: Click on input selectSubservice"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_selectSubservice'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 36: Click on input selectSubservice.png')

"Step 37: Click on div selectServiceSelectSubservice"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/div_selectServiceSelectSubservice'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 37: Click on div selectServiceSelectSubservice.png')

"Step 38: Click on input selectService"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_selectService'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 38: Click on input selectService.png')

"Step 39: Click on input selectSubservice"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_selectSubservice'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 39: Click on input selectSubservice.png')

"Step 40: Click on div 2ComplementaryData"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/div_2ComplementaryData'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 40: Click on div 2ComplementaryData.png')

"Step 41: Click on div 2ComplementaryData"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/div_2ComplementaryData'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 41: Click on div 2ComplementaryData.png')

"Step 42: Click on button next"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 42: Click on button next.png')

"Step 43: Click on input cd340"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd340'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 43: Click on input cd340.png')

"Step 44: Enter input value in input cd340"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd340'), input_cd_340)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 44: Enter input value in input cd340.png')

"Step 45: Click on div whatIsTheTaxIdNumberOf"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/div_whatIsTheTaxIdNumberOf'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 45: Click on div whatIsTheTaxIdNumberOf.png')

"Step 46: Click on input cd341"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd341'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 46: Click on input cd341.png')

"Step 47: Enter input value in input cd341"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd341'), input_cd_341)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 47: Enter input value in input cd341.png')

"Step 48: Click on input cd342"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd342'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 48: Click on input cd342.png')

"Step 49: Enter input value in input cd342"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd342'), input_cd_342)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 49: Enter input value in input cd342.png')

"Step 50: Click on input cd343"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd343'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 50: Click on input cd343.png')

"Step 51: Click on input cd343"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd343'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 51: Click on input cd343.png')

"Step 52: Enter input value in input cd343"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd343'), input_cd_343)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 52: Enter input value in input cd343.png')

"Step 53: Click on input cd344"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd344'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 53: Click on input cd344.png')

"Step 54: Enter input value in input cd344"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd344'), input_cd_344)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 54: Enter input value in input cd344.png')

"Step 55: Click on button next -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/button_next_1'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 55: Click on button next - Navigate to page adminhome.png')

"Step 56: Click on button accessHere -> Navigate to page 'admin/information-entity-dissolution'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_accessHere_1'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 56: Click on button accessHere - Navigate to page admininformation-entity-dissolution.png')

"Step 57: Click on button dissolveEntity -> Navigate to page 'admin/application-create/business-registration/entity-dissolution'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/information-entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_information_entity_dissolution/button_dissolveEntity'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 57: Click on button dissolveEntity - Navigate to page adminapplication-createbusiness-registrationentity-dissolution.png')

"Step 58: Click on input selectService"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_selectService'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 58: Click on input selectService.png')

"Step 59: Click on input selectSubservice"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_selectSubservice'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 59: Click on input selectSubservice.png')

"Step 60: Click on div serviceRequestPostsContacts"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/div_serviceRequestPostsContacts'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 60: Click on div serviceRequestPostsContacts.png')

"Step 61: Click on button next"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 61: Click on button next.png')

"Step 62: Click on input cd340"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd340'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 62: Click on input cd340.png')

"Step 63: Enter input value in input cd340"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd340'), input_cd_320)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 63: Enter input value in input cd340.png')

"Step 64: Click on input cd341"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd341'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 64: Click on input cd341.png')

"Step 65: Enter input value in input cd341"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd341'), input_cd_321)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 65: Enter input value in input cd341.png')

"Step 66: Click on input cd342"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd342'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 66: Click on input cd342.png')

"Step 67: Enter input value in input cd342"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd342'), input_cd_322)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 67: Enter input value in input cd342.png')

"Step 68: Click on input cd343"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd343'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 68: Click on input cd343.png')

"Step 69: Enter input value in input cd343"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/input_cd343'), input_cd_323)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 69: Enter input value in input cd343.png')

"Step 70: Click on form object"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/form_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 70: Click on form object.png')

"Step 71: Click on button next -> Navigate to page 'admin/application-create'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create/business-registration/entity-dissolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create_business_registration_entity/button_next_1'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 71: Click on button next - Navigate to page adminapplication-create.png')

"Step 72: Click on link adminHome -> Navigate to page 'admin/home'"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 72: Click on link adminHome - Navigate to page adminhome.png')

"Step 73: Click on link adminHome"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_adminHome'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 73: Click on link adminHome.png')

"Step 74: Click on button userMenu"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/button_userMenu'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 74: Click on button userMenu.png')

"Step 75: Click on span signOut -> Navigate to page ''"

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/span_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 75: Click on span signOut - Navigate to page .png')

"Step 76: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify Save and Proceed in Multiple Service Requests_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
