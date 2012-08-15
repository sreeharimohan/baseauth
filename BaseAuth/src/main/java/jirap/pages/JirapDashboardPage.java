package jirap.pages;

import common.BaseAuthHelper;
import common.JirapEnvironmentSetter;

public class JirapDashboardPage {

	public void open(boolean signedIn, String username, String password) {
		if (signedIn) {
			JirapEnvironmentSetter.driver.get("http://www.jirap.ebay.com");
		} else {
			BaseAuthHelper.executeJavaScriptForBaseAuth("wre", "ewr");
			JirapEnvironmentSetter.driver.get("http://www.jirap.ebay.com");
		}
	}
}
