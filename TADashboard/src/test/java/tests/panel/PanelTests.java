package tests.panel;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LoginPage;
import page_objects.PanelPage;
import tests.BaseTest;
import utils.common.Constants;
import utils.helper.DataHelper;
import utils.helper.Logger;

public class PanelTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    PanelPage panelPage = new PanelPage();

    @Test(description = "Verify that all 'Data Labels' check boxes are enabled and disabled correctly corresponding to each type of 'Chart Type'")
    public void tc040_VerifyThatAllDataLabelsCorrectlyToEachChartType() {
        Logger.step("Login with a valid user");
        loginPage.login(Constants.VALID_USERNAME, "");

        Logger.step("Click 'Add Page' button");
        panelPage.selectGlobalSettingMenu("Add Page");

        Logger.step("Create New page");
        String name = DataHelper.getRandomString(6);
        panelPage.addPage(name);

        Logger.step("Click 'Choose Panels' button");
        panelPage.clickChoosePanelsButton();

        Logger.step("Click 'Create new panel' button");
        panelPage.clickCreateNewPanelButton();

        Logger.step("Select 'Pie' chart type");
        panelPage.selectChartType("Pie");

        Logger.verify("Verify that 'Categories' checkbox is disabled");
        Assert.assertTrue(panelPage.isCategoriesCheckBoxDisabled(), "'Categories' checkbox should be disabled after select 'Pie' chart type");

        Logger.verify("Verify that 'Series' checkbox is enabled");
        Assert.assertFalse(panelPage.isSeriesCheckBoxDisabled(), "'Series' checkbox should be enabled after select 'Pie' chart type");

        Logger.verify("Verify that 'Value' checkbox is enabled");
        Assert.assertFalse(panelPage.isValueCheckBoxDisabled(), "'Value' checkbox should be enabled after select 'Pie' chart type");

        Logger.verify("Verify that 'Percentage' checkbox is enabled");
        Assert.assertFalse(panelPage.isPercentageCheckBoxDisabled(), "'Percentage' checkbox should be enabled after select 'Pie' chart type");

        Logger.step("Select 'Single Bar' chart type");
        panelPage.selectChartType("Single Bar");

        Logger.verify("Verify that 'Categories' checkbox is disabled");
        Assert.assertTrue(panelPage.isCategoriesCheckBoxDisabled(), "'Categories' checkbox should be disabled after select 'Single Bar' chart type");

        Logger.verify("Verify that 'Series' checkbox is enabled");
        Assert.assertFalse(panelPage.isSeriesCheckBoxDisabled(), "'Series' checkbox should be enabled after select 'Single Bar' chart type");

        Logger.verify("Verify that 'Value' checkbox is enabled");
        Assert.assertFalse(panelPage.isValueCheckBoxDisabled(), "'Value' checkbox should be enabled after select 'Single Bar' chart type");

        Logger.verify("Verify that 'Percentage' checkbox is enabled");
        Assert.assertFalse(panelPage.isPercentageCheckBoxDisabled(), "'Percentage' checkbox should be enabled after select 'Single Bar' chart type");

        Logger.step("Select 'Stacked Bar' chart type");
        panelPage.selectChartType("Stacked Bar");

        Logger.verify("Verify that 'Categories' checkbox is enabled");
        Assert.assertFalse(panelPage.isCategoriesCheckBoxDisabled(), "'Categories' checkbox should be enabled after select 'Stacked Bar' chart type");

        Logger.verify("Verify that 'Series' checkbox is enabled");
        Assert.assertFalse(panelPage.isSeriesCheckBoxDisabled(), "'Series' checkbox should be enabled after select 'Stacked Bar' chart type");

        Logger.verify("Verify that 'Value' checkbox is enabled");
        Assert.assertFalse(panelPage.isValueCheckBoxDisabled(), "'Value' checkbox should be enabled after select 'Stacked Bar' chart type");

        Logger.verify("Verify that 'Percentage' checkbox is enabled");
        Assert.assertFalse(panelPage.isPercentageCheckBoxDisabled(), "'Percentage' checkbox should be enabled after select 'Stacked Bar' chart type");

        Logger.step("Select 'Group Bar' chart type");
        panelPage.selectChartType("Group Bar");

        Logger.verify("Verify that 'Categories' checkbox is enabled");
        Assert.assertFalse(panelPage.isCategoriesCheckBoxDisabled(), "'Categories' checkbox should be enabled after select 'Group Bar' chart type");

        Logger.verify("Verify that 'Series' checkbox is enabled");
        Assert.assertFalse(panelPage.isSeriesCheckBoxDisabled(), "'Series' checkbox should be enabled after select 'Group Bar' chart type");

        Logger.verify("Verify that 'Value' checkbox is enabled");
        Assert.assertFalse(panelPage.isValueCheckBoxDisabled(), "'Value' checkbox should be enabled after select 'Group Bar' chart type");

        Logger.verify("Verify that 'Percentage' checkbox is enabled");
        Assert.assertFalse(panelPage.isPercentageCheckBoxDisabled(), "'Percentage' checkbox should be enabled after select 'Group Bar' chart type");

        Logger.step("Select 'Line' chart type");
        panelPage.selectChartType("Line");

        Logger.verify("Verify that 'Categories' checkbox is disabled");
        Assert.assertTrue(panelPage.isCategoriesCheckBoxDisabled(), "'Categories' checkbox should be disabled after select 'Line' chart type");

        Logger.verify("Verify that 'Series' checkbox is disabled");
        Assert.assertTrue(panelPage.isSeriesCheckBoxDisabled(), "'Series' checkbox should be disabled after select 'Line' chart type");

        Logger.verify("Verify that 'Value' checkbox is disabled");
        Assert.assertTrue(panelPage.isValueCheckBoxDisabled(), "'Value' checkbox should be disabled after select 'Line' chart type");

        Logger.verify("Verify that 'Percentage' checkbox is disabled");
        Assert.assertTrue(panelPage.isPercentageCheckBoxDisabled(), "'Percentage' checkbox should be disabled after select 'Line' chart type");
    }
}
