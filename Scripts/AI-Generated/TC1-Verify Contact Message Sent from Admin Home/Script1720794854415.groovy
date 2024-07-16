import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts as TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.fillContactDetailsAndSendMessage as fillContactDetailsAndSendMessage
import internal.GlobalVariable as GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

'Step 1: Navigate to auth/home'
TrueTestScripts.navigate('auth/home')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/auth/home?/?(?:#.*)?(?:\\?.*)?$', true)
'Step 2: Click on button welcomeSignIn'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_auth_home/button_welcomeSignIn'))

'Step 3: Login into Application'
TrueTestScripts.login()

'Step 4: Fill in contact details and send a message'
fillContactDetailsAndSendMessage.execute(data_path_0, Integer.valueOf(index_0))

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)
'Step 5: Click on span close -> Navigate to page \'\''
WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_close'))

'Step 6: Take full page screenshot as checkpoint'
WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Contact Message Sent from Admin Home_visual_checkpoint')

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

