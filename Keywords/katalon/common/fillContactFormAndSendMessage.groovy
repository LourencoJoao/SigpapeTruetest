package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillContactFormAndSendMessage {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on link contacts -> Navigate to page 'admin/contacts'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))
        "Step 2: Enter input value in input email"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/input_email'), data['input_email'])
        "Step 3: Enter input value in input name"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/input_name'), data['input_name'])
        "Step 4: Enter input value in input phone"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/input_phone'), data['input_phone'])
        "Step 5: Enter input value in input surname"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/input_surname'), data['input_surname'])
        "Step 6: Enter input value in textarea enterYourMessage"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/textarea_enterYourMessage'), data['textarea_message'])
        "Step 7: Click on button send"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/button_send'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['input_name'] = testData.getValue('input_name', rowIndex)
        data['input_phone'] = testData.getValue('input_phone', rowIndex)
        data['input_surname'] = testData.getValue('input_surname', rowIndex)
        data['textarea_message'] = testData.getValue('textarea_message', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_email'] = 'default_data'
        data['input_name'] = 'default_data'
        data['input_phone'] = 'default_data'
        data['input_surname'] = 'default_data'
        data['textarea_message'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

