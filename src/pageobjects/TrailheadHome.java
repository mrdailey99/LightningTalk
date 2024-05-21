package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="TrailheadHome"                                
     , summary=""
     , relativeUrl=""
     , connection="Trailhead"
     )             
public class TrailheadHome {

	@ButtonType()
	@FindByLabel(label = "Get Started for Free")
	public WebElement getStartedForFree;
	@TextType()
	@FindBy(xpath = "//hgf-c360nav[@id='global-nav']/header//hgf-search//img[1]")
	public WebElement Open_Search;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Search Trailhead']/following-sibling::input[@id='search-field']")
	public WebElement searchTrailhead;
	@TextType()
	@FindBy(xpath = "//a[normalize-space(.)='Salesforce App Testing with Provar']/lwc-tds-truncate//slot")
	public WebElement TrailheadLink;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Why Test in Salesforce?']")
	public WebElement whyTestInSalesforce;
	@BooleanType()
	@FindBy(xpath = "//span[contains(normalize-space(.),'D.Testing ensures')]/span[normalize-space(.)='D.']")
	public WebElement dTestingEnsuresAnyCustomAppsDeployCorrectlyIntoYourOrg;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Regression Testing']")
	public WebElement bRegressionTesting;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Check the Quiz to Earn 100 Points']")
	public WebElement checkTheQuizToEarn100Points;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Tackle the next unit']")
	public WebElement tackleTheNextUnit;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Your apps need to be retested after each new release.']")
	public WebElement bYourAppsNeedToBeRetestedAfterEachNewRelease;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Provar Automation allows you to create different test environments, test plans, and browser configurations.']")
	public WebElement aProvarAutomationAllowsYouToCreateDifferentTestEnvironmentsTestPlansAndBrowserConfigurations;
			
}
