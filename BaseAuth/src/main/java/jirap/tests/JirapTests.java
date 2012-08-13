package jirap.tests;

import org.testng.annotations.Test;

import jirap.flows.JirapBasicFlows;

public class JirapTests {
	@Test(groups = { "1" })
	public void testLoggingIntoJirap() {
		JirapBasicFlows jirapBasicFlows = new JirapBasicFlows();
		jirapBasicFlows.logIntoJirap("srmohan", "src-1234");
	}
}
