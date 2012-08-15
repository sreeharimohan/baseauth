package jirap.tests;

import org.testng.annotations.Test;

import common.JirapEnvironmentSetter;

import jirap.flows.JirapBasicFlows;

public class JirapTests extends JirapEnvironmentSetter{
	@Test(groups = { "1" })
	public void testLoggingIntoJirap() {
		JirapBasicFlows jirapBasicFlows = new JirapBasicFlows();
		jirapBasicFlows.logIntoJirap("srmohan", "src-1234");
	}
}
