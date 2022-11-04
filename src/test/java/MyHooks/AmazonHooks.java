package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before(order = 1)
	public void setup_browser(Scenario sc) {
		System.out.println("Launch Chrome browser");
		System.out.println(sc.getName());
	}
	
	@Before(order=2)
	public void setup_url() {
		System.out.println("Launch Amazon application");
	}
	
	
	@After(order=2)
	public void tearDown_close(Scenario sc) {
		System.out.println("Close the Browser");
		System.out.println(sc.getName());
	}

	@After(order=1)
	public void tearDown_logout() {
		System.out.println("Logout from the applictaion");
	}
}
