package katalon.truetest

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testcase.TestCase as TestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.testobject.TestObject as TestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

public class TrueTestScripts {
    public static void login() {
        try {
            WebUI.setText(findTestObject('Page_One Stop Shop Axians/input_Login'), '456123789')
            WebUI.setEncryptedText(findTestObject('Page_One Stop Shop Axians/input_Password'), 'A7HVxcY/1A5ahCQidKtScQ==')
            WebUI.click(findTestObject('Page_One Stop Shop Axians/button_Sign In'))
        } catch(Exception e) {
            if (e.getCause() instanceof WebElementNotFoundException) {
                KeywordUtil.logInfo(e.getMessage())
                KeywordUtil.markWarning(e.getMessage())
            } else {
                throw e
            }
        }
    }
    
    public static void navigate(String path) {
        String applicationDomain = GlobalVariable.application_domain;
        String queryParameters = "";
        try {
            queryParameters = GlobalVariable.query_params;
        }
        catch (Exception e) {
            KeywordUtil.logInfo(e.getMessage())
        }
        if (path == null) {
            path = "";
        }
        if (!path.startsWith("/")) {
            path = "/$path";
        }
        String url = "$applicationDomain$path";
        if (queryParameters != null && queryParameters.length() > 0) {
            url = "$url?$queryParameters";
        }
        WebUI.navigateToUrl(url);
    }
}

