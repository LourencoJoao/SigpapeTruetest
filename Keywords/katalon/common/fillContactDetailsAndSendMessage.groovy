package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class fillContactDetailsAndSendMessage {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link contacts -> Navigate to page 'admin/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_my_applications/link_contacts'))
        
        "Step 2: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_admin/input_name'), data['var_1_input_name'])
        
        "Step 3: Enter input value in input surname"
        
        WebUI.setText(findTestObject('AI-Generated/Page_admin/input_surname'), data['var_2_input_surname'])
        
        "Step 4: Enter input value in input phone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_admin/input_phone'), data['var_3_input_phone'])
        
        "Step 5: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_admin/input_email'), data['var_4_input_email'])
        
        "Step 6: Enter input value in textarea message"
        
        WebUI.setText(findTestObject('AI-Generated/Page_admin/textarea_message'), data['var_5_textarea_message'])
        
        "Step 7: Click on button send"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_send'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['var_1_input_name'] = testData.getValue('var_1_input_name', rowIndex)
        data['var_2_input_surname'] = testData.getValue('var_2_input_surname', rowIndex)
        data['var_3_input_phone'] = testData.getValue('var_3_input_phone', rowIndex)
        data['var_4_input_email'] = testData.getValue('var_4_input_email', rowIndex)
        data['var_5_textarea_message'] = testData.getValue('var_5_textarea_message', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['var_1_input_name'] = 'default_data'
        data['var_2_input_surname'] = 'default_data'
        data['var_3_input_phone'] = 'default_data'
        data['var_4_input_email'] = 'default_data'
        data['var_5_textarea_message'] = 'default_data'
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

