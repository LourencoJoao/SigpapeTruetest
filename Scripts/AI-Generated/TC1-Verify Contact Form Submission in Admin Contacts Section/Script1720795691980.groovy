import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts as TrueTestScripts
import katalon.common.fillContactFormAndSendMessage as fillContactFormAndSendMessage

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
'Step 4: Click on link contacts'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))

'Step 5: Fill contact form and send message'
fillContactFormAndSendMessage.execute(data_path_0, Integer.valueOf(index_0))

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/contacts?/?(?:#.*)?(?:\\?.*)?$', true)
'Step 6: Click on span close -> Navigate to page \'\''
WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/span_close'))

'Step 7: Take full page screenshot as checkpoint'
WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Contact Form Submission in Admin Contacts Section_visual_checkpoint')

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

