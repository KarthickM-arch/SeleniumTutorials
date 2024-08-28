package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {

	@Test
	public void tenthStandard() {
		System.out.println("SSLC");
	}

	@Test(enabled = false)
	public void twelfthStandard() {
		System.out.println("HSC");
	}

	//dependsOnMethods
	@Test(dependsOnMethods = "twelfthStandard")
	public void engineering() {
		System.out.println("BE");
	}
}
