package jirap.pages;

import common.JirapEnvironmentSetter;

public class JirapDashboardPage {

	public void open(boolean signedIn) {
		if (signedIn) {
			JirapEnvironmentSetter.driver.get("www.jirap.ebay.com");
		} else {
			// Base Auth
		}
	}
}
