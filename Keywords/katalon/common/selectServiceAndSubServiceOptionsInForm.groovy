package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class selectServiceAndSubServiceOptionsInForm {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input selectAserviceProgramId"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/input_selectAserviceProgramId'))
        
        "Step 2: Click on item option1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/item_option1', ['dynamicMuiIndex': GlobalVariable.item_option1_dynamicMuiIndex, 'dynamicOptionIndex': GlobalVariable.item_option1_dynamicOptionIndex, 'dynamicInternalRoleOptionNameVariable': GlobalVariable.item_option1_dynamicInternalRoleOptionNameVariable]))
        
        "Step 3: Click on input selectAsubserviceSubProgramId"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/input_selectAsubserviceSubProgramId'))
        
        "Step 4: Click on item option1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/item_option1', ['dynamicMuiIndex': GlobalVariable.item_option1_dynamicMuiIndex, 'dynamicOptionIndex': GlobalVariable.item_option1_dynamicOptionIndex, 'dynamicInternalRoleOptionNameVariable': GlobalVariable.item_option1_dynamicInternalRoleOptionNameVariable]))
        
        "Step 5: Click on button formNext"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_formNext'))
        
        "Step 6: Click on button formNext2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_formNext2'))
        
        "Step 7: Click on button formNext2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_formNext2'))
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

