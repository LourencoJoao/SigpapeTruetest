package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class navigateServiceRequestForm {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link serviceRequest"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/link_serviceRequest'))
        
        "Step 2: Click on input selectProgramId"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/input_selectProgramId'))
        
        "Step 3: Click on item object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/item_object', ['dynamicInternalRoleOptionNameVariable': GlobalVariable.item_object_dynamicInternalRoleOptionNameVariable, 'dynamicMuiIndex': GlobalVariable.item_object_dynamicMuiIndex, 'dynamicOptionIndex': GlobalVariable.item_object_dynamicOptionIndex]))
        
        "Step 4: Click on input selectSubserviceId"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/input_selectSubserviceId'))
        
        "Step 5: Click on item object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/item_object', ['dynamicInternalRoleOptionNameVariable': GlobalVariable.item_object_dynamicInternalRoleOptionNameVariable, 'dynamicMuiIndex': GlobalVariable.item_object_dynamicMuiIndex, 'dynamicOptionIndex': GlobalVariable.item_object_dynamicOptionIndex]))
        
        "Step 6: Click on button next"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_next'))
        
        "Step 7: Click on button next"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_next_1'))
        
        "Step 8: Click on button next"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_next_1'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
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

