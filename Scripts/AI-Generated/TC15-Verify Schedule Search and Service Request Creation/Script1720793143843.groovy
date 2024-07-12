import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import katalon.common.selectServiceAndSubservice
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 2: Click on button welcomeSignIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_welcomeSignIn'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 2: Click on button welcomeSignIn.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on div bannerRoleListitemSvg"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/div_bannerRoleListitemSvg'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 4: Click on div bannerRoleListitemSvg.png')

"Step 5: Click on link schedule -> Navigate to page 'admin/informationDissemination/schedule'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_schedule'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 5: Click on link schedule - Navigate to page admininformationDisseminationschedule.png')

"Step 6: Click on input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/informationDissemination/schedule?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_informationDissemination_schedule/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 6: Click on input search.png')

"Step 7: Enter input value in input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/informationDissemination/schedule?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin_informationDissemination_schedule/input_search'), var_1_input_search)

WebUI.takeScreenshot(reportLocation + '/TC15/Step 7: Enter input value in input search.png')

"Step 8: Click on div clearFiltersSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/informationDissemination/schedule?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_informationDissemination_schedule/div_clearFiltersSearch'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 8: Click on div clearFiltersSearch.png')

"Step 9: Click on input selectAn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/informationDissemination/schedule?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_informationDissemination_schedule/input_selectAn'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 9: Click on input selectAn.png')

"Step 10: Click on span open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/informationDissemination/schedule?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_informationDissemination_schedule/span_open'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 10: Click on span open.png')

"Step 11: Click on button open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/informationDissemination/schedule?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_informationDissemination_schedule/button_open'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 11: Click on button open.png')

"Step 12: Click on item mui31940Option0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/informationDissemination/schedule?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_informationDissemination_schedule/item_mui31940Option0'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 12: Click on item mui31940Option0.png')

"Step 13: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/informationDissemination/schedule?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_informationDissemination_schedule/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 13: Click on button search.png')

"Step 14: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/informationDissemination/schedule?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_informationDissemination_schedule/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 14: Click on link serviceRequest.png')

"Step 15: Select service and subservice"

selectServiceAndSubservice.execute()

"Step 16: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 16: Click on link serviceRequest.png')

"Step 17: Click on button leave -> Navigate to page 'admin/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_leave'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 17: Click on button leave - Navigate to page adminhome.png')

"Step 18: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 18: Click on link serviceRequest.png')

"Step 19: Select service and subservice"

selectServiceAndSubservice.execute()

"Step 20: Click on item mui63355Option1 -> Navigate to page 'admin/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/item_mui63355Option1', ['dynamicInternalRoleOptionNameVariable': GlobalVariable.item_mui63355Option1_dynamicInternalRoleOptionNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 20: Click on item mui63355Option1 - Navigate to page adminhome.png')

"Step 21: Click on link serviceRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 21: Click on link serviceRequest.png')

"Step 22: Select service and subservice"

selectServiceAndSubservice.execute()

"Step 23: Click on item mui63355Option1 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/item_mui63355Option1', ['dynamicInternalRoleOptionNameVariable': GlobalVariable.item_mui63355Option1_dynamicInternalRoleOptionNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 23: Click on item mui63355Option1 - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Verify Schedule Search and Service Request Creation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}