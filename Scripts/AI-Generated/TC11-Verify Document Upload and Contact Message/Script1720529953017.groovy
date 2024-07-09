import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import katalon.common.selectProgramOptionsAndProceed as selectProgramOptionsAndProceed
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts as TrueTestScripts
import internal.GlobalVariable as GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

'Step 1: Navigate to auth/home'
TrueTestScripts.navigate('auth/home')

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)
'Step 2: Click on div welcomeToOneStop'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/div_welcomeToOneStop'))

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)
'Step 3: Click on button welcomeSignIn'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_welcomeSignIn'))

'Step 4: Login into Application'
TrueTestScripts.login()

//WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/home?/?(?:#.*)?(?:\\?.*)?$', true)
'Step 5: Click on link serviceRequest'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_serviceRequest'))

'Step 6: Select program options and proceed to next steps'
selectProgramOptionsAndProceed.execute()

'Step 7: Take full page screenshot as checkpoint'
WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Verify Document Upload and Contact Message_visual_checkpoint')

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

