import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts as TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import katalon.common.selectServiceAndSubServiceInSteps as selectServiceAndSubServiceInSteps

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

'Step 1: Navigate to auth/home'
TrueTestScripts.navigate('auth/home')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)
'Step 2: Click on button welcomeSignIn'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_welcomeSignIn'))

'Step 3: Login into Application'
TrueTestScripts.login()

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)
'Step 4: Click on link serviceRequest'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

'Step 5: Select a service and sub-service in multiple steps'
selectServiceAndSubServiceInSteps.execute()

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/application-create?/?(?:#.*)?(?:\\?.*)?$', true)
'Step 6: Click on button ok -> Navigate to page \'\''
WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_ok'))

'Step 7: Take full page screenshot as checkpoint'
WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Multiple Steps Service Selection in Admin Application Creation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.SetUp
def setup() {
    WebUI.openBrowser('')

    WebUI.setViewPortSize(1920, 1080)
}

@com.kms.katalon.core.annotation.TearDown
def teardown() {
    WebUI.closeBrowser()
}

