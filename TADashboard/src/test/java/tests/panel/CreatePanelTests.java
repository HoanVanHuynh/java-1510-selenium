package tests.panel;

import com.logigear.driver.DriverUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.LoginPage;
import page_objects.PanelPage;
import tests.BaseTest;
import utils.common.Constants;
import utils.helper.DataHelper;
import utils.helper.Logger;

public class CreatePanelTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    PanelPage panelPage = new PanelPage();

    @BeforeMethod
    public void precondition() {
        Logger.step("Login with a valid user");
        loginPage.login(Constants.VALID_USERNAME, "");
    }

    @Test(description = "Verify that newly created panel are populated and sorted correctly in Panel lists under 'Choose panels' form")
    public void tc53_NewlyCreatedPanel() {
        Logger.step("Click on Add Page button");
        panelPage.selectGlobalSettingMenu("Add Page");

        Logger.step("Create a new page");
        String name = DataHelper.getRandomString(6);
        panelPage.addPage(name);

        Logger.step("Click on Choose Panel button");
        panelPage.clickChoosePanelsButton();

        Logger.step("Click on Create New Panel button");
        panelPage.clickCreateNewPanelButton();

        Logger.step("Enter all required fields on Add New Panel page and click on OK button");
        panelPage.addNewPanel("Panel 25", "  Name");

        Logger.step("Enter invalid height into Height field and click on OK button");
        panelPage.addPanelConfiguration("200");

        Logger.step("Get alert text");
        String actualPanelHeightMsg = DriverUtils.getAlertText();
        String expectedPanelHeightMsg = "Panel height must be greater than or equal to 300 and less than or equal to 800.";

        Logger.step("Verify that panel height message displays correctly");
        Assert.assertEquals(actualPanelHeightMsg, expectedPanelHeightMsg, "Panel height displays incorrectly");

        Logger.step("Close Warning Message box");
        DriverUtils.acceptAlert();

        Logger.step("Enter valid height into Height field and click on OK button");
        panelPage.addPanelConfiguration("400");

        Logger.step("Verify that user is able to edit Height field to anything apart from integer number with in 300-800 range");
        Assert.assertTrue(panelPage.isNewPanelNameDisplayed(), "New panel name is displayed incorrectly");
    }
}