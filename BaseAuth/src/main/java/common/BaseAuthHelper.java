package common;

import org.openqa.selenium.JavascriptExecutor;



public class BaseAuthHelper {
	public static void executeJavaScriptForBaseAuth(String username,
			String password) {
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) JirapEnvironmentSetter.driver;
		javaScriptExecutor.executeScript("document.write(\'Hello World\')");
	}
}
