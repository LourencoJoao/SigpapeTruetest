package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class enterContactDetailsSendMessageAndClose {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on link contacts -> Navigate to page 'admin/contacts'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_home/link_contacts'))
        "Step 2: Click on div name"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/div_name'))
        "Step 3: Click on input name"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/input_name'))
        "Step 4: Enter input value in input name"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/input_name'), data['input_name'])
        "Step 5: Click on input surname"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/input_surname'))
        "Step 6: Enter input value in input surname"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/input_surname'), data['input_surname'])
        "Step 7: Click on input email"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/input_email'))
        "Step 8: Enter input value in input email"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/input_email'), data['input_email'])
        "Step 9: Click on input phone"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/input_phone'))
        "Step 10: Enter input value in input phone"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/input_phone'), data['input_phone'])
        "Step 11: Click on textarea message"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/textarea_message'))
        "Step 12: Enter input value in textarea message"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/textarea_message'), data['textarea_message'])
        "Step 13: Click on button send"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/button_send'))
        "Step 14: Click on div yourMessageHasBeenSent"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/div_yourMessageHasBeenSent'))
        "Step 15: Click on button close"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/button_close'))
        "Step 16: Click on input name"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/input_name'))
        "Step 17: Enter input value in input name"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/input_name'), data['input_name_1'])
        "Step 18: Click on input surname"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/input_surname'))
        "Step 19: Enter input value in input surname"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/input_surname'), data['input_surname_1'])
        "Step 20: Click on input email"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/input_email'))
        "Step 21: Enter input value in input email"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/input_email'), data['input_email_1'])
        "Step 22: Click on textarea message"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/textarea_message'))
        "Step 23: Enter input value in textarea message"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/textarea_message'), data['textarea_message_1'])
        "Step 24: Click on input phone"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/input_phone'))
        "Step 25: Enter input value in input phone"
        WebUI.setText(findTestObject('AI-Generated/Page_admin_contacts/input_phone'), data['input_phone_1'])
        "Step 26: Click on button send"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_contacts/button_send'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_name'] = testData.getValue('input_name', rowIndex)
        data['input_surname'] = testData.getValue('input_surname', rowIndex)
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['input_phone'] = testData.getValue('input_phone', rowIndex)
        data['textarea_message'] = testData.getValue('textarea_message', rowIndex)
        data['input_name_1'] = testData.getValue('input_name_1', rowIndex)
        data['input_surname_1'] = testData.getValue('input_surname_1', rowIndex)
        data['input_email_1'] = testData.getValue('input_email_1', rowIndex)
        data['textarea_message_1'] = testData.getValue('textarea_message_1', rowIndex)
        data['input_phone_1'] = testData.getValue('input_phone_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_name'] = 'default_data'
        data['input_surname'] = 'default_data'
        data['input_email'] = 'default_data'
        data['input_phone'] = 'default_data'
        data['textarea_message'] = 'default_data'
        data['input_name_1'] = 'default_data'
        data['input_surname_1'] = 'default_data'
        data['input_email_1'] = 'default_data'
        data['textarea_message_1'] = 'default_data'
        data['input_phone_1'] = 'default_data'
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

