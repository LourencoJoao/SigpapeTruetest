package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectProgramAndSubProgramAndProceed {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on input formSelectProgramIdLabel"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/input_formSelectProgramIdLabel'))
        "Step 2: Click on item option1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/item_option1'))
        "Step 3: Click on input formSelectSubProgramIdLabel"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/input_formSelectSubProgramIdLabel'))
        "Step 4: Click on item mui74876Option0"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/item_mui74876Option0'))
        "Step 5: Click on button next"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_next'))
        "Step 6: Click on button next"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_next_1'))
        "Step 7: Click on button next"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_next_1'))
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

