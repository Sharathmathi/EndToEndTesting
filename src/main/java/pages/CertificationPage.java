package pages;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class CertificationPage extends PreAndPost {

	public CertificationPage(EventFiringWebDriver driver, ExtentTest Test) {
		this.driver= driver;
		this.test=test;
	}
	
	// Verify the Certifications available for Administrator
	/*
	Expected output:
	Below Certifications should be displayed
		1. Administrator
		2. Advanced Administrator
		3. CPQ Specialist
		4. Marketing Cloud Administrator
		5. Platform App Builder
	 */
	
	//Certificate
	public CertificationPage getAdministratorCertificate() {
		String adminText = getText(locateElement("link", "Administrator"));
		if(adminText.equals("Administrator"))
			System.out.println("Administrator Certification is  displayed");
		else
			System.out.println("Administrator Certification is not displayed");
		return this;
	}
	
	public CertificationPage getAdvanceAdminCertificate() {
		String advAdminText = getText(locateElement("link","Advanced Administrator"));
		if(advAdminText.equals("Advanced Administrator"))
			System.out.println("Advanced Administrator Certification is  displayed");
		else
			System.out.println("Advanced Administrator Certification is not displayed");
		return this;
	}
	
	public CertificationPage getCPQSpecialistCertificate() {
		String cpqText = getText(locateElement("link", "CPQ Specialist"));
		if(cpqText.equals("CPQ Specialist"))
			System.out.println("CPQ Specialist Certification is  displayed");
		else
			System.out.println("CPQ Specialist Certification is not displayed");
		return this;
	}
	
	public CertificationPage getMarketingCertificate() {
		String mcaAdminText = getText(locateElement("link", "Marketing Cloud Administrator"));
		if(mcaAdminText.equals("Marketing Cloud Administrator"))
			System.out.println("Marketing Cloud Administrator Certification is  displayed");
		else
			System.out.println("Marketing Cloud Administrator Certification is not displayed");
		return this;
	}
	
	public CertificationPage getPlatformCertificate() {
		String pabText = getText(locateElement("link", "Platform App Builder"));
		if(pabText.equals("Platform App Builder"))
			System.out.println("Platform App Builder Certification is  displayed");
		else
			System.out.println("Platform App Builder Certification is not displayed");
		return this;
	}
}
