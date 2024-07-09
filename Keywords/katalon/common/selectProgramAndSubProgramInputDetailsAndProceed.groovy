package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class selectProgramAndSubProgramInputDetailsAndProceed {

	private static def execute_functional_method(Map data) {
		"Step 1: Click on input formSelectProgramIdLabel"
		WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/input_formSelectProgramIdLabel'))
		"Step 2: Click on item mui74876Option0"
		WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/item_mui74876Option0'))
		"Step 3: Click on input formSelectSubProgramIdLabel"
		WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/input_formSelectSubProgramIdLabel'))
		"Step 4: Click on item option2"
		WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/item_option2'))
		"Step 5: Click on button next"
		WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_next'))
		"Step 6: Click on input cd324"
		WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/input_cd324'))
		"Step 7: Enter input value in input cd324"
		WebUI.setText(findTestObject('AI-Generated/Page_admin_application_create/input_cd324'), data['input_cd_324'])
		"Step 8: Click on input cd325"
		WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/input_cd325'))
		"Step 9: Enter input value in input cd325"
		WebUI.setText(findTestObject('AI-Generated/Page_admin_application_create/input_cd325'), data['input_cd_325'])
		"Step 10: Click on input cd326"
		WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/input_cd326'))
		"Step 11: Enter input value in input cd326"
		WebUI.setText(findTestObject('AI-Generated/Page_admin_application_create/input_cd326'), data['input_cd_326'])
		"Step 12: Click on input cd327"
		WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/input_cd327'))
		"Step 13: Enter input value in input cd327"
		WebUI.setText(findTestObject('AI-Generated/Page_admin_application_create/input_cd327'), data['input_cd_327'])
		"Step 14: Click on button next"
		WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_next_1'))
		"Step 15: Click on button next"
		WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_application_create/button_next_1'))
	}

	private static def execute_with_data_source(String datasource, int rowIndex) {
		TestData testData = findTestData(datasource)
		Map data = [:]
		data['input_cd_324'] = testData.getValue('input_cd_324', rowIndex)
		data['input_cd_325'] = testData.getValue('input_cd_325', rowIndex)
		data['input_cd_326'] = testData.getValue('input_cd_326', rowIndex)
		data['input_cd_327'] = testData.getValue('input_cd_327', rowIndex)
		execute_functional_method(data)
	}

	private static def execute_without_data_source() {
		Map data = [:]
		data['input_cd_324'] = 'default_data'
		data['input_cd_325'] = 'default_data'
		data['input_cd_326'] = 'default_data'
		data['input_cd_327'] = 'default_data'
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

