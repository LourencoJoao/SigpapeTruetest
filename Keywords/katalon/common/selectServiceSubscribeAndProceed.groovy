package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectServiceSubscribeAndProceed {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input selectAservice"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/input_selectAservice'))
        
        "Step 2: Click on item option"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/item_option', ['dynamicInternalRoleOptionNameVariable': GlobalVariable.item_option_dynamicInternalRoleOptionNameVariable]))
        
        "Step 3: Click on input selectAsubservice"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/input_selectAsubservice'))
        
        "Step 4: Click on item option"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/item_option', ['dynamicInternalRoleOptionNameVariable': GlobalVariable.item_option_dynamicInternalRoleOptionNameVariable]))
        
        "Step 5: Click on button next"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_next'))
        
        "Step 6: Click on button next"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_next_1'))
        
        "Step 7: Click on button subscribe"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin/button_subscribe'))
        
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

