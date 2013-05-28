package jirap.flows;

import jirap.pages.JirapDashboardPage;

public class JirapBasicFlows {
	public void logIntoJirap(String username, String password) {
		JirapDashboardPage jirapDashboardPage = new JirapDashboardPage();
		jirapDashboardPage.open(true, username, password);
	}
}
